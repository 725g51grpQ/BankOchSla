import java.util.ArrayList;

public class Auction {
	private ArrayList<Bid> bidsCatalog = new ArrayList<Bid>();

	private String durationInt;
	private String auctionTypeInt;
	private String descInt;
	private String imgInt;
	private String lowPriceInt;
	private String startPriceInt;
	private String buyoutInt;
	private String deliveryInt;
	private Account sellerInt;
	private String categoryInt;
	private String timeInt;
	private String titleInt;

	private String itemSentInt;
	private String sentTimeInt;
	private String sentTrackingInt;
	

	private String itemReceivedInt;
	private String receivedTimeInt;

	private String endedInt;

	/**
	 * Create a new auction
	 * @param title
	 * @param duration
	 * @param auctionType
	 * @param desc
	 * @param img
	 * @param lowPrice
	 * @param startPrice
	 * @param buyout
	 * @param delivery
	 * @param seller
	 * @param category
	 * @param time
	 */
	public Auction(String title, String duration, String auctionType,
			String desc, String img, String lowPrice, String startPrice,
			String buyout, String delivery, Account seller, String category,
			String time) {
			titleInt = title;
			durationInt = duration;
			auctionTypeInt = auctionType;
			descInt = desc;
			imgInt = img;
			lowPriceInt = lowPrice;
			startPriceInt = startPrice;
			buyoutInt = buyout;
			deliveryInt = delivery;
			sellerInt = seller;
			categoryInt = category;
			timeInt = time;
			endedInt = "0";
			
			Account system = new Account("", "System", "", "", "", "", "", "");
			this.newBid(startPrice, system);

	}

	/**
	 * Creates a new bid on the auction from the given account
	 * @param amount
	 * @param buyer
	 * @return boolean
	 */
	public boolean newBid(String amount, Account buyer) {
		try {
			if (bidsCatalog.size() > 0) {
				Bid current = this.getLatestBid();
				if (Double.parseDouble(current.getAmount()) > Double
						.parseDouble(amount)) {
					return false;
				}
			}
			Bid bid = new Bid(amount, buyer);
			bidsCatalog.add(bid);
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Ends the given auction
	 * @return boolean
	 */
	public boolean endAuction() {
		try {
			endedInt = "1";
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Check if the auction is ended
	 * @return boolean
	 */
	public boolean isEnded() {
		if (endedInt == "1") {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Get the account of the seller
	 * @return account
	 */
	public Account getSeller() { return sellerInt; }
	
	/**
	 * Get the account of the buyer
	 * @return buyer
	 */
	public Account getBuyer() {
		if(this.isEnded()){
			return this.getLatestBid().getBuyer();
		}else{
			return null;
		}
	}

	/**
	 * Get the latest bid
	 * @return bid
	 */
	public Bid getLatestBid() {
		return bidsCatalog.get(bidsCatalog.size() - 1);
	}

	/**
	 * Mark the item as sent
	 * @param time
	 * @param trackingId
	 * @return boolean
	 */
	public boolean itemSent(String time, String trackingId) {
		try {
			itemSentInt = "1";
			sentTimeInt = time;
			sentTrackingInt = trackingId;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Check if the item has been sent
	 * @return boolean
	 */
	public boolean isItemSent() {
		if (itemSentInt == "1") {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Mark the item as received
	 * @param time
	 * @return boolean
	 */
	public boolean itemReceived(String time) {
		try {
			itemReceivedInt = "1";
			receivedTimeInt = time;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Check if the item has been received
	 * @return boolean
	 */
	public boolean isItemReceived() {
		if (itemReceivedInt == "1") {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Send an email to remind the buyer to mark the item as received (requires Account.sendEmail() to be implemented first)
	 */
	public void remindBuyerMarkReceived() {
		if ((itemReceivedInt.equals("1") == false) && this.isEnded()){
			this.getBuyer().sendEmail("Remind buyer msg");
		}
	}
	
	/**
	 * Create a string of the auction
	 */
	public String toString() {
		return "Title: " + titleInt + "\n" + "Duration: " + durationInt + "\n"
				+ "Auction type: " + auctionTypeInt + "\n" + "Description: "
				+ descInt + "\n" + "Image: " + imgInt + "\n"
				+ "Lowest Price Accepted: " + lowPriceInt + "\n"
				+ "Start Price: " + startPriceInt + "\n" + "Buyout: "
				+ buyoutInt + "\n" + "Delivery: " + deliveryInt + "\n"
				+ "Seller: " + sellerInt.getUsername() + "\n" + "Category: " + categoryInt
				+ "\n" + "Time: " + timeInt;
	}
}
