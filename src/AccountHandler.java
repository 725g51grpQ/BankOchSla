import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AccountHandler {
	private ArrayList<Account> accountsCatalog = new ArrayList<Account>();
	public void AccountHandler(){}
	
	/**
	 * Creates a new user
	 * @param fullname
	 * @param username
	 * @param password
	 * @param persNr
	 * @param address
	 * @param phone
	 * @param mail
	 * @param amount
	 */
	public void createUser(String fullname, String username, String password, String persNr, String address, String phone, String mail, String amount){
		Account acc = new Account(fullname, username, password, persNr, address, phone, mail, amount);
		acc.sendEmail("Confirmation msg");
		accountsCatalog.add(acc);
	}	
	
	/**
	 * Pay a user from another users account
	 * @param buyer
	 * @param seller
	 * @param amount
	 * @return ArrayList<Account> with buyer first
	 */
	public ArrayList<Account> pay(Account buyer, Account seller, String amount){
	    
	    buyer.pay(amount);
		seller.receive(amount);

		ArrayList<Account> accounts = new ArrayList<Account>();
		
		accounts.add(seller);
		accounts.add(buyer);
		
		return accounts;
	}

	/**
	 * Get the account from the username
	 * @param username
	 * @return account
	 */
	public Account getAccount(String username){
		ArrayList<Account> accounts = getAccounts();
		for(int i = 0; i<accounts.size(); i++){
			if(accounts.get(i).getUsername().equals(username)){
				return accounts.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Gets an arraylist containing all accounts
	 * @return arraylist<Account>
	 */
	public ArrayList<Account> getAccounts(){ return accountsCatalog; }
	
	/**
	 * Gets the newest account
	 * @return account
	 */
	public Account getLatestAccount(){ return accountsCatalog.get(accountsCatalog.size()-1); }

	/**
	 * Sends an email to the specified account (requires Account.sendEmail() to be implemented first)
	 * @param account
	 * @param msg
	 */
	public void sendEmail(Account account, String msg){ account.sendEmail(msg); }
	
	/**
	 * Sends email to all accounts (requires Account.sendEmail() to be implemented first)
	 * @param msg
	 */
	public void emailAllUsers(String msg){
		for(int i = 0; i<accountsCatalog.size(); i++){
			accountsCatalog.get(i).sendEmail(msg);
		}
	}

	/**
	 * Ban the account
	 * @param account
	 */
	public void setBlocked(Account account){ account.setBlocked(); }
	
	/**
	 * Lift the ban from the account
	 * @param account
	 */
	public void setUnblocked(Account account){ account.setUnblocked(); }
	
	/**
	 * Give a warning to the account
	 * @param account
	 */
	public void giveWarning(Account account){ account.giveWarning(); }
	
	/**
	 * Remove a warning from the account
	 * @param account
	 */
	public void removeWarning(Account account){ account.removeWarning(); }
	
	/**
	 * Check if the user is blocked
	 * @param account
	 * @return true/false
	 */
	public boolean isBlocked(Account account){ return account.isBlocked(); }
	
	/**
	 * Get the number of warnings on the account
	 * @param account
	 * @return number of warnings
	 */
	public int getWarnings(Account account){ return account.getWarnings(); }

}			