/**
 * LoterryNumbersServlet.java demonstrates general initializations of a servlet.
 * see Core Servlets and JavaServer Pages by Marty Hall and Larry Brown Chapter 3, p.80
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

@WebServlet("/loterry-numbers-servlet")
public class LoterryNumbersServlet extends HttpServlet {

    private static final long serialVersionUID = 803875535301085787L;
    private int[] luckyNumbers = new int[3];

    /*
     * The init() is called only when the servlet is first loaded, before the
     * first request is processed.
     */
    public void init() throws ServletException {
        System.out.println("Init started at " + System.currentTimeMillis());

        // Initializes lucky numbers
        for (int index = 0; index < luckyNumbers.length; ++index) {
            luckyNumbers[index] = randomNum();
        }

        System.out.println("Init ended at " + System.currentTimeMillis());
    }

    private int randomNum() {
        return ((int) (Math.random() * 100));
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    public void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
        reponse.setContentType(ServletUtilities.HTML);

        PrintWriter out = reponse.getWriter();

        out.println(ServletUtilities.DOCTYPE_HTML5 + ServletUtilities.generateHTMLHeader("Your Lottery Numbers")
                + "<b> The following numbers are best numbers for you: </b>" + "<ol>\n");

        for (int index = 0; index < luckyNumbers.length; ++index) {
            out.print("<li>" + luckyNumbers[index]);
        }

        out.println("</ol>\n" + "</body>\n" + "</html>");
    }

}
