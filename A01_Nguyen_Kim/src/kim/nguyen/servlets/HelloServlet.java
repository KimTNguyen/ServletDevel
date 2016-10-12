/**
 * HelloServlet.java will prints Hello text on the screen.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
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

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType(ServletUtilities.HTML);
		PrintWriter out = response.getWriter();

		out.print(ServletUtilities.DOCTYPE_HTML5 + "<html>\n" + "<head><title>Hello</title></head>\n"
				+ "<body bgcolor=\"#FDF5E6\">\n" + "<h1>Hello</h1>\n" + "</body></html>");
	}
}
