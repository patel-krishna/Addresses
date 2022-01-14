package FirstPackage;

/**
*  Assignment: 2
* Question: Part 1 - Definition Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

 public class Address {
	
		
	//Attributes
			private String validFrom; 
			private String validTo; 
			
			//Constructors
			
			public Address() { //default constructor
				
				validFrom= null;
				validTo= null;
				
			}
			
			/**
			 * 
			 * @param start start of the validity 
			 * @param end end of the validity 
			 */
			public Address(String start, String end) { //parameterized constructor
				
				validFrom=start;
				validTo=end; 
			}
			
			/**
			 * @param ad object parameter
			 */
			public Address(Address ad) { //copy constructor
				
				validFrom=ad.validFrom;
				validTo=ad.validTo; 
			}
			
			public String getValidFrom() {
				return validFrom;
			}
			
			public String getValidTo() {
				return validTo;
			}
			
			public void setValidFrom(String v) {
				this.validFrom = v; 
			}
			
			public void setValidTo(String v) {
				this.validFrom=v; 
			}

			public String toString() {
				return " This Address is valid from " + validFrom + " to " + validTo;
			}
		
			// CHECK VALIDITY
			// used to compare with the current date. Return a boolean
			// if true --> and therefore is still usable.
			// if false --> and therefore is not usable today.
			// Current date used: 2021-03-04
		
			
			public boolean checkvalidity() {
			   boolean checked = false;
			   int y = 2021, m = 03, d = 04;
			   
			   int vfyear = Integer.parseInt(getValidFrom().substring(0,4));
			   int vfmonth = Integer.parseInt(getValidFrom().substring(5,7));
			   int vfdate = Integer.parseInt(getValidFrom().substring(8,10));
			  
			   int vtyear = Integer.parseInt(getValidTo().substring(0,4));
			   int vtmonth = Integer.parseInt(getValidTo().substring(5,7));
			   int vtdate = Integer.parseInt(getValidTo().substring(8,10));
			
			   if ( vtyear < y|| vfyear > y)
				   checked = false;
			   else if ( vfyear < y && vtyear > y) {
				   checked = true;
			   } else {
				   if (vfyear <= y && vtyear == y) {
					   if ( vtmonth < m || vfmonth >m) 
						   checked = false;
					   else if ( vtmonth > m) {
						   checked = true;
					   } else {
						   if (vfmonth <= m && vtmonth == m) {
							   if (vtdate < d || vfdate > d)
								   checked = false;
							   else if (vtdate >= d) {
								   checked = true;
							   }
						   } else if ( vfmonth <= m && vtmonth > m) {
							   if ( vfdate > d)
								   checked = false;
							   else 
								   checked = true;
						   } else {
							   checked = false;
						   }
					   }
					   
				   } else if (vfyear <= y && vtyear > y) {
					   if ( vfmonth >m)
						   checked = false;
					   else checked = true;
				   } else {
					   checked = false;
				   }
			   }
			  return checked;
			}

		
}
