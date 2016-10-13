/**
 * ArrayInitializationServlet.java allows users to either initialize 
 * 2D dimensional array or 3D dimensional array.
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

import kim.nguyen.business.TwoDArray;
import kim.nguyen.utilities.ServletUtilities;

@WebServlet("/array-initialization")
public class ArrayInitializationServlet extends HttpServlet {

    private static final long serialVersionUID = -2902631327852933602L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String twoDimension = request.getParameter("2DArray");
        String threeDimension = request.getParameter("3DArray");
        String contenType = ServletUtilities.HTML;
        String doctype = ServletUtilities.DOCTYPE_HTML5;

        response.setContentType(contenType);

        PrintWriter out = response.getWriter();
        /*
         * Initializes 2D dimensional array using values inputed if they are
         * valid, otherwise default values will be assigned
         */
        if (twoDimension != null) {
            TwoDArray twoDArray = new TwoDArray(request.getParameter("size"), request.getParameter("lowerBound"),
                    request.getParameter("upperBound"));
            out.println(doctype + ServletUtilities.generateHTMLHeader("2D dimensional array initialization")
                    + ServletUtilities.generateHTMLBody(twoDArray.getArrayValues(twoDArray.iniTwoDArray())));
        }

        /*
         * Sends a HTML response back to client stating that the server doesn't
         * know how to construct 3D Array
         */
        if (threeDimension != null) {
            out.println(doctype + ServletUtilities.generateHTMLHeader("3D dimensional array initialization")
                    + ServletUtilities.generateHTMLBody("The server doesn't know how to construct 3D Array"));
        }
    }

}
