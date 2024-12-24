package nhom13.account;

import java.time.LocalDate;

public class VayTheChap extends Vay {
    private String taisanthechap;

    public VayTheChap(String type, String taisanthechap, LocalDate ngaychovay, int kihan) {
        super(type, ngaychovay, kihan);
        this.taisanthechap = taisanthechap;
    }

    // Getter and Setter
    public String getTaisanthechap() {
        return taisanthechap;
    }

    public void setTaisanthechap(String taisanthechap) {
        this.taisanthechap = taisanthechap;
    }
    
    public void notification() {
    	System.out.println("Vui long thuc hien tai chi nhanh ngan hang");
    }
}
