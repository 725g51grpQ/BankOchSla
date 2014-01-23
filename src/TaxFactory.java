import java.io.FileInputStream;
import java.util.Properties;


public class TaxFactory{
	//Skapas enligt Lazy materialization kap 26.5.
	//taxCalculatorAdapter enligt kap 26.5.

		private static TaxFactory instance;
		private ITaxCalculatorAdapter Tax;
		
		public static synchronized TaxFactory getInstance(){ 
		  if (instance == null) { instance = new TaxFactory(); }
		  return instance; 
		}
		
		public ITaxCalculatorAdapter getTaxAdapter(){
			
			if (Tax == null)
			{
			  String className = System.getProperty("accountingAdapter.class.name");
		
			  try {
				Tax = (ITaxCalculatorAdapter)Class.forName(className).newInstance();
			  }
			  catch (Exception e)	{
					System.out.println("ERROR: Cannot instantiate: " + className + ".");
					e.printStackTrace();
				  System.exit(1);
			  }
			}// END IF
			
			return Tax;	
		}
	}

/*import java.io.FileInputStream;
import java.util.Properties;

public class TaxFactory
// Protected Variations:Factory:Adapter
// Skapas enligt Lazy materialization kap 26.5, och taxCalculatorAdapter enligt
// kap 26.5.
{
	// Här och nedan är STATIC försvarbart pga designmönstret föreskriver ett
	// enda objekt
	// som ska vara globalt åtkomligt (se bokens resonemang).
	private static TaxFactory instance;
	// Objektvariabel för den skapade adaptern typad till interfacet:
	private ITaxCalculatorAdapter taxAdapter;

	// Lazy materialization enligt sidan 444:
	// synchronized om trådat annars behövs det ej
	public static synchronized TaxFactory getInstance() {
		if (instance == null) {
			instance = new TaxFactory();
		}
		return instance;
	}

	// Designen för getAccountingAdapter impl enligt designprincipen i Fig 26.5:
	public ITaxCalculatorAdapter getTaxAdapter() {
		

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
		if (taxAdapter == null) {
			String className = System
					.getProperty("accountingAdapter.class.name");
			// Class.forName kräver TRY
			try {
				// Skapa ett objekt som är av den begärda klassen.
				// Tvinga konventering till typen som deklarerades på föregående
				// sida
				taxAdapter = (ITaxCalculatorAdapter) Class.forName(className).newInstance();
			} catch (Exception exception) {
				System.out.println("Cannot instantiate: " + className + ".");
				// Detta får duga tills det skapats ordentliga
				// felhanteringsrutiner
				System.exit(1);
			}
		} // END IF
		return taxAdapter;
	}
}*/