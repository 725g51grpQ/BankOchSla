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
	// H�r och nedan �r STATIC f�rsvarbart pga designm�nstret f�reskriver ett
	// enda objekt
	// som ska vara globalt �tkomligt (se bokens resonemang).
	private static TaxFactory instance;
	// Objektvariabel f�r den skapade adaptern typad till interfacet:
	private ITaxCalculatorAdapter taxAdapter;

	// Lazy materialization enligt sidan 444:
	// synchronized om tr�dat annars beh�vs det ej
	public static synchronized TaxFactory getInstance() {
		if (instance == null) {
			instance = new TaxFactory();
		}
		return instance;
	}

	// Designen f�r getAccountingAdapter impl enligt designprincipen i Fig 26.5:
	public ITaxCalculatorAdapter getTaxAdapter() {
		

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
		if (taxAdapter == null) {
			String className = System
					.getProperty("accountingAdapter.class.name");
			// Class.forName kr�ver TRY
			try {
				// Skapa ett objekt som �r av den beg�rda klassen.
				// Tvinga konventering till typen som deklarerades p� f�reg�ende
				// sida
				taxAdapter = (ITaxCalculatorAdapter) Class.forName(className).newInstance();
			} catch (Exception exception) {
				System.out.println("Cannot instantiate: " + className + ".");
				// Detta f�r duga tills det skapats ordentliga
				// felhanteringsrutiner
				System.exit(1);
			}
		} // END IF
		return taxAdapter;
	}
}*/