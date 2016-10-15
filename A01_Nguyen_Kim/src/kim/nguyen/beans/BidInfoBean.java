/**
 * @see Core Servlets and JavaServer Pages, by Marty Hall and Larry Brown, p.142
 */
package kim.nguyen.beans;

import kim.nguyen.utilities.ServletUtilities;

public class BidInfoBean {
    private String itemID = "";
    private String itemName = "";
    private String buyer = "";
    private String email = "";
    private double bidPrice = 0.0;
    private boolean autoIncrement = false;

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = ServletUtilities.filterHtml(itemID);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = ServletUtilities.filterHtml(itemName);
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = ServletUtilities.filterHtml(buyer);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = ServletUtilities.filterHtml(email);
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public boolean isComplete() {
        return (!itemID.equals("")) && (!itemName.equals("")) && (!buyer.equals("")) && (!email.equals(""))
                && (bidPrice != 0.0);
    }
}
