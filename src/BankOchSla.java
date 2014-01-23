import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class BankOchSla {

	private ITaxCalculatorAdapter taxAdapter;

	public static void main(String[] args) throws IOException {

		String userName;

		//Read the properties
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

		
		//Register the handlers
		AccountHandler acch = new AccountHandler();
		AuctionHandler auch = new AuctionHandler();
		PaymentHandler payh = new PaymentHandler();

		
		
		System.out.println("Följande auktioner finns i systemet:");
		auch.printAuctions();

		System.out.println("\nVill du: \n1. Logga in\n2. Registrera ny användare");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();

		if (temp.equals("1")) {
			System.out.println("Logga in\n-------");
			System.out.println("Ange anvndarnamn:");
			userName = br.readLine();
			System.out.println("Välkommen " + userName);
			System.out.println("\nVill du: \n1. Lägga till auktion\n2. Visa auktioner");
			temp = br.readLine();
			if (temp.equals("1")) {
				System.out.println("Ange titel:");
				String title = br.readLine();
				System.out.println("Ange längd (i antal dagar):");
				String duration = br.readLine();
				System.out.println("Ange typ:");
				String auctionType = br.readLine();
				System.out.println("Ange beskrivning:");
				String desc = br.readLine();
				System.out.println("Ange bild URL:");
				String img = br.readLine();
				System.out.println("Ange lägsta pris:");
				String lowPrice = br.readLine();
				System.out.println("Ange start pris:");
				String startPrice = br.readLine();
				System.out.println("Ange köp nu pris:");
				String buyout = br.readLine();
				System.out.println("Ange leveranssätt:");
				String delivery = br.readLine();
				System.out.println("Ange kategori:");
				String category = br.readLine();
				
				Account seller = acch.getAccount(userName);
				String time = "";
				
				auch.newAuction(title, duration, auctionType, desc, img, lowPrice, startPrice, buyout, delivery, seller, category, time);
				System.out.println("Auktionen har lagts till");
			}
			else{
				System.out.println("Följande auktioner finns i systemet:");
				auch.printAuctions();
			}
		} else {
			System.out.println("Registrera\n-------");
		}
		
		

	}
}