/**
 * @see Core Servlets and JavaServer Pages, by Marty Hall and Larry Brown, p.131
 */
package kim.nguyen.beans;

import kim.nguyen.utilities.ServletUtilities;

public class InsuranceInfoBean {
    private String name = "No name specified";
    private String id = "No ID specified";
    private int numChildren = 0;
    private boolean isMarried = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ServletUtilities.filterHtml(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = ServletUtilities.filterHtml(id);
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
}
