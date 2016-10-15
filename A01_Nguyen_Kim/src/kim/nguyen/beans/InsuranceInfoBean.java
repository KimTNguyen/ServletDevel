/**
 * @see Core Servlets and JavaServer Pages, by Marty Hall and Larry Brown, p.131
 */
package kim.nguyen.beans;

import kim.nguyen.utilities.ServletUtilities;

public class InsuranceInfoBean {
    private String name = "No name specified";
    private String id = "No ID specified";
    private int numChildren = 0;
    private boolean married = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = ServletUtilities.filterHtml(name);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.equals("")) {
            this.id = ServletUtilities.filterHtml(id);
        }
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        if (numChildren != 0) {
            this.numChildren = numChildren;
        }
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean isMarried) {
        this.married = isMarried;
    }
}
