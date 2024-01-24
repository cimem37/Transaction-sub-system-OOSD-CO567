import java.util.List;
import java.time.LocalDateTime;

/**
 * Write a description of class Purchase here.
 * 
 * @author Brunaldo Cimo
 */
public class Purchase extends Transaction
{
    Customer customer;    
    public Purchase(int staffID, String username, 
    CreditCard card, List<Ticket> tickets, LocalDateTime dateTime){
        super(staffID, username, card, tickets, dateTime);
    }
}
