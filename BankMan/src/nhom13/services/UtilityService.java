package nhom13.services;

public class UtilityService implements Services {
	@Override
	public void payBill(double amount, String serviceName) throws Exception {
    	if (amount <= 0) {
            throw new Exception("Invalid amount for bill payment");
    	}
        System.out.println("Paid " + amount + " for " + serviceName);
	}
 
	@Override
	public void shop(double amount, String itemName) throws Exception {
    	throw new Exception("Utility service does not support shopping");
	}
 
	@Override
	public void aiBot(String query) {
        System.out.println("Utility Service AI Bot: Processing query - " + query);
	}
}
