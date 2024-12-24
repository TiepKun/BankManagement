package nhom13.account;

public abstract class TaiKhoan {
	private String accountNumber;
	protected String password;
	private double balance;
	
 
	public TaiKhoan(String accountNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
	}
	
 
	public void transfer(TaiKhoan targetAccount, double amount) throws Exception {
    	if (amount <= balance) {
            balance = balance - amount;
            targetAccount.balance += amount;
            System.out.println("Transfer successful to account " + targetAccount.accountNumber);
    	} else {
            throw new Exception("Transfer failed");
    	}
	}
	
	public void changePassword(String old_password, String new_password) {
		if(old_password == password) {
			new_password = password;
		} else {
			System.out.println("Password is invalid");
		}
	}
	
	public double getBalance() {
    	return balance;
	}
	
	public String getAccountNumber() {
    	return accountNumber;
	}
	
	public String getPassword() {
    	return password;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
