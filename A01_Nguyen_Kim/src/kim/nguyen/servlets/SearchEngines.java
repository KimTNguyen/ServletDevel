/**
 * @see Core Servlets and JavaServer Pages, by Marty Hall and Larry Brown, p.187
 */

package kim.nguyen.servlets;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kim.nguyen.business.SearchEngineProcess;

@WebServlet("/search-engines")
public class SearchEngines extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String searchString = request.getParameter("searchString");
	String searchEngineName = request.getParameter("searchEngine");

	if ((searchString == null) || (searchString.length() == 0)) {
	    reportProblem(response, "Missing search string");
	    return;
	}

	if ((searchEngineName == null) || (searchEngineName.length() == 0)) {
	    reportProblem(response, "Missing search engine name");
	    return;
	}

	/*
	 * Encodes the string to hex values to pass to another server. This will
	 * help to avoid characters that are illegal in the url
	 */
	searchString = URLEncoder.encode(searchString, "US-ASCII");

	SearchEngineProcess process = new SearchEngineProcess(searchEngineName, searchString);

	String searchURL = process.makeURL();

	if (searchURL != null) {
	    response.sendRedirect(searchURL);
	} else {
	    reportProblem(response, "Unrecognized search engine");
	}
    }

    private void reportProblem(HttpServletResponse response, String meassage) throws IOException {
	response.sendError(HttpServletResponse.SC_NOT_FOUND, meassage);
    }
}
