package SecondPackage;
import FirstPackage.Address;

/**
*  Assignment: 2
* Question: Part 1 - TelecomAddress Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

public class TelecomAddress extends Address {
	
	private String countryCode; 
	private String nationalDirectDialingPrefix; 
	private int areaCode; 
	private long number; 
	private int extension; 
	private String physicalType; 
	// private String telAdd; 
	
	//constructors
	public TelecomAddress() {
		
		countryCode=" "; 
		nationalDirectDialingPrefix=" "; 
		areaCode=0; 
		number=0000; 
		extension=0; 
		physicalType=""; 
	}
	
	/**
	 *  
	 * @param vf validFrom
	 * @param vt validTo
	 * @param c the countryCode of the telecomadd
	 * @param n the national direct dialing prefix 
	 * @param a the area code
	 * @param nb the number
	 * @param e the extension
	 * @param p the type of telecom address
	 */
	
	public TelecomAddress(String vf, String vt, String c, String n, int a, long nb, int e, String p) {
	
		super(vf,vt);
		countryCode=c; 
		nationalDirectDialingPrefix=n; 
		areaCode=a; 
		number=nb; 
		extension=e; 
		physicalType=p; 
	}
	
	/**
	 * 
	 * @param t object parameter
	 */
	public TelecomAddress(TelecomAddress t) {
		
		setValidFrom(t.getValidFrom());
		setValidTo(t.getValidTo()); 
		countryCode=t.countryCode; 
		nationalDirectDialingPrefix=t.nationalDirectDialingPrefix; 
		areaCode=t.areaCode; 
		number=t.number; 
		extension=t.extension; 
		physicalType=t.physicalType; 
	}
	
	//GETTERS AND SETTERS
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getNationalDirectDialingPrefix() {
		return nationalDirectDialingPrefix;
	}
	
	public void setNationalDirectDialingPrefix(String nationalDirectDialingPrefix) {
		this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
	}
	
	public int getAreaCode() {
		return areaCode;
	}
	
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	
	public long getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getExtension() {
		return extension;
	}
	
	public void setExtension(int extension) {
		this.extension = extension;
	}
	
	public String getPhysicalType() {
		return physicalType;
	}
	
	public void setPhysicalType(String physicalType) {
		this.physicalType = physicalType;
	}
	
	//Again using an object TelecomAddress as a parameter 
	/*public void setTelecomAddress(TelecomAddress a) {
		telAdd="+"+a.countryCode+" "+"("+a.nationalDirectDialingPrefix+")"+a.areaCode+" "+a.number+" ext. "
					+a.extension+" "+a.physicalType; 
	} */
	
	
	@Override
	public String toString() {
		
		if(checkvalidity()) { 
			return "This telecom address: +"+ countryCode+" ("+nationalDirectDialingPrefix+")"+areaCode+" "+number+" ext. "+extension+" "+physicalType+" is valid from "+ getValidFrom() +" to "+ getValidTo() +
				" and therefore is still usable.";
		} else return "This telecom address: +"+ countryCode+" ("+nationalDirectDialingPrefix+")"+areaCode+" "+number+" ext. "+extension+" "+physicalType+" is valid from "+ getValidFrom() +" to "+ getValidTo() +
				" and therefore is not usable today";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// check if object is not null
		if(obj != null) { 
			// check if the calling object is the same type 
			if (obj instanceof Address) { 
				TelecomAddress anotherAdd = (TelecomAddress) obj; 
				
				// attributes comparison
				if(this.getValidFrom().equals(anotherAdd.getValidFrom()) && 
						this.getValidTo().equals(anotherAdd.getValidTo())) {
					
					if (this.countryCode==(anotherAdd.countryCode) 
							&& this.nationalDirectDialingPrefix==(anotherAdd.nationalDirectDialingPrefix)
							&& this.areaCode==(anotherAdd.areaCode)
							&& this.number==(anotherAdd.number)
							&& this.extension==(anotherAdd.extension)
							&& this.physicalType.equals(anotherAdd.physicalType)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	

}