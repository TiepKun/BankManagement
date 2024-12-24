package nhom13.services;

public class ShoppingService implements Services {
	@Override
	public void payBill(double amount, String serviceName) throws Exception {
    	throw new Exception("Shopping service does not support bill payment");
	}
 
	@Override
	public void shop(double amount, String itemName) throws Exception {
    	if (amount <= 0) {
            throw new Exception("Invalid amount for shopping");
    	}
        System.out.println("Purchased " + itemName + " for " + amount);
	}
 
	@Override
	public void aiBot(String query) {
        System.out.println("Shopping AI Bot: Suggesting products for - " + query);
	}
}
