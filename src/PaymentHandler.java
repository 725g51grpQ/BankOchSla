import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PaymentHandler {
	private String timeInt;

	public void PaymentHandler(){}
	
	/**
	 * Pay for an auction returns arraylist with buyer and seller. Buyer first
	 * @param seller
	 * @param amount
	 * @param buyer
	 * @return
	 */
	public ArrayList<Account> pay(Account seller, String amount, Account buyer) {
		
	    buyer.pay(amount);
		seller.receive(amount);

		ArrayList<Account> accounts = new ArrayList<Account>();
		
		accounts.add(buyer);
		accounts.add(seller);
		
		return accounts;
	}
	
}