import java.time.LocalDateTime;
import java.util.List;

/**
 * Write a description of class Transaction here.
 * The transaction class is responsible for handling
 * transactions of all sorts that may occur, or be needed
 * in the system.
 * @author Brunaldo Cimo
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    int StaffID;
    String username;
    CreditCard card;
    List<Ticket> tickets;    
    LocalDateTime dateTime;
    double amount;
    
    public Transaction(int staffID, String username, 
    CreditCard card, List<Ticket> tickets, LocalDateTime dateTime) {
        super();
        StaffID = staffID;
        this.username = username;
        this.card = card;
        this.tickets = tickets;
        this.dateTime = dateTime;
    }
    /**
     * PrintReceipt()
     * Print a receipt to the output, with details
     * about each ticket including: price, discount
     * and at the end a total.
     * @params none
     * @return nothing
     */
    public void PrintReceipt() {
        System.out.println("Receipt");
    System.out.println("----------------");
    System.out.println("Purchased Tickets: ");
    amount = 0;
    for(Ticket ticket:tickets) {
        if(!ticket.isCancelled()) {
            System.out.println(ticket.getTitle() + 
            " Seat: " + ticket.getSeatID() + 
            " " + ticket.getPrice());
            System.out.println("Discount: " + ticket.getDiscount());
            amount += ticket.getDiscountedPrice();
            }
        }
        System.out.println("----------------");
        System.out.println("Total: $" + amount);
    }
    /**
     * Cancels a ticket, so it is not calculated
     * into the bill/receipt of the customer.
     * @params
     * @returns
     */
    public void CancelTicket(Ticket cTicket) {
        for(Ticket ticket:tickets) {
        if (ticket == cTicket){
            ticket.setCancelled(true);
            }
        }
    }
    
    public void clearCardNumber() {
        
    }
    /**
     * Cancel the purchase, refund the amount
     * of money taken into customers card
     */
    public void cancelPurchase() {
        card.refundMoney(amount);
        for(Ticket ticket:tickets) {
        ticket.setCancelled(true);
        }
        System.out.println("Purchase has been cancelled!");
    }
    public void validatePurchase() {
        card.validateCard();
    }
    public void setPurchase() {
        validatePurchase();
        card.setPurchase(this);
    }
    public double getAmount() {
        return amount;
    }

    public int getStaffID() {
        return StaffID;
    }
    public void setStaffID(int staffID) {
        StaffID = staffID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public CreditCard getCard() {
        return card;
    }
    
    public void setCard(CreditCard card) {
        this.card = card;
    }
    // The rest of these methods, are not needed for this subsystem and are therefore not imlemented
    public void forwardToMenu() {
        
    }
    public void viewEvents(Object NewTicket) {
        
    }
    public void returnToMenu() {
        
    }
    public void logout() {
        
    }   
}
