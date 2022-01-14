package ThirdPackage;
import FirstPackage.Address;

/**
*  Assignment: 2
* Question: Part 1 - PostBoxOfficeAddress Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

public class PostBoxOfficeAddress extends GeographicAddress{
	
	private int boxLobbyDoorCode; 
	//private String fullPO; 
	
	//constructors
	//DEFAULT
	public PostBoxOfficeAddress() {
		super();
		boxLobbyDoorCode=0; 
	}
	
	/**
	 * 
	 * @param vf valid from
	 * @param vt valide to
	 * @param addressLine the address line 
	 * @param city the city
	 * @param regionOrState the region or the state 
	 * @param zipOrPostCode the zip or postal code 
	 * @param letterCode the letter code for locale 
	 * @param digitCode the digit code for locale
	 * @param country the country code for locale 
	 * @param box the box office code 
	 */
	//PARAMETERIZED
	public PostBoxOfficeAddress(String vf, String vt, String addressLine, String city, 
			String regionOrState, String zipOrPostCode, 
			String letterCode, int digitCode, String country, int box) {
		
		super(vf,vt,addressLine,city,regionOrState,zipOrPostCode,letterCode, digitCode, country); 
		boxLobbyDoorCode=box; 
	}
	
	//COPY
	/**
	 * 
	 * @param a object parameter 
	 */
	public PostBoxOfficeAddress(PostBoxOfficeAddress a) {
		
		setValidFrom(a.getValidFrom());
		setValidTo(a.getValidTo());
		setAddressLine(a.getAddressLine());
		setCity(a.getCity());
		setRegionOrState(a.getRegionOrState());
		setZipOrPostCode(a.getZipOrPostCode());
		setLocale(a.getLocale()); 
		this.boxLobbyDoorCode=a.boxLobbyDoorCode; 
	}

	public int getBoxLobbyDoorCode() {
		return boxLobbyDoorCode;
	}

	public void setBoxLobbyDoorCode(int boxLobbyDoorCode) {
		this.boxLobbyDoorCode = boxLobbyDoorCode;
	}
	
	/*public void setFullPO(PostBoxOfficeAddress a) {
		
		fullPO=a.getFullAdd()+a.boxLobbyDoorCode; 
	}**/
	
	@Override
	public String toString() {
		
		if(checkvalidity()) {
			return "This post box office address: "+getAddressLine()+", "+getCity()+", "+getRegionOrState()+", "+getZipOrPostCode()+", "+getLocale().toString()+", "+boxLobbyDoorCode +" is valid from "+getValidFrom()+" to "+getValidTo()+
				" and therefore is still usable.";
		} else return "This post box office address: "+getAddressLine()+", "+getCity()+", "+getRegionOrState()+", "+getZipOrPostCode()+", "+getLocale().toString()+", "+boxLobbyDoorCode +" is valid from "+getValidFrom()+" to "+getValidTo()+
				" and therefore is not usable today";
		
	}
	@Override
	public boolean equals(Object obj) {
		// check if object is not null
		if(obj != null) { 
			// check if the calling object is the same type 
			if (obj instanceof Address) { 
				PostBoxOfficeAddress anotherAdd = (PostBoxOfficeAddress) obj; 
				
				// attributes comparison
				if(this.getValidFrom().equals(anotherAdd.getValidFrom()) && 
						this.getValidTo().equals(anotherAdd.getValidTo())) {
					
					if (this.getAddressLine().equals(anotherAdd.getAddressLine()) 
							&& this.getCity().equals(anotherAdd.getCity())
							&& this.getRegionOrState().equals(anotherAdd.getRegionOrState())
							&& this.getZipOrPostCode().equals(anotherAdd.getZipOrPostCode())
							&& this.getLocale().equals(anotherAdd.getLocale())
							&& this.boxLobbyDoorCode==(anotherAdd.boxLobbyDoorCode)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	

}