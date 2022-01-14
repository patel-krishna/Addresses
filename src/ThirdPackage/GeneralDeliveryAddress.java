/**
*  Assignment: 2
* Question: Part 1 - General Delivery Address Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

package ThirdPackage;
import FirstPackage.Address;
import SecondPackage.TelecomAddress;


public class GeneralDeliveryAddress extends GeographicAddress {
	 
	private TelecomAddress telecom; 
//	private String gdFull; 
	
	//CONSTRUCTORS
	//DEFAULT
	public GeneralDeliveryAddress() {
		
		super(); 
		this.telecom= new TelecomAddress(); 
	}
	
	/**
	 * 
	 * @param vf valid from
	 * @param vt valid to 
	 * @param addressLine addressLine of the address
	 * @param city city of the address
	 * @param regionOrState region or the state of the address
	 * @param zipOrPostCode zip or postal code
	 * @param letterCode the letter code of the locale 
	 * @param digitCode the digit code of the locale 
	 * @param country the country of the locale
	 * @param countryCode the country code 
	 * @param national the national prefix dialing code
	 * @param areaCode the area code
	 * @param nb the number for the telecom address
	 * @param ext the extension for the telecom address
	 * @param physicalType the type of address 
	 */
	
	//PARAMETERIZED
	public GeneralDeliveryAddress(String vf, String vt, String addressLine, String city, 
			String regionOrState, String zipOrPostCode, String letterCode, int digitCode, String country, 
			String countryCode, String national, int areaCode, long nb, int ext, String physicalType) {
		
		super(vf,vt,addressLine,city,regionOrState,zipOrPostCode,letterCode, digitCode, country); 
		
		this.telecom=new TelecomAddress(vf, vt,countryCode,national,areaCode,nb, ext,physicalType);
		
	}
	
	//COPY
	/**
	 * 
	 * @param a an object parameter 
	 */
	public GeneralDeliveryAddress(GeneralDeliveryAddress a) {
		
		setValidFrom(a.getValidFrom());
		setValidTo(a.getValidTo());
		setAddressLine(a.getAddressLine());
		setCity(a.getCity());
		setRegionOrState(a.getRegionOrState());
		setZipOrPostCode(a.getZipOrPostCode());
		setLocale(a.getLocale()); 
		this.telecom= a.telecom; 
	}

	public TelecomAddress getTelecom() {
		return telecom;
	}

	public void setTelecom(TelecomAddress telecom) {
		this.telecom = telecom;
	}
	
	/*public void setGD(GeneralDeliveryAddress a) {
		gdFull=a.getAddressLine()+", "+a.getCity()+", "+a.getRegionOrState()+", "
				+a.getZipOrPostCode()+", "+a.getLocale()+". The"
				+ " telecom number to call is: "+a.telecom;
	}**/
	
	@Override
	public String toString() {
		
		if(checkvalidity()) {
			return "This general delivery address: "+getAddressLine()+", "+getCity()+", "+getRegionOrState()+", "+getZipOrPostCode()+", "+getLocale().toString()+". "+telecom;
		} else return "This general delivery address: "+getAddressLine()+", "+getCity()+", "+getRegionOrState()+", "+getZipOrPostCode()+", "+getLocale().toString()+". "+telecom;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// check if object is not null
		if(obj != null) { 
			// check if the calling object is the same type 
			if (obj instanceof Address) { 
				GeneralDeliveryAddress anotherAdd = (GeneralDeliveryAddress) obj; 
				
				// attributes comparison
				if(this.getValidFrom().equals(anotherAdd.getValidFrom()) && 
						this.getValidTo().equals(anotherAdd.getValidTo())) {
					
					if (this.getAddressLine().equals(anotherAdd.getAddressLine()) 
							&& this.getCity().equals(anotherAdd.getCity())
							&& this.getRegionOrState().equals(anotherAdd.getRegionOrState())
							&& this.getZipOrPostCode().equals(anotherAdd.getZipOrPostCode())
							&& this.getLocale().equals(anotherAdd.getLocale())
							&& this.telecom.equals(anotherAdd.telecom)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	

}