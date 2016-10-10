package kim.nguyen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign-up")
public class SignUp extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        
        String header = "<!DOCTYPE html>\n";
        
        PrintWriter out = response.getWriter();
        
        out.println(header + "<HTML>\n <HEAD>\n <TITLE> Sign Up </TITLE>\n <BODY>\n" + 
                  "<H1> Thank you for singing up with us </H1><BR>\n" +
                  "<P>Name: " + request.getParameter("name") +
                  "<P>Email: " + request.getParameter("email") +
                  "</BODY>\n </HTML>");
    }
}
