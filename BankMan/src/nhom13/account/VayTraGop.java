package nhom13.account;

import java.time.LocalDate;

public class VayTraGop extends Vay {
    private float money_loan;
    private float laisuat;

    public VayTraGop(String type, float money_loan, float laisuat, LocalDate ngaychovay, int kihan) {
        super(type, ngaychovay, kihan);
        this.money_loan = money_loan;
        this.laisuat = laisuat;
    }
    

    // Getters and Setters
    public float getMoney_loan() {
        return money_loan;
    }

    public void setMoney_loan(float money_loan) {
        this.money_loan = money_loan;
    }

    public float getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(float laisuat) {
        this.laisuat = laisuat;
    }
}
