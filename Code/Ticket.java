
/**
 * Write a description of class Ticket here.
 *
 * @author Brunaldo Cimo
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    String title, displayTXT;
    int orderNo, seatID;
    double discount, price;
    boolean cancelled = false;
    Customer customer;
    
    public Ticket(String title, String displayTXT, int orderNo, int seatID, double discount, double price,
            boolean cancelled, Customer customer) {
        super();
        this.title = title;
        this.displayTXT = displayTXT;
        this.orderNo = orderNo;
        this.seatID = seatID;
        this.discount = discount;
        this.price = price;
        this.cancelled = cancelled;
        this.customer = customer;
    }
    
    public double getDiscountedPrice() {
        return price - discount;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDisplayTXT() {
        return displayTXT;
    }
    public void setDisplayTXT(String displayTXT) {
        this.displayTXT = displayTXT;
    }
    public int getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    public int getSeatID() {
        return seatID;
    }
    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isCancelled() {
        return cancelled;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
