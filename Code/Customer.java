
/**
 * Write a description of class Costumer here.
 *
 * @author Brunaldo Cimo
 */
public class Customer
{
    // instance variables - replace the example below with your own
    String title, displayTXT, username, password;
    String prefix, firstname, lastname, email;
    int customerID, cardNo;
    public Customer(String title, String displayTXT, String username, String password, String prefix, String firstname,
            String lastname, String email, int customerID, int cardNo) {
        super();
        this.title = title;
        this.displayTXT = displayTXT;
        this.username = username;
        this.password = password;
        this.prefix = prefix;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.customerID = customerID;
        this.cardNo = cardNo;
    }
    public void setName(String newName) {
        this.firstname = newName;
    }
    public String getName() {
        return this.firstname;
    }
    public void checkForAgent() {
        
    }
    public void editDetails() {
        
    }
    public void cancelPurchase() {
        
    }
    public void viewEvents() {
        
    }
    public void logOut() {
        
    }
}
