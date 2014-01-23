import java.util.ArrayList;
public class AuctionHandler {
	
	private ArrayList<Auction> auctionsCatalog = new ArrayList<Auction>();
	private ITaxCalculatorAdapter taxAdapter;

	public void initialize() { taxAdapter = TaxFactory.getInstance().getTaxAdapter(); }
	
	public AuctionHandler(){ }
	
	/**
	 * Create a new auction and add it to the auctionsCatalog
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
	public void newAuction(String title, String duration,
			String auctionType, String desc, String img, String lowPrice,
			String startPrice, String buyout, String delivery, Account seller,
			String category, String time) {
			Auction auction = new Auction(title, duration, auctionType, desc, img, lowPrice,
					startPrice, buyout, delivery, seller, category, time);
			auctionsCatalog.add(auction);
	}
	
	/**
	 * Get the auctionsList
	 * @return ArrayList<Auction>
	 */
	public ArrayList<Auction> getAuctionsList(){ return auctionsCatalog; }
	
	/**
	 * Get the tax
	 * @return String
	 */
	public String getTax(){ return taxAdapter.getTaxes("20"); }

	/**
	 * Get the latest auction
	 * @return auction
	 */
	public Auction getLatestAuction(){ return auctionsCatalog.get(auctionsCatalog.size()-1); }
	
	/**
	 * End the auction and handle the payment
	 * @param auction
	 */
	public void endAuction(Auction auction) {
		Account seller = auction.getSeller();
		String amount = auction.getLatestBid().getAmount();
		Account buyer = auction.getLatestBid().getBuyer();
		PaymentHandler ph = new PaymentHandler();
		ph.pay(seller, amount, buyer);
		auction.endAuction();
	}
	
	/**
	 * Create a new bid
	 * @param amount
	 * @param buyer
	 * @param auction
	 */
	public void newBid(String amount, Account buyer, Auction auction){ auction.newBid(amount, buyer); }
	
	/**
	 * Mark the item as sent
	 * @param auction
	 * @param time
	 * @param trackingId
	 */
	public void itemSent(Auction auction, String time, String trackingId){ auction.itemSent(time, trackingId); }
	
	/**
	 * Check if the item has been sent
	 * @param auction
	 * @return
	 */
	public boolean isItemSent(Auction auction){ return auction.isItemSent(); }

	/**
	 * Mark the item as received
	 * @param auction
	 * @param time
	 */
	public void itemReceived(Auction auction, String time){ auction.itemReceived(time); }
	
	/**
	 * Check if the item has been received
	 * @param auction
	 * @return
	 */
	public boolean isItemReceived(Auction auction){ return auction.isItemReceived(); }
	
	/**
	 * Send an email to remind the buyer to mark the item as received (requires Account.sendEmail() to be implemented first)
	 * @param auction
	 */
	public void remindBuyerMarkReceived(Auction auction){
		auction.remindBuyerMarkReceived();
	}
	
	/**
	 * Print the auctions
	 */
	public void printAuctions(){
		for( int i = 0; i < this.getAuctionsList().size(); i++){
			System.out.println(this.getAuctionsList().get(i).toString() + "\n\n");
		}
	}
	
}