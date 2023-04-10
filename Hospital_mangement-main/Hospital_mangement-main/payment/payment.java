package payment;

public class payment {
    private String cash;
    private String UPI_ID;
    private String upiPin;
    private String cardNumber;
    private String cardMonth;
    private String cardYear;
    private String cardCvv;
    private String carPin;
    
    public String getCardMonth() {
        return cardMonth;
    }
    public void setCardMonth(String cardMonth) {
        this.cardMonth = cardMonth;
    }
    public String getCardYear() {
        return cardYear;
    }
    public void setCardYear(String cardYear) {
        this.cardYear = cardYear;
    }
    public String getCardCvv() {
        return cardCvv;
    }
    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    private String amount;

    public String getCash() {
        return cash;
    }
    public void setCash(String cash) {
        this.cash = cash;
    }
    public String getUPI_ID() {
        return UPI_ID;
    }
    public void setUPI_ID(String uPI_ID) {
        UPI_ID = uPI_ID;
    }
    public String getUpiPin() {
        return upiPin;
    }
    public void setUpiPin(String upiPin) {
        this.upiPin = upiPin;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCarPin() {
        return carPin;
    }
    public void setCarPin(String carPin) {
        this.carPin = carPin;
    }
  
}
