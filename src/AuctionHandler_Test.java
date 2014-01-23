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
			System.out.println("Fel vid inl�sning av defaultProperties.prp.");
			e.printStackTrace();
		}
		//Test av att l�gga till och h�mta auktioner
		AuctionHandler ah = new AuctionHandler();
		Account buyer = new Account ("buyer", "username", "password", "persNr", "address", "phone", "mail", "500.0");
		Account seller = new Account ("seller", "username", "password", "persNr", "address", "phone", "mail", "300.0");
		
		System.out.println("Initierar AuctionHandler");
		ah.initialize();
		
		System.out.println("Skapar auktion");
		ah.newAuction("title", "duration", "auctionType", "desc", "img", "lowPrice", "startPrice", "buyout", "delivery", seller, "category", "time");
		
		System.out.println("H�mtar senaste auktionen");
		if(ah.getLatestAuction().getSeller().getFullname().equals("seller")){
			System.out.println("Auctionen l�stes in. (Korrekt)");
		}
		else{
			System.out.println("Auktionen l�stes inte in (Fel)");
		}
		
		System.out.println("L�ser in alla skapade auktioner");
		for(int i = 0; i < ah.getAuctionsList().size(); i++){
			System.out.println(ah.getAuctionsList().get(i).toString());
		}
		
		System.out.println("Budar p� auktionen");
		ah.newBid("30", buyer, ah.getLatestAuction());
		
		System.out.println("Kontrollerar senaste budet");
		System.out.println(ah.getLatestAuction().getLatestBid());
		
		System.out.println("Avslutar auktionen");
		ah.endAuction(ah.getLatestAuction());
		
		if(ah.getLatestAuction().isEnded()){
			System.out.println("Auktionen �r avslutad (Korrekt)");
		}
		else{
			System.out.println("Auktionen avslutade inte (Fel)");
		}
		
		System.out.println("Markerar varan som skickad");
		ah.itemSent(ah.getLatestAuction(), "", "");
		
		if(ah.isItemSent(ah.getLatestAuction())){
			System.out.println("Varan �r markerad som skickad (Korrekt)");
		}else{
			System.out.println("Varan �r inte markerad som skickad (Fel)");
		}
		
		System.out.println("Markerar varan som mottagen");
		ah.itemReceived(ah.getLatestAuction(),"");
		
		if(ah.isItemReceived(ah.getLatestAuction())){
			System.out.println("Varan �r markerad som mottagen (Korrekt)");
		}else{
			System.out.println("Varan �r inte markerad som mottagen (Fel)");
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
		if(ah.newAuction("R�d penna", "30", "English", "En r�d penna i nyskick",
				"https://www.tibh.org/catalog/images/620-80-22030-4.JPG", "20",
				"20", "100", "Posten", seller, "Kontor", "2013-05-08 11:37")){
			System.out.println("Auktion \"R�d penna\" har lagts till (Korrekt)");
		}
		else{
			System.out.println("Auktion \"R�d penna\" har inte lagts till (Fel)");
		}

		if(auctions.size()> 0){
			System.out.println("Det finns auktioner (Korrekt)");
		}
		else{	
			System.out.println("Det finns inga auktioner (Fel)");
		}
		
		
		
		//Kontrollera om det g�r avluta auktion
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

