package SecondPackage;
import FirstPackage.Address;

/**
*  Assignment: 2
* Question: Part 1 - EmailAddress Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

public class EmailAddress extends Address {
	
	private String userName; 
	private String at = "@"; 
	private String domainName;
	private String TLD; 
	// private String email;
	
	public EmailAddress() {
		
		userName=""; 
		at="@"; 
		domainName="";
		TLD=""; 
	}
	
	/**
	 * 
	 * @param vf validFrom date
	 * @param vt valudTo date
	 * @param u userName of the email
	 * @param dom domainName of the email
	 * @param tld tld of the email 
	 */
	public EmailAddress(String vf, String vt, String u, String dom, String tld) {
		
		super(vf, vt); 
		userName=u; 
		at="@"; 
		domainName=dom;
		TLD=tld; 
	}
	
	/**
	 * @param a object parameter
	 */
	
	public EmailAddress(EmailAddress a) {
		
		setValidFrom(a.getValidFrom()); 
		setValidTo(a.getValidTo()); 
		userName=a.userName;
		domainName=a.domainName; 
		at=a.at; 
		TLD=a.TLD; 
	}
	
	public String getUserName() {
		return userName; 
	}
	
	public String getDomainName() {
		return domainName; 
	}
	
	public String getTLD() {
		return TLD; 
	}

	public void setUserName(String s) {
		userName=s; 
	}
	
	public void setDomainName(String d) {
		domainName=d; 
	}
	
	public void setTLD(String t) {
		TLD=t; 
	}
	
	//like before, we are using an EmailAddress object as a parameter to complete email
	


	// TOSTRING METHOD
	@Override
	public String toString() {
		if(checkvalidity()) 
			return "This email address: "+userName+"@"+domainName+".TLD is valid from "+getValidFrom()+" to "+getValidTo()+ " and therefore is still usable."; 
		 else 
			return "This email address: "+userName+"@"+domainName+".TLD is valid from "+getValidFrom()+" to "+getValidTo()+ " and therefore is not usable today."; 
	}
	
	
	// EQUALS METHOD
	@Override
	public boolean equals(Object obj) {
		// check if object is not null
		if(obj != null) { 
			// check if the calling object is the same type 
			if (obj instanceof Address) { 
				EmailAddress anotherAdd = (EmailAddress) obj; 
				
				// attributes comparison
				if(this.getValidFrom().equals(anotherAdd.getValidFrom()) && 
						this.getValidTo().equals(anotherAdd.getValidTo())) {
					
					if (this.userName.equals(anotherAdd.userName) 
							&& this.domainName.equals(anotherAdd.domainName)
							&& this.TLD.equals(anotherAdd.TLD)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	

}
