/**
 * @see Core Servlets and JavaServer Pages, by Marty Hall and Larry Brown, p.130
 */
package kim.nguyen.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kim.nguyen.beans.InsuranceInfoBean;
import kim.nguyen.utilities.ServletUtilities;

@WebServlet("/submit-insurance-info")
public class InsuranceInfoSubmissionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        InsuranceInfoBean insuranceBean = new InsuranceInfoBean();
        try {
            BeanUtils.populate(insuranceBean, request.getParameterMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        String title = "<h1>Insurance info for " + insuranceBean.getName() + "</h1>";
        boolean isMarried = insuranceBean.isMarried();
        String content = title + "\n<ul>\n" + "<li> Employee ID: " + insuranceBean.getId() + "\n<li>Number of children: "
                + insuranceBean.getNumChildren() + "\n<li>Married: " + isMarried + "\n</ul>";
        
        response.setContentType(ServletUtilities.HTML);
        PrintWriter out = response.getWriter();
        out.println(ServletUtilities.DOCTYPE_HTML5 + ServletUtilities.generateHTMLHeader(title)
                + ServletUtilities.generateHTMLBody(content));
    }
}
