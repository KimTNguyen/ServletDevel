/**
 * SearchEngineProcess.java builds URL for some specified search engines such as:
 * Google, AllTheWeb, Yahoo, AltaVista, Lycos, HotBot, MSN.
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */
package kim.nguyen.business;

enum SearchEngines {
    GOOGLE("http://www.google.com/search?q="), ALLTHEWEB("http://www.alltheweb.com/search?q="), YAHOO(
	    "http://www.yahoo.com/search?q="), ALTAVISTA("http://www.altavista.com/search?q="), LYCOS(
		    "http://www.lycos.com/search?q="), HOTBOT(
			    "http://www.hotbot.com/search?q="), MSN("http://www.mns.com/search?q=");

    private String url;

    SearchEngines(String url) {
	this.url = url;
    }

    public String getUrl() {
	return url;
    }
}

public class SearchEngineProcess {

    /**
     * Constructs the url according to the search phrase and the specified
     * search engine.
     *
     * @return the url which will be used by sendDirect() of HttpServletResponse
     */
    public static String makeURL(String engineName, String searchPhrase) {

	SearchEngines[] engineValues = SearchEngines.values();

	for (SearchEngines engineValue : engineValues) {
	    if (engineName.equals(engineValue.toString().toLowerCase())) {
		return engineValue.getUrl() + searchPhrase;
	    }
	}

	return null;
    }
}
