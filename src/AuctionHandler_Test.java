import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class AuctionHandler_Test {
	
	public static void main(String[] args) {

		try {
			String propPath = new String(BankOchSla.class.getClassLoader().getResource("defaultProperties.prp").getPath());
			FileInputStream propFile = new FileInputStream(propPath);
			Properties p = new Properties(System.getProperties());
			p.load(propFile);
			System.setProperties(p);
		} catch (Exception e) {
			System.out.println("Fel vid inläsning av defaultProperties.prp.");
			e.printStackTrace();
		}
		//Test av att lägga till och hämta auktioner
		AuctionHandler ah = new AuctionHandler();
		Account buyer = new Account ("buyer", "username", "password", "persNr", "address", "phone", "mail", "500.0");
		Account seller = new Account ("seller", "username", "password", "persNr", "address", "phone", "mail", "300.0");
		
		System.out.println("Initierar AuctionHandler");
		ah.initialize();
		
		System.out.println("Skapar auktion");
		ah.newAuction("title", "duration", "auctionType", "desc", "img", "lowPrice", "startPrice", "buyout", "delivery", seller, "category", "time");
		
		System.out.println("Hämtar senaste auktionen");
		if(ah.getLatestAuction().getSeller().getFullname().equals("seller")){
			System.out.println("Auctionen lästes in. (Korrekt)");
		}
		else{
			System.out.println("Auktionen lästes inte in (Fel)");
		}
		
		System.out.println("Läser in alla skapade auktioner");
		for(int i = 0; i < ah.getAuctionsList().size(); i++){
			System.out.println(ah.getAuctionsList().get(i).toString());
		}
		
		System.out.println("Budar på auktionen");
		ah.newBid("30", buyer, ah.getLatestAuction());
		
		System.out.println("Kontrollerar senaste budet");
		System.out.println(ah.getLatestAuction().getLatestBid());
		
		System.out.println("Avslutar auktionen");
		ah.endAuction(ah.getLatestAuction());
		
		if(ah.getLatestAuction().isEnded()){
			System.out.println("Auktionen är avslutad (Korrekt)");
		}
		else{
			System.out.println("Auktionen avslutade inte (Fel)");
		}
		
		System.out.println("Markerar varan som skickad");
		ah.itemSent(ah.getLatestAuction(), "", "");
		
		if(ah.isItemSent(ah.getLatestAuction())){
			System.out.println("Varan är markerad som skickad (Korrekt)");
		}else{
			System.out.println("Varan är inte markerad som skickad (Fel)");
		}
		
		System.out.println("Markerar varan som mottagen");
		ah.itemReceived(ah.getLatestAuction(),"");
		
		if(ah.isItemReceived(ah.getLatestAuction())){
			System.out.println("Varan är markerad som mottagen (Korrekt)");
		}else{
			System.out.println("Varan är inte markerad som mottagen (Fel)");
		}
		
		System.out.println("Testar skatt adaptern");
		if(ah.getTax().equals("17")){
			System.out.println("Skatt: 17 (Korrekt)");
		}
		else{
			System.out.println("Skatt: " + ah.getTax() + "(Fel)");
		}
		
/*
		if(auctions.size()> 0){
			System.out.println("Det finns auktioner (Fel)");
		}
		else{	
			System.out.println("Det finns inga auktioner (Korrekt)");
		}
		
		Account seller = new Account("Pennor AB", "0");
		if(ah.newAuction("Röd penna", "30", "English", "En röd penna i nyskick",
				"https://www.tibh.org/catalog/images/620-80-22030-4.JPG", "20",
				"20", "100", "Posten", seller, "Kontor", "2013-05-08 11:37")){
			System.out.println("Auktion \"Röd penna\" har lagts till (Korrekt)");
		}
		else{
			System.out.println("Auktion \"Röd penna\" har inte lagts till (Fel)");
		}

		if(auctions.size()> 0){
			System.out.println("Det finns auktioner (Korrekt)");
		}
		else{	
			System.out.println("Det finns inga auktioner (Fel)");
		}
		
		
		
		//Kontrollera om det går avluta auktion
		Auction latestAuction = auctions.get(auctions.size() - 1);
		ah.endAuction(latestAuction);

		auctions = ah.getAuctionsList();
		if (auctions.get(auctions.size() - 1).isEnded()) {
			System.out.println("Auktionen har avslutats (Korrekt)");
		} else {
			System.out.println("Auktionen har inte avslutats (Fel)");
		}
		
		
		*/
		

	}
	}

