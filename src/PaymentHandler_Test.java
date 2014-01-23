import java.util.ArrayList;

public class PaymentHandler_Test {

	public static void main(String[] args) {
	
		PaymentHandler ph = new PaymentHandler();
		
		System.out.println("Skapar konton för Kalle och Erik med 500 på varje");
		Account kalle = new Account ("kalle", "username", "password", "persNr", "address", "phone", "mail", "500.0");
		Account erik = new Account ("erik", "username", "password", "persNr", "address", "phone", "mail", "500.0");
        
		System.out.println("Kalle betalar Erik 300");
		ArrayList<Account> accounts = ph.pay(erik, "300", kalle);
		
		System.out.println("Kalle har nu " + accounts.get(0).getAmount());
		System.out.println("Erik har nu " + accounts.get(1).getAmount());
		
	}
}