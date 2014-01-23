public class Auction_Test {

	public static void main(String[] args) {
		
			Account seller = new Account ("Säljare", "username", "password", "persNr", "address", "phone", "mail", "500.0");
			Account bud1 = new Account ("Budare1", "bud1", "password", "persNr", "address", "phone", "mail", "500.0");
			Account bud2 = new Account ("Budare2", "bud2", "password", "persNr", "address", "phone", "mail", "500.0");
			Account bud3 = new Account ("Budare3", "bud3", "password", "persNr", "address", "phone", "mail", "500.0");
			
			Auction auction = new Auction("Röd penna", "30", "English", "En röd penna i nyskick",
					"https://www.tibh.org/catalog/images/620-80-22030-4.JPG", "20",
					"20", "100", "Posten", seller, "Kontor",
					"2013-05-08 11:37");
			
			System.out.println("Testar om det går att skriva ut annonsen");
			System.out.println("\n" + "Annons:" + "\n" + auction.toString());
		
			
			System.out.println("Test av att lägga bud och hämta ut senaste giltiga budet");
			Bid latestBid = auction.getLatestBid();
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getFullname() + "\n" +
					"Summa: " + latestBid.getAmount()
			);
			
			if(auction.newBid("40", bud1)){
				System.out.println("\n" + "Budare1 har lagt ett bud på 40 kr (Korrekt)");
			}
			else{
				System.out.println("\n" + "Budare1 kunde inte lägga ett bud på 40kr (Fel)");
			}
			
			latestBid = auction.getLatestBid();
			
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getFullname() + "\n" +
					"Summa: " + latestBid.getAmount()
			);
			
			if(auction.newBid("30", bud2)){
				System.out.println("\n" + "Budare2 har lagt ett bud på 30 kr (Fel)");
			}
			else{
				System.out.println("\n" + "Budare2 kunde inte lägga ett bud på 30kr (Korrekt)");
			}
			
			latestBid = auction.getLatestBid();
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getFullname() + "\n" +
					"Summa: " + latestBid.getAmount()
			);

			if(auction.newBid("50", bud3)){
				System.out.println("\n" + "Budare3 har lagt ett bud på 50 kr (Korrekt)");
			}
			else{
				System.out.println("\n" + "Budare3 kunde inte lägga ett bud på 50kr (Fel)");
			}
			latestBid = auction.getLatestBid();
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getFullname() + "\n" +
					"Summa: " + latestBid.getAmount()
			);
			
			
			System.out.println("Hämtar köpare och säljare");
			System.out.println("Köpare: " + auction.getBuyer().getUsername());
			System.out.println("Säljare: " + auction.getSeller().getUsername());
			
			System.out.println("Kontrollerar om varan är markerad som skickad");
			if(auction.isItemSent()){
				System.out.println("Varan har skickats (Fel)");
			}
			else{
				System.out.println("Varan har inte skickats (Korrekt)");
			}
			
			System.out.println("Markerar varan som skickad");
			
			auction.itemSent("time", "trackingId");
			
			if(auction.isItemSent()){
				System.out.println("Varan har skickats (Korrekt)");
			}
			else{
				System.out.println("Varan har inte skickats (Fel)");
			}
			
			
			System.out.println("Kontrollerar om varan är markerad som mottagen");
			if(auction.isItemReceived()){
				System.out.println("Varan har mottagits (Fel)");
			}
			else{
				System.out.println("Varan har inte mottagits (Korrekt)");
			}
			
			System.out.println("Markerar varan som mottagen");
			
			auction.itemReceived("time");
			
			if(auction.isItemReceived()){
				System.out.println("Varan har mottagits (Korrekt)");
			}
			else{
				System.out.println("Varan har inte mottagits (Fel)");
			}
			
			
			/*
		//Test av att lägga bud och kontrollera senaste bud

			Bid latestBid = aucH.getLatestAuction().getLatestBid();
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getName() + "\n" +
					"Summa: " + latestBid.getAmount()
			);
			Account buyer = new Account("Leo", "12500");
			if(aucH.getLatestAuction().newBid("40", buyer)){
				System.out.println("\n" + "Leo har lagt ett bud på 40 kr (Korrekt)");
			}
			else{
				System.out.println("\n" + "Leo kunde inte lägga ett bud på 40kr (Fel)");
			}
			
			latestBid = aucH.getLatestAuction().getLatestBid();
			
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getName() + "\n" +
					"Summa: " + latestBid.getAmount()
			);
			
			buyer = new Account("Patrik", "100");
			if(aucH.getLatestAuction().newBid("30", buyer)){
				System.out.println("\n" + "Patrik har lagt ett bud på 30 kr (Fel)");
			}
			else{
				System.out.println("\n" + "Patrik kunde inte lägga ett bud på 30kr (Korrekt)");
			}
			
			latestBid = aucH.getLatestAuction().getLatestBid();
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getName() + "\n" +
					"Summa: " + latestBid.getAmount()
			);

			buyer = new Account("Fritjof", "130");
			if(aucH.getLatestAuction().newBid("50", buyer)){
				System.out.println("\n" + "Fritjof har lagt ett bud på 50 kr (Korrekt)");
			}
			else{
				System.out.println("\n" + "Fritjof kunde inte lägga ett bud på 50kr (Fel)");
			}
			latestBid = aucH.getLatestAuction().getLatestBid();
			System.out.println(
					"\n" + "Senaste budet:" + "\n" +
					"Budgivare: " + latestBid.getBuyer().getName() + "\n" +
					"Summa: " + latestBid.getAmount()
			);
		
		
		
		
		
		
		
		//Test av att kontrollera om vara är skickad och markering av att vara skickats
			if(aucH.getLatestAuction().isItemSent()){
				System.out.println("\n" + "Varan är markerad som skickad. (Fel)");
			}
			else{
				System.out.println("\n" + "Varan är inte markerad som skickad. (Korrekt)");
			}
			
			
			if(aucH.getLatestAuction().itemSent("2013-05-08 12:11", "1234-5678-9")){
				System.out.println("Varan markerades som skickad (Korrekt)");
			}
			else{
				System.out.println("Varan markerades inte som skickad (Fel)");
			}
			
	
			if(aucH.getLatestAuction().isItemSent()){
				System.out.println("Varan är markerad som skickad. (Korrekt)");
			}
			else{
				System.out.println("Varan är inte markerad som skickad. (Fel)");
			}
			
			
			
		//Test av om varan auktionen är avslutad och att avsluta
			if(aucH.getLatestAuction().isEnded()){
				System.out.println("\n" + "Auktionen är markerad som avslutad (Fel)");
			}
			else{
				System.out.println("\n" + "Auktionen är inte markerad som avslutad (Korrekt)");
			}
			
			if(aucH.getLatestAuction().endAuction()){
				System.out.println("Auktionen har avslutats (Korrekt)");
			}
			else{
				System.out.println("Auktionen har inte avslutats (Fel)");
			}

			if(aucH.getLatestAuction().isEnded()){
				System.out.println("Auktionen är markerad som avslutad (Korrekt)");
			}
			else{
				System.out.println("Auktionen är inte markerad som avslutad (Fel)");
			}
			
		*/
			
			
	}

}
