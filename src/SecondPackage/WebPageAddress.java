package SecondPackage;
import FirstPackage.Address;

/**
* Assignment: 2
* Question: Part 1 - WebPageAddress Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

public class WebPageAddress extends Address{
	
	//Attributes
		private String domainName;
		private String resourceName; 
		private String URL;
		
		//Constructors
		public WebPageAddress() {
			domainName=""; 
			resourceName=""; 
			
		}
		
		
		public WebPageAddress(String dom, String rs) {
			domainName=dom; 
			resourceName=rs; 
		}
		/**
		 * 
		 * @param a object parameter 
		 */
		public WebPageAddress(WebPageAddress a) { //copy constructor
			
			setValidFrom(a.getValidFrom()); 
			setValidTo(a.getValidTo()); 
			domainName=a.domainName; 
			resourceName=a.resourceName; 
		}
		/**
		 * 
		 * @param dom domain name of the address
		 * @param rs resource name of the webpage
		 * @param vf Valid from
		 * @param vt Valid to
		 */
		public WebPageAddress(String vf, String vt, String dom, String rs) {
			
			super(vf,vt); 
			domainName=dom; 
			resourceName=rs;
		}
		
		public String getDomainName() {
			return domainName; 
		}
		
		public String getResourceName() {
			return resourceName; 
		}
		
		public void setDomainName(String dom) {
			this.domainName=dom; 
		}
		
		public void setResourceName(String rs) {
			this.resourceName=rs; 
		}
		
		//here like we discussed the parameter would be a WebPageAddress object right
		public void setURL(WebPageAddress a) {
			URL="www."+a.domainName+"/"+
					a.resourceName; 
		}
		
		// TOSTRING METHOD
		@Override 
		public String toString() {
			
			/*if(true) {
				return "This web address: "+URL+" is valid from "+getValidFrom()+" to "
			+getValidTo()+" and therefore is still usable today.";
				
			}else 
				return "This web address: "+URL+" is valid from "+getValidFrom()+" to "
			+getValidTo()+" and therefore is not usable today.";
		}*/
			
			if(checkvalidity()) 
				return "This web address is: www." +domainName+ "/"+resourceName+" valid from " + getValidFrom() + " to " + getValidTo() + " and therefore is still usable today.";
			else
				return "This web address is: www." +domainName+ "/"+resourceName+" valid from " + getValidFrom() + " to " + getValidTo() +" and therefore is not usable today.";
		}
		
		// EQUALS METHOD
		@Override
		public boolean equals(Object obj) {
			// check if object is not null
			if(obj != null) { 
				// check if the calling object is the same type 
				if (obj instanceof Address) { 
					WebPageAddress anotherAdd = (WebPageAddress) obj; 
					
					// attributes comparison
					if(this.getValidFrom().equals(anotherAdd.getValidFrom()) && this.getValidTo().equals(anotherAdd.getValidTo())) {
						if (this.URL.equals(anotherAdd.URL)) {
							return true;
						}
					}
				}
			}
			return false;
		}

}

	


