import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;


public class AccountHandler_Test {

	public static void main(String[] args){
		
		
		System.out.println("Skapar ett konto med 100 p�");
		AccountHandler ah = new AccountHandler();
		ah.createUser("fullname", "username", "password", "persNr", "address", "phone", "mail", "100.0");
		

		System.out.println("\nKontrollera att kontot kan h�mtas.");
		if(ah.getAccount("username").getUsername().equals("username")){
			System.out.println("\tKontot h�mtades (Korrekt)");
		}else{
			System.out.println("\tKontot h�mtades inte (Fel)");
		}
		

		System.out.println("\nKontrollera att senaste kontot kan h�mtas.");
		if(ah.getLatestAccount().getUsername().equals("username")){
			System.out.println("\tKontot h�mtades (Korrekt)");
		}else{
			System.out.println("\tKontot h�mtades inte (Fel)");
		}
		
		
		System.out.println("\nKontrollera om det g�r att h�mta katalogen och att anv�ndare har sparats i den.");
		ArrayList<Account> accounts = ah.getAccounts();
		if(accounts.size()>0){
			System.out.println("\tKatalogen h�mtades och den �r inte tom (Korrekt)");
		}
		else{
			System.out.println("\tKatalogen h�mtades och den �r tom (Fel)");
		}
		

		System.out.println("\nKontrollera blockeringsfunktionerna");
		if(ah.isBlocked(ah.getLatestAccount()) == false){
			System.out.println("\tKontot �r inte blockerat (Korrekt)");
		}
		else{
			System.out.println("\tKontot �r blockerat (Fel)");
		}
		
		
		System.out.println("\nBlockerar kontot");
		ah.setBlocked(ah.getLatestAccount());		
		
		
		if(ah.isBlocked(ah.getLatestAccount())){
			System.out.println("\tKontot �r blockerat (Korrekt)");
		}
		else{
			System.out.println("\tKontot �r inte blockerat (Fel)");
		}

		System.out.println("\nAvblockerar kontot");
		ah.setUnblocked(ah.getLatestAccount());
		
		if(ah.isBlocked(ah.getLatestAccount()) == false){
			System.out.println("\tKontot �r inte blockerat (Korrekt)");
		}
		else{
			System.out.println("\tKontot �r blockerat (Fel)");
		}
		
		System.out.println("\n\nKontrollera varningsfunktionerna");
		
		if(ah.getWarnings(ah.getLatestAccount()) == 0){
			System.out.println("\tAnv�ndaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Korrekt)");
		}else{
			System.out.println("\tAnv�ndaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Fel)");
		}
		
		System.out.println("\nVarnar anv�ndaren");
		ah.giveWarning(ah.getLatestAccount());

		if(ah.getWarnings(ah.getLatestAccount()) == 1){
			System.out.println("\tAnv�ndaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Korrekt)");
		}else{
			System.out.println("\tAnv�ndaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Fel)");
		}

		System.out.println("\nTar bort 1 av anv�ndarens varningar");
		ah.removeWarning(ah.getLatestAccount());

		if(ah.getWarnings(ah.getLatestAccount()) == 0){
			System.out.println("\tAnv�ndaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Korrekt)");
		}else{
			System.out.println("\tAnv�ndaren har " + ah.getWarnings(ah.getLatestAccount()) + " varningar (Fel)");
		}
	}
}
