public class Bid {
	private Account buyerInt;
	private String amountInt;

	/**
	 * Create a new bid from given account
	 * @param amount
	 * @param Buyer
	 */
	public Bid(String amount, Account Buyer) {
		amountInt = amount;
		buyerInt = Buyer;
	}
	
	/**
	 * Get amount of the bid
	 * @return bid
	 */
	public String getAmount(){ return amountInt; }

	/**
	 * Get the biddrs account
	 * @return account
	 */
	public Account getBuyer(){ return buyerInt; }
}