public class Account_Test {

	public static void main(String[] args) {

		System.out.println("Skapar konto med 500 på");
		Account account = new Account ("fullname", "username", "password", "persNr", "address", "phone", "mail", "500.0");
        
		System.out.println(
				"\n\nKontrollera att kan hämta ut  och ändra information"
		);
		
			//Namn
				if(account.getFullname().equals("fullname")){
					System.out.println("\tFullt namn: " + account.getFullname() + "(Korrekt)");
				}else{
					System.out.println("\tFullt namn: " + account.getFullname() + "(Fel)");
				}
					
				System.out.println("\tByt namn till Kalle Anka");
				account.setFullname("Kalle Anka");

				if(account.getFullname().equals("Kalle Anka")){
					System.out.println("\tFullt namn: " + account.getFullname() + "(Korrekt)");
				}else{
					System.out.println("\tFullt namn: " + account.getFullname() + "(Fel)");
				}
				
			//Användarnamn
				if(account.getUsername().equals("username")){
					System.out.println("\n\tAnvändarnamn: " + account.getUsername() + "(Korrekt)");
				}else{
					System.out.println("\n\tAnvändarnamn: " + account.getUsername() + "(Fel)");
				}

				System.out.println("\tByt användarnamn till Kalle313");
				account.setUsername("Kalle313");

				if(account.getUsername().equals("Kalle313")){
					System.out.println("\tAnvändarnamn: " + account.getUsername() + "(Korrekt)");
				}else{
					System.out.println("\tAnvändarnamn: " + account.getUsername() + "(Fel)");
				}
				
			//Lösenord
				if(account.getPassword().equals("password")){
					System.out.println("\n\tLösenord:" + account.getPassword() + "(Korrekt)");
				}else{
					System.out.println("\n\ttLösenord:" + account.getPassword() + "(Fel)");
				}

				System.out.println("\tByt lösenord till lösen");
				account.setPassword("lösen");

				if(account.getPassword().equals("lösen")){
					System.out.println("\tLösenord: " + account.getPassword() + "(Korrekt)");
				}else{
					System.out.println("\tLösenord: " + account.getPassword() + "(Fel)");
				}
								
			//Personnummer
				if(account.getPersNr().equals("persNr")){
					System.out.println("\n\ttPersonnummer:" + account.getPersNr() + "(Korrekt)");
				}else{
					System.out.println("\n\ttPersonnummer:" + account.getPersNr() + "(Fel)");
				}

				System.out.println("\tByt personnummer till 313");
				account.setPersNr("313");

				if(account.getPersNr().equals("313")){
					System.out.println("\tPersonnummer: " + account.getPersNr() + "(Korrekt)");
				}else{
					System.out.println("\tPersonnummer: " + account.getPersNr() + "(Fel)");
				}
								
			//Adress
				if(account.getAddress().equals("address")){
					System.out.println("\tAdress:" + account.getAddress() + "(Korrekt)");
				}else{
					System.out.println("\tAdress:" + account.getAddress() + "(Fel)");
				}

				System.out.println("\tByt address till Paradisäppelvägen 111");
				account.setAddress("Paradisäppelvägen 111");

				if(account.getAddress().equals("Paradisäppelvägen 111")){
					System.out.println("\tAdress: " + account.getAddress() + "(Korrekt)");
				}else{
					System.out.println("\tAdress: " + account.getAddress() + "(Fel)");
				}
								
			//Phone
				if(account.getPhone().equals("phone")){
					System.out.println("\tTele:" + account.getPhone() + "(Korrekt)");
				}else{
					System.out.println("\tTele:" + account.getPhone() + "(Fel)");
				}

				System.out.println("\tByter telefonnummer till 012-34567");
				account.setAddress("012-34567");

				if(account.getAddress().equals("012-34567")){
					System.out.println("\tTele: " + account.getAddress() + "(Korrekt)");
				}else{
					System.out.println("\tTele: " + account.getAddress() + "(Fel)");
				}
								
			//Mail
				if(account.getMail().equals("mail")){
					System.out.println("\tMail:" + account.getMail() + "(Korrekt)");
				}else{
					System.out.println("\tMail:" + account.getMail() + "(Fel)");
				}

				System.out.println("\tByter Mail till Kalle@Anka.com");
				account.setMail("Kalle@Anka.com");

				if(account.getMail().equals("Kalle@Anka.com")){
					System.out.println("\tTele: " + account.getMail() + "(Korrekt)");
				}else{
					System.out.println("\tTele: " + account.getMail() + "(Fel)");
				}
				
			//Pengar
				if(account.getAmount().equals("amount")){
					System.out.println("\tPengar:" + account.getAmount() + "(Korrekt)");
				}else{
					System.out.println("\tPengar:" + account.getAmount() + "(Fel)");
				}

				System.out.println("\tByter till 100");
				account.setAmount("100.0");

				if(account.getAmount().equals("100.0")){
					System.out.println("\tTele: " + account.getAmount() + "(Korrekt)");
				}else{
					System.out.println("\tTele: " + account.getAmount() + "(Fel)");
				}			
				
		
				

		System.out.println(
			"\n\nTest om användare är blockerad och om det går blockera"
		);
			
				if(account.isBlocked()){
					System.out.println("\tAnvändaren är blockerad (Fel)");
				}
				else{
					System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
				}
				
				System.out.println("\n\tBlockerar användaren");
				

				if(account.isBlocked() == false){
					System.out.println("\tAnvändaren är blockerad (Korrekt)");
				}
				else{
					System.out.println("\tAnvändaren är inte blockerad (Fel)");
				}
				

				System.out.println("\n\tAvblockerar användaren");

				if(account.isBlocked()){
					System.out.println("\tAnvändaren är blockerad (Fel)");
				}
				else{
					System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
				}
						
		
				
				
		System.out.println(
			"\n\nTest med varningar och om tillräckligt många blockerar användaren"
		);
		if(account.getWarnings()==0){
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om användaren är blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnvändaren är blockerad (Fel)");
		}
		else{
			System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tGer användaren 1 varning");
		account.giveWarning();
		
		if(account.getWarnings()==1){
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om användaren är blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnvändaren är blockerad (Fel)");
		}
		else{
			System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tGer användaren 1 varning");
		account.giveWarning();
		
		
		if(account.getWarnings()==2){
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om användaren är blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnvändaren är blockerad (Fel)");
		}
		else{
			System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tGer användaren 1 varning");
		account.giveWarning();
		
		if(account.getWarnings()==3){
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om användaren är blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnvändaren är blockerad (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren är inte blockerad (Fel)");
		}
		
		System.out.println("\n\tTar bort en varning");
		account.removeWarning();
		
		if(account.getWarnings()==2){
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om användaren är blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnvändaren är blockerad (Fel)");
		}
		else{
			System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tTar bort 2 varningar");
		account.removeWarning();
		account.removeWarning();
		
		if(account.getWarnings()==0){
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om användaren är blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnvändaren är blockerad (Fel)");
		}
		else{
			System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tFörsöker ta bort 1 varning från 0 varningar");
		account.removeWarning();
		
		if(account.getWarnings()==0){
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnvändaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om användaren är blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnvändaren är blockerad (Fel)");
		}
		else{
			System.out.println("\tAnvändaren är inte blockerad (Korrekt)");
		}
		
		
		System.out.println(
				"\n\nTest för att sätta in pengar på kontot"
			);
		
		System.out.println("\tAnvändaren har just nu " + account.getAmount() + " på kontot");
		System.out.println("\tSätter in 200 på kontot");
		account.addMoney("200");
		
		if(account.getAmount().equals("300.0")){
			System.out.println("\tKontot har nu " + account.getAmount() + " (Korrekt)");
		}else{
			System.out.println("\tKontot har nu " + account.getAmount() + " (Fel)");			
		}
		
		
		System.out.println(
				"\n\nTest för att skicka mail"
			);
		
		if(account.sendEmail("Testmeddelande")){
			System.out.println("\tMeddelandet skickades (Korrekt)");
		}
		else{
			System.out.println("\tMeddelandet skickades inte (Fel)");
		}
		

		System.out.println(
				"\n\nTest för att betala och ta emot batlning"
			);
		
		System.out.println("\tKontot har nu " + account.getAmount());
		System.out.println("\tBetalar 30kr");
		account.pay("30");
		if(account.getAmount().equals("270.0")){
			System.out.println("\tKontot har nu " + account.getAmount() + " (Korrekt)");
		}else{
			System.out.println("\tKontot har nu " + account.getAmount() + " (Fel)");
		}
		
		
		
		
		
		
		/*
		
		
		
		
		System.out.println("Kontobalans: " + accH.getLatestAccount().getAmount());
		
		if (accH.getLatestAccount().pay("\n" + "300", "2012-05-08")) {
			System.out.println("\n" + "300 drogs från kontot (Korrekt)");
		} else {
			System.out.println("\n" + "300 drogs inte från kontot (Fel)");
		}
		

		System.out.println("Kontobalans: " + accH.getLatestAccount().getAmount());
		

		if (accH.getLatestAccount().receive("250", "2012-05-08")) {
			System.out.println("\n" + "250 sattes in på kontot (Korrekt)");
		} else {
			System.out.println("\n" + "250 sattes inte in på kontot (Fel)");
		}
		

		System.out.println("Kontobalans: " + accH.getLatestAccount().getAmount());
	*/	
	}
}