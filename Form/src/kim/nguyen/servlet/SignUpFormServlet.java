/**
 * SignUpFormServlet.java Handles request from clients by attaching request's information in the response.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUpFormServlet extends HttpServlet {

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String doctype = "<!DOCTYPE html>\n";

        PrintWriter out = response.getWriter();

        out.println(doctype + "<html>\n <head>\n <title> Sign Up </title>\n <body>\n"
                + "<h1> Thank you for singing up with us </h1><br>\n" + "<p>Name: " + request.getParameter("name")
                + "<p>Email: " + request.getParameter("email") + "</body>\n </html>");
    }
}
