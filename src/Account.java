public class Account {
	private String fullnameInt;
	private String usernameInt;
	private String passwordInt;
	private String persNrInt;
	private String addressInt;
	private String phoneInt;
	private String mailInt;
	private String amountInt;
	
	private int warningInt;
	private boolean blockedInt;
	
	/**
	 * Create a new account
	 * @param fullname
	 * @param username
	 * @param password
	 * @param persNr
	 * @param address
	 * @param phone
	 * @param mail
	 * @param amount
	 */
	public Account(String fullname, String username, String password, String persNr, String address, String phone, String mail, String amount){
		fullnameInt = fullname;
		usernameInt = username;
		passwordInt = password;
		persNrInt = persNr;
		addressInt = address;
		phoneInt = phone;
		mailInt = mail;
		amountInt = amount;
		
		//Contains if user is banned and/or has warnings
		blockedInt = false;
		warningInt = 0;
	}
	
	/**
	 * Gets the users full name
	 * @return fullname
	 */
	public String getFullname(){ return fullnameInt; }
	
	/**
	 * Gets the users username
	 * @return username
	 */
	public String getUsername(){ return usernameInt; }
	
	/**
	 * Gets the users password
	 * @return password
	 */
	public String getPassword(){ return passwordInt; }
	
	/**
	 * Gets the users personal number (social security number)
	 * @return persNr
	 */
	public String getPersNr(){ return persNrInt; }
	
	/**
	 * Gets the users address
	 * @return address
	 */
	public String getAddress(){ return addressInt; }
	
	/**
	 * Gets the users phone number
	 * @return phonenumber
	 */
	public String getPhone(){ return phoneInt; }
	
	/**
	 * Gets the users email
	 * @return email
	 */
	public String getMail(){ return mailInt; }
	
	/**
	 * Gets the users current amount
	 * @return amount
	 */
	public String getAmount(){ return amountInt; }
	
	/**
	 * Check if the user is blocked
	 * @return true or false
	 */
	public boolean isBlocked(){ return blockedInt; }
	
	/**
	 * Get the number of warnings the user has
	 * @return warnings
	 */
	public int getWarnings(){ return warningInt; }
	
	/**
	 * Add money to the account
	 * @param amount
	 */
	public void addMoney(String amount){
		try{
			amountInt = "" + (Double.parseDouble(amountInt) + Double.parseDouble(amount)); 
		}
		catch(Exception e){
			System.out.println("Något gick fel. Error: " + e);
		}
	}
	
	/**
	 * Sets the users full name
	 * @param fullname
	 */
	public void setFullname(String fullname){ fullnameInt = fullname; }
	
	/**
	 * Sets the users username
	 * @param username
	 */
	public void setUsername(String username){ usernameInt = username; }
	
	/**
	 * Sets the users password
	 * @param password
	 */
	public void setPassword(String password){ passwordInt = password; }
	
	/**
	 * Sets the users personal number
	 * @param persNr
	 */
	public void setPersNr(String persNr){ persNrInt = persNr; }
	
	/**
	 * Sets the users address
	 * @param address
	 */
	public void setAddress(String address){ addressInt = address; }
	
	/**
	 * Sets the users phonenumber
	 * @param phone
	 */
	public void setPhone(String phone){ phoneInt = phone; }
	
	/**
	 * Sets the users email
	 * @param mail
	 */
	public void setMail(String mail){ mailInt = mail; }
	
	/**
	 * Sets the users amount
	 * @param amount
	 */
	public void setAmount(String amount){ amountInt = amount; }
	
	/**
	 * Send an email (just a stub)
	 * @param msg
	 * @return
	 */
	public boolean sendEmail(String msg){
		//Skicka mail här
		return true;
	}
	
	/**
	 * Ban the user
	 */
	public void setBlocked(){ blockedInt = true; }
	
	/**
	 * Lift the users ban
	 */
	public void setUnblocked(){ blockedInt = false; }

	/**
	 * Give the user a warning and if needed blocks the user
	 */
	public void giveWarning(){
		warningInt++;
		if(warningInt >= 3){
			this.setBlocked();
		}
	}

	/**
	 * Removes a warning from the user and if needed lifts the users ban
	 */
	public void removeWarning(){
		if(warningInt > 0){
			warningInt--;
		}
		if(this.isBlocked()){
			this.setUnblocked();
		}
	}
	
	/**
	 * Remove money from the users account
	 * @param amount
	 * @return true/false
	 */
	public boolean pay(String amount) {
		try {
			//Removes money from the account
			double temp = Double.parseDouble(amountInt);
			temp -= Double.parseDouble(amount);
			amountInt = Double.toString(temp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Add money to the users account
	 * @param amount
	 * @return true/false
	 */
	public boolean receive(String amount) {
		try {
			//Adds money to the account
			double temp = Double.parseDouble(amountInt);
			temp += Double.parseDouble(amount);
			amountInt = Double.toString(temp);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}