import java.time.LocalDate;

/**
 * Write a description of class CreditCard here.
 *
 * @author Brunaldo Cimo
 */
public class CreditCard
{
    // instance variables - replace the example below with your own
    int CardNo, securityCode;
    String holderName;
    LocalDate expiryDate;
    
    public CreditCard(int cardNo, int securityCode, String holderName, 
    LocalDate expiryDate) {
        super();
        CardNo = cardNo;
        this.securityCode = securityCode;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }
    
    public void validateCard() {
        // must be implemented
    }
    
    protected void refundMoney(double amount) {
        
    }
    
    public void setPurchase(Transaction purchaseDetails){
        
    }
    
    public int getCardNo() {
        return CardNo;
    }
    public void setCardNo(int cardNo) {
        CardNo = cardNo;
    }
    public int getSecurityCode() {
        return securityCode;
    }
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
