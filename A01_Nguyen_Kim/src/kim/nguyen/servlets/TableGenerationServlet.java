/**
 * TableGenerationServlet.java generates an HTML table with 25 rows and 10 columns.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import kim.nguyen.utilities.ServletUtilities;

@WebServlet("/htmltable")
public class TableGenerationServlet extends HttpServlet {
	
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		
		int noOfRows = 25;
		int noOfCols = 10;
		String doctype = ServletUtilities.DOCTYPE_HTML5;
		String content = ServletUtilities.generateHTMLHeader("Table Generation");
		PrintWriter out = response.getWriter();
		
		out.println(doctype + content + "<body>\n" + "<table>");
		
		// generate HTML table
		for (int row = 0; row < noOfRows; ++row) {
			out.println("<tr>");
			
			for (int col = 0; col < noOfCols; ++col) {
				out.println("<th>" + "Row" + row + ", Col" + col + "</th>");
			}
			out.println("</tr>");
		}
		
		out.print("</table>\n" + "</body>\n" + "</html>");
	}

}
