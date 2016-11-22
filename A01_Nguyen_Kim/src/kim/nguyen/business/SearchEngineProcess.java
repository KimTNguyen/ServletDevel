/**
 * SearchEngineProcess.java builds URL for some specified search engines such as:
 * Google, AllTheWeb, Yahoo, AltaVista, Lycos, HotBot, MSN.
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */
package kim.nguyen.business;

enum SEARCH_ENGINES {
    Google("http://www.google.com/search?q="), AllTheWeb("http://www.alltheweb.com/search?q="), Yahoo(
	    "http://www.yahoo.com/search?q="), AltaVista("http://www.altavista.com/search?q="), Lycos(
		    "http://www.lycos.com/search?q="), HotBot(
			    "http://www.hotbot.com/search?q="), MSN("http://www.mns.com/search?q=");

    private String url;

    SEARCH_ENGINES(String url) {
	this.url = url;
    }

    public String getUrl() {
	return url;
    }
}

public class SearchEngineProcess {

    private String engineName;
    private String searchPhrase;

    public SearchEngineProcess(String engineName, String searchPhrase) {
	this.engineName = engineName;
	this.searchPhrase = searchPhrase;
    }

    /**
     * Constructs the url according to the search phrase and the specified
     * search engine.
     *
     * @return the url which will be used by sendDirect() of HttpServletResponse
     */
    public String makeURL() {

	SEARCH_ENGINES[] engineValues = SEARCH_ENGINES.values();

	for (SEARCH_ENGINES engineValue : engineValues) {
	    if (engineName.equals(engineValue.toString())) {
		return engineValue.getUrl() + searchPhrase;
	    }
	}

	return null;
    }
}
