/**
 * RandomNumberServlet.java will generate a list of four random numbers.
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

@WebServlet("/random-numbers-servlet")
public class RandomNumberServlet extends HttpServlet {
	
    private static final long serialVersionUID = -2761074875333720953L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String doctype = "<!DOCTYPE html>";
		String content = "<html>\n" + "<head>\n" + "<title>\n" + "My Favourite Food" + "</title\n>" + "</head>\n"
				+ "<body>\n" + "<p> Four random numbers: <p>\n" + "<ul>\n";
		int NoOfRandomNumbers = 4;

		PrintWriter out = response.getWriter();

		out.print(doctype + content);

		// generate four random numbers
		for (int index = 0; index < NoOfRandomNumbers; ++index) {
			out.println("<li>" + ((int) (Math.random() * 100)) + "</li>");
		}

		out.print("</ul>\n" + "</body>\n" + "</html>");
	}
}
