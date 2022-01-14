package ThirdPackage;
import FirstPackage.Address;

/**
*  Assignment: 2
* Question: Part 1 - GeographicAddress Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

public class GeographicAddress extends Address {
	
	private String addressLine; 
	private String city; 
	private String regionOrState; 
	private String zipOrPostCode; 
	private Locale locale; 
	private String fullAdd; 
	
	//constructors 
	
	//DEFAULT
	public GeographicAddress() {
		
		addressLine=""; 
		city="";
		regionOrState="";
		zipOrPostCode=""; 
		locale=new Locale(); 
	}
	
	/**
	 * 
	 * @param vf valid from
	 * @param vt valid to
	 * @param a the address line
	 * @param c they city
	 * @param r the region or the state 
	 * @param z the zip or postal code
	 * @param l the letter code for locale
	 * @param d the digit code for locale 
	 * @param co the country code for locale 
	 */
	//PARAMETERIZED
	public GeographicAddress(String vf, String vt, String a, String c, String r, String z, String l, int d, String co) {
		
		super(vf, vt); 
		addressLine=a; 
		city=c;
		regionOrState=r;
		zipOrPostCode=z; 
		locale= new Locale(l, d, co); 
	}
	
	//COPY
	public GeographicAddress( GeographicAddress a) {
		
		setValidFrom(a.getValidFrom());
		setValidTo(a.getValidTo()); 
		addressLine=a.addressLine; 
		city=a.city;
		regionOrState=a.regionOrState;
		zipOrPostCode=a.zipOrPostCode; 
		locale=a.locale; 
	}
	
	//GETTERS AND SETTERS
	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegionOrState() {
		return regionOrState;
	}

	public void setRegionOrState(String regionOrState) {
		this.regionOrState = regionOrState;
	}

	public String getZipOrPostCode() {
		return zipOrPostCode;
	}

	public void setZipOrPostCode(String zipOrPostCode) {
		this.zipOrPostCode = zipOrPostCode;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	public void setFullAdd(GeographicAddress a) {
		fullAdd=a.addressLine+", "+a.city+", "+a.regionOrState+", "+a.zipOrPostCode+", "+a.locale; 
	}
	
	public String getFullAdd() {
		return fullAdd; 
	}
	
	@Override
	public String toString() {
		
		if(checkvalidity()) {
			return "This geographic address: "+addressLine+", "+city+", "+regionOrState+", "+zipOrPostCode+", "+locale.toString()+" is valid from "+getValidFrom()+" to "+getValidTo()+
				" and therefore is still usable.";
		} else return "This geographic address: "+addressLine+", "+city+", "+regionOrState+", "+zipOrPostCode+", "+locale.toString()+" is valid from "+getValidFrom()+" to "+getValidTo()+
				" and therefore is not usable today";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// check if object is not null
		if(obj != null) { 
			// check if the calling object is the same type 
			if (obj instanceof Address) { 
				GeographicAddress anotherAdd = (GeographicAddress) obj; 
				
				// attributes comparison
				if(this.getValidFrom().equals(anotherAdd.getValidFrom()) && 
						this.getValidTo().equals(anotherAdd.getValidTo())) {
					
					if (this.addressLine.equals(anotherAdd.addressLine) 
							&& this.city.equals(anotherAdd.city)
							&& this.regionOrState.equals(anotherAdd.regionOrState)
							&& this.zipOrPostCode.equals(anotherAdd.zipOrPostCode)
							&& this.locale.equals(anotherAdd.locale)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	

}