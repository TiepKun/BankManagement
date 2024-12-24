package nhom13.user;

public class KhachHangVIP extends KhachHang {
	private int vipLevel;
 
	public KhachHangVIP(String id, String name, String dob, String cccd, String phone, String email, String address, int vipLevel) {
        super(id, name, dob, cccd, phone, email, address);
        this.vipLevel = vipLevel;
	}
 
	@Override
	public void displayInfo() {
        System.out.println("VIP Customer ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("VIP Level: " + vipLevel);
	}
 
	public void receiveDiscount() {
        System.out.println("VIP discount applied for level " + vipLevel);
	}
	
	public void setVIPLEVEL(int vipLevel) {
		this.vipLevel = vipLevel;
	}
	
	public int getVIPLEVEL() {
		return vipLevel;
	}
}
