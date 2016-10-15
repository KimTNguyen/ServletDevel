/**
 * @see Core Servlets and JavaServer Pages, by Marty Hall and Larry Brown, p.139
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

import kim.nguyen.beans.BidInfoBean;
import kim.nguyen.utilities.ServletUtilities;

@WebServlet("/bid-system")
public class BidSystemServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Try to populate a bean that represents information in the form data sent
     * by the user. If this data is complete, show the results. If the form data
     * is missing or incomplete, display the HTML form that gathers the data.
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     * 
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BidInfoBean bidBean = new BidInfoBean();

        try {
            BeanUtils.populate(bidBean, request.getParameterMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        if (bidBean.isComplete()) {
            // All required form data was supplied: show result.
            showBid(response, bidBean);
        } else {
            // Form data was missing or incomplete: redisplay form.
            showEntryForm(request, response, bidBean);
        }
    }

    /*
     * All required data is present: show the results page.
     */
    private void showBid(HttpServletResponse response, BidInfoBean bean) throws IOException {
        String title = "Bid Submitted";
        String content = "<center>" + "<h1>Your bid is now active.</h1>" + "Item: " + bean.getItemID() + "<br/>"
                + "Item ID: " + bean.getItemName() + "<br/>" + "Bidder: " + bean.getBuyer() + "<br/>" + "Email: "
                + bean.getEmail() + "<br/>" + "Bid price: " + bean.getBidPrice() + "<br/>" + "Auto-increment price: "
                + bean.isAutoIncrement() + "</center>";

        response.setContentType(ServletUtilities.HTML);

        PrintWriter out = response.getWriter();
        out.println(ServletUtilities.DOCTYPE_HTML5 + ServletUtilities.generateHTMLHeader(title)
                + ServletUtilities.generateHTMLBody(content));
    }

    /*
     * If the required data is totally missing, show a blank form. If the
     * required data is partially missing, warn the user, fill in form fields
     * that already have values, and prompt user for missing fields.
     */
    private void showEntryForm(HttpServletRequest request, HttpServletResponse response, BidInfoBean bean)
            throws IOException {
        String title = "<h1>Welcome to Auctions-R-Us<br/> Please Enter Bid.</h1>\n";
        String content = title + "<form>\n" + inputElement("Item ID ", "itemID", bean.getItemID())
                + inputElement("Item Name ", "itemName", bean.getItemName())
                + inputElement("Your Name ", "buyer", bean.getBuyer())
                + inputElement("Your Email Address ", "email", bean.getEmail())
                + inputElement("Amount Bid ", "bidPrice", bean.getBidPrice())
                + inputCheckbox("Auto-increment bid to match other bidders?", "autoIncrement", bean.isAutoIncrement())
                + "<p><input type=\"submit\" value=\"Submit Bid\" /></p>\n" + "</form>\n";

        PrintWriter out = response.getWriter();

        out.println(ServletUtilities.DOCTYPE_HTML5 + ServletUtilities.generateHTMLHeader(title)
                + ServletUtilities.generateHTMLBody(content));
    }

    /*
     * Create a textfield for input, prefaced by a prompt. If this particular
     * textfield is missing a value but other fields have values (i.e., a
     * partially filled form was submitted), then add a warning telling the user
     * that this textfield is required.
     */
    private <T> String inputElement(String prompt, String name, T value) {
        String message = "<b>Required field!</b>";
        String messageField = prompt + ": " + "<input type=\"text\" name=\"" + name + "\"" + " value=\"\" />" + message
                + "<br/>\n";
        String inputField = prompt + ": " + "<input type=\"text\" name=\"" + name + "\"" + " value=\"" + value + "\"/>"
                + "<br/>";

        if (value instanceof Double) {
            if ((Double) value == 0) {
                return messageField;
            }
        }

        if (value instanceof String) {
            if (value == null || value.equals("")) {
                return messageField;
            }
        }

        return inputField;
    }

    private String inputCheckbox(String prompt, String name, boolean isCheck) {
        String result = prompt + ": " + "<input Type=\"checkbox\" name=\"" + name + "\"";

        if (isCheck) {
            result = result + " checked";
        }

        result = result + "/><br/>\n";

        return result;
    }
}
