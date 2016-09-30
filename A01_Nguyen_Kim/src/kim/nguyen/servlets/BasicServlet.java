/**
 * BasicServlet.java will prints my name on the screen.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

/**
 * The BasicServlet class will override print my name on the screen when
 * requested.
 */
@WebServlet("/name")
public class BasicServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String doctype = "<!DOCTYPE html>";
		String content = "<html>\n" + "<head>\n" + "<title> Display my name </title>\n" + "</head>\n" + "<body>\n"
				+ "<p> My name is Kim Nguyen </p>\n" + "</body>\n" + "</html>";
		out.println(doctype + content);
	}
}
