package nhom13.account;

public class The {
    private String cardNumber;
    private String expiryDate;
    private String status;

    public The(String cardNumber, String expiryDate, String status) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.status = status;
    }

    public void activate() {
        this.status = "Active";
    }

    public void deactivate() {
        this.status = "Inactive";
    }

    public void validateCard() throws Exception {
        if (status.equals("Inactive")) {
            throw new Exception("Card is inactive");
        }
    }

    // Getters and Setters
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
