/**
 * UserIDServlet.java demonstrates how to solve problems with multiple threads try to access to the same servlet's service
 * see Core Servlets and JavaServer Pages by Marty Hall and Larry Brown Chapter 3, p.89
 */

package kim.nguyen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kim.nguyen.utilities.ServletUtilities;

@WebServlet("/user-id")
public class UserIDServlet extends HttpServlet {
    private static final long serialVersionUID = -3389716256999755748L;
    private int nextID = 0;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType(ServletUtilities.HTML);
		PrintWriter out = response.getWriter();

		/*
		 * Avoids multiple threads access to the same service
		 */
		synchronized (this) {
			out.println(ServletUtilities.DOCTYPE_HTML5 + ServletUtilities.generateHTMLHeader("Your unique id")
					+ "<body><p> Your unique id is: " + nextID + "</p>\n</body></html>");
			nextID = nextID + 1;
		}
	}
}
