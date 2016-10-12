/**
 * OrderSubmissionServlet.java Reads and Responses to all the requests ending with "/submitOrder".
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */
package kim.nguyen.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/submitOrder")
public class OrderSubmissionServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String doctype = "<!DOCTYPE html>";
        String content = "<html>\n<header>\n<title>Confirm Order</title>\n</header>\n<body>\n<h1>Confirm Order</h1><p>";

        // Gets all names in the request
        Enumeration<String> paramsName = request.getParameterNames();

        PrintWriter out = response.getWriter();
        
        /*
         * Gets values according to each name and places it in the response
         */
        while (paramsName.hasMoreElements()) {
            String paramName = (String) paramsName.nextElement();
            content += "<br/>" + paramName + ": ";
            String[] paramValues = request.getParameterValues(paramName);

            if (paramValues.length == 1) {
                if (paramValues[0].trim().equals("")) {
                    content += "No Value<br/>";
                } else {
                    content += paramValues[0] + "<br/>";
                }
            } else {
                for (int index = 0; index < paramValues.length; ++index) {
                    content += "<center>" + paramValues[index] + "</center><br/>";
                }
            }
        }
        
        out.println(doctype + content);
    }
}
