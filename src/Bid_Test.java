public class Bid_Test {

	public static void main(String[] args) {
		
		Account buyer = new Account ("buyer", "username", "password", "persNr", "address", "phone", "mail", "500.0");
		
		System.out.println("Skapar ett bud");
		Bid bid = new Bid("30", buyer);
		
		System.out.println("Kontrollerar hur stort budet är");
		System.out.println(bid.getAmount());

		System.out.println("Kontrollerar köparen");
		System.out.println(bid.getBuyer().getFullname());
	}
}