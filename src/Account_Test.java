public class Account_Test {

	public static void main(String[] args) {

		System.out.println("Skapar konto med 500 p�");
		Account account = new Account ("fullname", "username", "password", "persNr", "address", "phone", "mail", "500.0");
        
		System.out.println(
				"\n\nKontrollera att kan h�mta ut  och �ndra information"
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
				
			//Anv�ndarnamn
				if(account.getUsername().equals("username")){
					System.out.println("\n\tAnv�ndarnamn: " + account.getUsername() + "(Korrekt)");
				}else{
					System.out.println("\n\tAnv�ndarnamn: " + account.getUsername() + "(Fel)");
				}

				System.out.println("\tByt anv�ndarnamn till Kalle313");
				account.setUsername("Kalle313");

				if(account.getUsername().equals("Kalle313")){
					System.out.println("\tAnv�ndarnamn: " + account.getUsername() + "(Korrekt)");
				}else{
					System.out.println("\tAnv�ndarnamn: " + account.getUsername() + "(Fel)");
				}
				
			//L�senord
				if(account.getPassword().equals("password")){
					System.out.println("\n\tL�senord:" + account.getPassword() + "(Korrekt)");
				}else{
					System.out.println("\n\ttL�senord:" + account.getPassword() + "(Fel)");
				}

				System.out.println("\tByt l�senord till l�sen");
				account.setPassword("l�sen");

				if(account.getPassword().equals("l�sen")){
					System.out.println("\tL�senord: " + account.getPassword() + "(Korrekt)");
				}else{
					System.out.println("\tL�senord: " + account.getPassword() + "(Fel)");
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

				System.out.println("\tByt address till Paradis�ppelv�gen 111");
				account.setAddress("Paradis�ppelv�gen 111");

				if(account.getAddress().equals("Paradis�ppelv�gen 111")){
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
			"\n\nTest om anv�ndare �r blockerad och om det g�r blockera"
		);
			
				if(account.isBlocked()){
					System.out.println("\tAnv�ndaren �r blockerad (Fel)");
				}
				else{
					System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
				}
				
				System.out.println("\n\tBlockerar anv�ndaren");
				

				if(account.isBlocked() == false){
					System.out.println("\tAnv�ndaren �r blockerad (Korrekt)");
				}
				else{
					System.out.println("\tAnv�ndaren �r inte blockerad (Fel)");
				}
				

				System.out.println("\n\tAvblockerar anv�ndaren");

				if(account.isBlocked()){
					System.out.println("\tAnv�ndaren �r blockerad (Fel)");
				}
				else{
					System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
				}
						
		
				
				
		System.out.println(
			"\n\nTest med varningar och om tillr�ckligt m�nga blockerar anv�ndaren"
		);
		if(account.getWarnings()==0){
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om anv�ndaren �r blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnv�ndaren �r blockerad (Fel)");
		}
		else{
			System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tGer anv�ndaren 1 varning");
		account.giveWarning();
		
		if(account.getWarnings()==1){
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om anv�ndaren �r blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnv�ndaren �r blockerad (Fel)");
		}
		else{
			System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tGer anv�ndaren 1 varning");
		account.giveWarning();
		
		
		if(account.getWarnings()==2){
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om anv�ndaren �r blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnv�ndaren �r blockerad (Fel)");
		}
		else{
			System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tGer anv�ndaren 1 varning");
		account.giveWarning();
		
		if(account.getWarnings()==3){
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om anv�ndaren �r blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnv�ndaren �r blockerad (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren �r inte blockerad (Fel)");
		}
		
		System.out.println("\n\tTar bort en varning");
		account.removeWarning();
		
		if(account.getWarnings()==2){
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om anv�ndaren �r blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnv�ndaren �r blockerad (Fel)");
		}
		else{
			System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tTar bort 2 varningar");
		account.removeWarning();
		account.removeWarning();
		
		if(account.getWarnings()==0){
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om anv�ndaren �r blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnv�ndaren �r blockerad (Fel)");
		}
		else{
			System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
		}
		
		System.out.println("\n\tF�rs�ker ta bort 1 varning fr�n 0 varningar");
		account.removeWarning();
		
		if(account.getWarnings()==0){
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Korrekt)");
		}
		else{
			System.out.println("\tAnv�ndaren har " + account.getWarnings() + " varning(ar) (Fel)");
		}

		System.out.println("\n\tKontrollerar om anv�ndaren �r blockerad");

		if(account.isBlocked()){
			System.out.println("\tAnv�ndaren �r blockerad (Fel)");
		}
		else{
			System.out.println("\tAnv�ndaren �r inte blockerad (Korrekt)");
		}
		
		
		System.out.println(
				"\n\nTest f�r att s�tta in pengar p� kontot"
			);
		
		System.out.println("\tAnv�ndaren har just nu " + account.getAmount() + " p� kontot");
		System.out.println("\tS�tter in 200 p� kontot");
		account.addMoney("200");
		
		if(account.getAmount().equals("300.0")){
			System.out.println("\tKontot har nu " + account.getAmount() + " (Korrekt)");
		}else{
			System.out.println("\tKontot har nu " + account.getAmount() + " (Fel)");			
		}
		
		
		System.out.println(
				"\n\nTest f�r att skicka mail"
			);
		
		if(account.sendEmail("Testmeddelande")){
			System.out.println("\tMeddelandet skickades (Korrekt)");
		}
		else{
			System.out.println("\tMeddelandet skickades inte (Fel)");
		}
		

		System.out.println(
				"\n\nTest f�r att betala och ta emot batlning"
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
			System.out.println("\n" + "300 drogs fr�n kontot (Korrekt)");
		} else {
			System.out.println("\n" + "300 drogs inte fr�n kontot (Fel)");
		}
		

		System.out.println("Kontobalans: " + accH.getLatestAccount().getAmount());
		

		if (accH.getLatestAccount().receive("250", "2012-05-08")) {
			System.out.println("\n" + "250 sattes in p� kontot (Korrekt)");
		} else {
			System.out.println("\n" + "250 sattes inte in p� kontot (Fel)");
		}
		

		System.out.println("Kontobalans: " + accH.getLatestAccount().getAmount());
	*/	
	}
}