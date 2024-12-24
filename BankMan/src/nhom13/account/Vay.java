package nhom13.account;

import java.time.LocalDate;

public class Vay {

    private String type;
    private LocalDate ngaychovay;
    private int kihan;

    public Vay(String type, LocalDate ngaychovay, int kihan) {
        this.type = type;
        this.ngaychovay = ngaychovay;
        this.kihan = kihan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getNgaychovay() {
        return ngaychovay;
    }

    public void setNgaychovay(LocalDate ngaychovay) {
        this.ngaychovay = ngaychovay;
    }

    public int getKihan() {
        return kihan;
    }

    public void setKihan(int kihan) {
        this.kihan = kihan;
    }
}
