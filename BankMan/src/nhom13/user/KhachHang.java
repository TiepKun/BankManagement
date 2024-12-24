package nhom13.user;

public abstract class KhachHang {
	private String id;
	private String name;
	private String dob;
	private String cccd;
	private String phone;
	private String email;
	private String address;
	private int vipLevel;
 
	public KhachHang(String id, String name, String dob, String cccd, String phone, String email, String address, int vipLevel) {
    	this.id= id;
        this.name = name;
    	this.dob = dob;
        this.cccd = cccd;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.vipLevel = vipLevel;
	}
 
	public abstract void displayInfo();
 
	public void updatePhone(String phone) {
        this.phone = phone;
	}
 
	public void updateEmail(String email) {
        this.email = email;
	}
 
	public void validateCustomer() throws Exception {
    	if (cccd.length() != 12 || phone.length() != 10) {
            throw new Exception("Invalid CCCD format");
    	}
	}
	
	public boolean isMatch(String searchString) {
		return cccd.equalsIgnoreCase(searchString) || phone.equalsIgnoreCase(searchString);
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDOB() {
		return dob;
	}
	
	public String getCCCD() {
		return cccd;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	public void setCCCD(String cccd) {
		this.cccd = cccd;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setVIPLEVEL(int vipLevel) {
		this.vipLevel = vipLevel;
	}
	
	public int getVIPLEVEL() {
		return vipLevel;
	}
}
