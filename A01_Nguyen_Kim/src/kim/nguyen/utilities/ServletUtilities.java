/**
 * ServletUtilities.java Generate HTML Doctype and HTML header for servlet classes.
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.utilities;

public class ServletUtilities {
    public static final String HTML = "text/html";
    public static final String DOCTYPE_HTML5 = "<!DOCTYPE html>\n";

    public static String generateHTMLHeader(String title) {
        return "<html>\n<head>\n<title>" + title + "</title>\n</head>\n";
    }

    public static String generateHTMLBody(String content) {
        return ("<body>\n" + "<p>" + content + "</p>\n" + "</body>\n </html>");
    }

    /*
     * see see Core Servlets and JavaServer Pages, by Marty Hall and Larry Brown, p.122
     */
    public static String HTMLFilter(String input) {
        if (!hasSpecialChars(input)) {
            return input;
        }

        StringBuffer filtered = new StringBuffer(input.length());

        for (char c : input.toCharArray()) {
            switch (c) {
            case '<':
                filtered.append("&lt;");
                break;
            case '>':
                filtered.append("&gt;");
                break;
            case '"':
                filtered.append("&quot;");
                break;
            case '&':
                filtered.append("&amp;");
                break;
            default:
                filtered.append(c);
                break;
            }
        }
        return filtered.toString();
    }

    private static boolean hasSpecialChars(String input) {
        if ((input != null) && (input.length() > 0)) {
            for (char c : input.toCharArray()) {
                switch (c) {
                case '<':
                    return true;
                case '>':
                    return true;
                case '"':
                    return true;
                case '&':
                    return true;
                }
            }
        }
        
        return false;
    }
}