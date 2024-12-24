package nhom13.services;

public interface Services {
	void payBill(double amount, String serviceName) throws Exception;
	void shop(double amount, String itemName) throws Exception;
	void aiBot(String query);
}
