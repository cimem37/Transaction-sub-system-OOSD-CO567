import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Write a description of class Main here.
 *
 * @author Brunaldo Cimo
 */
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String args[]) {
        Customer cust = new Customer("Mr", "", "test", "password", 
        "prefix", "John", "Doe", "myemail@email.com", 1, 1);
        Ticket t1 = new Ticket("show1", "show1", 1, 1, 0, 35.0,
            false, cust);
        Ticket t2 = new Ticket("show2", "show2", 2, 2, 0.5*35.0, 35.0,
            false, cust);
        List <Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(t1);
        tickets.add(t2);
        LocalDate date = LocalDate.now();
        CreditCard card = new CreditCard(1, 123, "John Doe", date);
        Transaction purchase = new Purchase(1, "test", 
         card, tickets,  LocalDateTime.now());
        purchase.setPurchase();
        purchase.PrintReceipt();
        // End of successful scenario
        // Test 2 - Refund
        Ticket t3 = new Ticket("show3", "show3", 3, 3, 0.35*35.0, 35.0,
            true, cust);
        tickets.add(t3);
        purchase.setPurchase();
        purchase.cancelPurchase();
    }
}
