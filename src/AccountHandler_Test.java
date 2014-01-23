import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;


public class AccountHandler_Test {

	public static void main(String[] args){
		
		
		System.out.println("Skapar ett konto med 100 på");
		AccountHandler ah = new AccountHandler();
		ah.createUser("fullname", "username", "password", "persNr", "address", "phone", "mail", "100.0");
		

		System.out.println("\nKontrollera att kontot kan hämtas.");
		if(ah.getAccount("username").getUsername().equals("username")){
			System.out.println("\tKontot hämtades (Korrekt)");
		}else{
			System.out.println("\tKontot hämtades inte (Fel)");
		}
		

		System.out.println("\nKontrollera att senaste kontot kan hämtas.");
		if(ah.getLatestAccount().getUsername().equals("username")){
			System.out.println("\tKontot hämtades (Korrekt)");
		}else{
			System.out.println("\tKontot hämtades inte (Fel)");
		}
		
		
		System.out.println("\nKontrollera om det går att hämta katalogen och att användare har sparats i den.");
		ArrayList<Account> accounts = ah.getAccounts();
		if(accounts.size()>0){
			System.out.println("\tKatalogen hämtades och den är inte tom (Korrekt)");
		}
		else{
			System.out.println("\tKatalogen hämtades och den är tom (Fel)");
		}
		

		System.out.println("\nKontrollera blockeringsfunktionerna");
		if(ah.isBlocked(ah.getLatestAccount()) == false){
			System.out.println("\tKontot är inte blockerat (Korrekt)");
		}
		else{
			System.out.println("\tKontot är blockerat (Fel)");
		}
		
		
		System.out.println("\nBlockerar kontot");
		ah.setBlocked(ah.getLatestAccount());		
		
		
		if(ah.isBlocked(ah.getLatestAccount())){
			System.out.println("\tKontot är blockerat (Korrekt)");
		}
		else{
			System.out.println("\tKontot är inte blockerat (Fel)");
		}

		System.out.println("\nAvblockerar kontot");
		ah.setUnblocked(ah.getLatestAccount());
		
		if(ah.isBlocked(ah.getLatestAccount()) == false){
			System.out.println("\tKontot är inte blockerat (Korrekt)");
		}
		else{
			System.out.println("\tKontot är blockerat (Fel)");
		}
		
		System.out.println("\n\nKontrollera varningsfunktionerna");
		
		if(ah.getWarnings(ah.getLatestAccount()) == 0){
			System.out.println("\tAnvändaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Korrekt)");
		}else{
			System.out.println("\tAnvändaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Fel)");
		}
		
		System.out.println("\nVarnar användaren");
		ah.giveWarning(ah.getLatestAccount());

		if(ah.getWarnings(ah.getLatestAccount()) == 1){
			System.out.println("\tAnvändaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Korrekt)");
		}else{
			System.out.println("\tAnvändaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Fel)");
		}

		System.out.println("\nTar bort 1 av användarens varningar");
		ah.removeWarning(ah.getLatestAccount());

		if(ah.getWarnings(ah.getLatestAccount()) == 0){
			System.out.println("\tAnvändaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Korrekt)");
		}else{
			System.out.println("\tAnvändaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Fel)");
		}
	}
}
