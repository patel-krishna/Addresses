package ThirdPackage;

/**
*  Assignment: 2
* Question: Part 1 - Locale Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

public class Locale {
	
	private String letterCode; 
	private int digitCode; 
	private String country; 
	
	public Locale() {
		letterCode="";
		digitCode=000;
		country=""; 
	}
	
	/**
	 * 
	 * @param l the letter code
	 * @param d the digit code
	 * @param c the country code 
	 */
	
	public Locale(String l, int d, String c) {
		letterCode=l;
		digitCode=d;
		country=c; 
	}

	public String getLetterCode() {
		return letterCode;
	}

	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}

	public int getDigitCode() {
		return digitCode;
	}

	public void setDigitCode(int digitCode) {
		this.digitCode = digitCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return this.letterCode+" "+this.digitCode+" "+this.country; 
	}
	

}
