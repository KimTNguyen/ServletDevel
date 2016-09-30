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

	public static String getHeaderAndTitle(String title) {
		return "<html>\n<head>\n<title>" + title + "</title>\n</head>\n";
	}
}