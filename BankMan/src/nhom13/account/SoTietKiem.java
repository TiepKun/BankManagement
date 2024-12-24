package nhom13.account;

import java.time.LocalDate;
import java.time.Period;

public class SoTietKiem {
    private float money;
    private float cur_money;
    private LocalDate date;
    private float interestRate;
    private LocalDate today = LocalDate.now();
    private Period period;

    public SoTietKiem(float money, float cur_money, LocalDate date, float interestRate) {
        this.money = money;
        this.date = date;
        this.interestRate = interestRate;
        this.period = Period.between(date, today);
        this.cur_money = money * period.getMonths() / 6;
    }

    // Getters and Setters
    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public float getCur_money() {
        return cur_money;
    }

    public void setCur_money(float cur_money) {
        this.cur_money = cur_money;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
        this.period = Period.between(date, today); // Update period when date changes
        this.cur_money = money * period.getMonths() / 6; // Recalculate cur_money
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
        this.period = Period.between(date, today); // Update period when today changes
        this.cur_money = money * (1 + interestRate) * (period.getMonths() / 6); // Recalculate cur_money
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
    
}
