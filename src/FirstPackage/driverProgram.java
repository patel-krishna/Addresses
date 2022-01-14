package FirstPackage;
import SecondPackage.*;
import ThirdPackage.*;

/**
*  Assignment: 2
* Question: Part 2 - Driver Class
* Author: Team of 2 
* @author Doan Bao Ngan Le - 40169393 Section S
* @author Krishna Patel - 40176352  Section S
* Date of creation:    Start    4th March 2021
*					    Finish  8th March 2021
*
*/

public class driverProgram {
	
	public static Address[] copyAddresses(Address[] add) {
		
	
				Address[] coAdd = new Address[add.length];	
															
				for (int i = 0; i < add.length; i++)	
				{
					coAdd[i] = new Address(add[i]);	
				} 
				return coAdd;
	}
	
	// A method that displays the contents of an inventory
		public static void displayCopy(Address[] add)
		{
			
			System.out.println("\nHere is the copy of the array");
			for (int i = 0; i < add.length; i++)
			{
				System.out.println((i+1) +" . "+add[i].toString());

		}
	}
	
	   public static void main(String[] args) {
		   
		// create address array of size 4
	       Address[] addresses = new Address[18];
	       
	       // create address object using parameterized constructor
	       // The first date: ValidFrom
	       // The second date: ValidTo
	       
	       // EMAIL ADDRESSES
	       
	       EmailAddress address1 = new EmailAddress("2017-03-12", "2027-04-23", "userName_1", "domainName_1","TLD");
	       EmailAddress address2 = new EmailAddress("2005-06-18", "2015-02-23", "userName_2", "domainName_2","TLD"); // (2) Obsolete 
	       EmailAddress address3 = new EmailAddress("2020-01-29", "2025-01-29", "userName_3", "domainName_3","TLD");
	       
	       // WEBPAGE ADDRESS
	       WebPageAddress address4 = new WebPageAddress("2009-05-27","2020-05-27","domainName_1","resourceName_1" ); // (1) Obsolete
	       WebPageAddress address5 = new WebPageAddress("2018-06-15","2025-06-15","domainName_2","resourceName_1" ); // (2),(3) is  equals
	       WebPageAddress address6 = new WebPageAddress("2015-06-15","2025-06-15","domainName_3","resourceName_1" );
	    
	       // TELECOM ADDRESS 
	       TelecomAddress address7 = new TelecomAddress("2002-12-27","2022-01-25","1","1",208,1234567,789,"mobile");
	       TelecomAddress address8 = new TelecomAddress("2016-10-10","2019-10-10","32","0",100,7654321,789,"fax"); // (2) Obsolete
	       TelecomAddress address9 = new TelecomAddress("2000-11-17","2005-12-29","84","0",438,1357642,789,"mobile"); // (3) Obsolete
	       
	       // i don't have constructor for this, still missing some parameters
	       
	       // GEOGRAPHIC ADDRESS
	       GeographicAddress address10 = new GeographicAddress("2014-02-03","2024-07-31","0000 Fake street","Mumbai","South","X23 W4W","IN",500,"India");//("2014-02-03","2019-07-31");// (1) Obsolete
	       GeographicAddress address11 = new GeographicAddress("2014-02-03","2024-07-31","9999 Fake street","LA","California","Z2W 8N9","US",130,"United States");//("2014-02-03","2019-07-31");
	       GeographicAddress address12 = new GeographicAddress("2010-09-17","2025-09-17","1010 Fake street","Rio","FakeState","V4T W35","BA",400,"Brazil");//("2010-09-17","2025-09-17"); // (2),(3) is equals
	      
	       // POST BOX OFFICE ADDRESS
	       PostBoxOfficeAddress address13 = new PostBoxOfficeAddress("2003-01-01","2005-02-02", "1000 Fake street","Montreal","Quebec","H5H W1W","CA",124,"Canada", 50);//("2030-01-01","2040-2-2"); // (1) future
	       PostBoxOfficeAddress address14 = new PostBoxOfficeAddress("2020-12-01","2030-03-04","2000 Fake street","Paris","Province","H12 B14","FR",105,"France", 60);//("2020-12-01","2021-03-04");
	       PostBoxOfficeAddress address15 = new PostBoxOfficeAddress("2015-08-17","2018-07-18","3000 Fake street","Seoul","FakeState","A45 12C","KR",999,"Korea",70 );//("2015-08-17","2017-07-18"); // (3) Obsolete
	       
	       // GENERAL DELIVERY ADDRESS
	       GeneralDeliveryAddress address16 = new GeneralDeliveryAddress("2011-04-16","2022-09-23", "4000 FakeStreet", "QuebecCity","Quebec","H99 B99","CA",123,"Canada", "1","0",123, 555555555L, 127, "mobile");//("2025-04-16","2027-01-25");
	       GeneralDeliveryAddress address17 = new GeneralDeliveryAddress("1981-08-24","2018-09-23","5000 FakeStreet", "Sydney","AUSstate","H87 Z6X","AU",119,"Australia", "1","0",321, 111111111L, 721, "phone");//"1981-08-24","2018-09-23"); // (2) Obsolete
	       GeneralDeliveryAddress address18 = new GeneralDeliveryAddress("2014-04-16","2019-01-25","6000 FakeStreet", "Vancouver","BC","D5D M99","CA",187,"Canada", "0","0",514, 66677777L, 543, "fax" );//"2025-04-16","2027-01-25"); // (3) future

	       // PUTT ALL OBJECTS INTO THE ARRAY :3 (it's look silly lol) 
	       addresses[0] = address1;
	       addresses[1] = address2;
	       addresses[2] = address3;
	       addresses[3] = address4;
	       addresses[4] = address5;
	       addresses[5] = address6;
	       addresses[6] = address7;
	       addresses[7] = address8;
	       addresses[8] = address9;
	       addresses[9] = address10;
	       addresses[10] = address11;
	       addresses[11] = address12;
	       addresses[12] = address13;
	       addresses[13] = address14;
	       addresses[14] = address15;
	       addresses[15] = address16;
	       addresses[16] = address17;
	       addresses[17] = address18;
	    
	       // PRINT ALL THE ADDRESSES
	       for (int i = 0; i < addresses.length-1; i++) {
	           System.out.println(addresses[i].toString());
	           System.out.println();
	       }
	       System.out.println();

	      
	       // Test trace obsolete
	       System.out.println("Check address is obselete on 2017-12-03");
	       traceObsoleteAddresses(addresses, 2017, 12, 03);
	       System.out.println();
	       
	       System.out.println("Check address is obselete on 2021-01-23");
	       traceObsoleteAddresses(addresses, 2021, 01, 23);
	       System.out.println();
	       

	   }
	       /**
	       *
	       * @param addresses this parameter is the addresses
	       * @param year this parameter is the year being tested
	       * @param month  the month being tested
	       * @param day  the day being tested 
	       */
	       private static void traceObsoleteAddresses(Address[] addresses, int year, int month, int day) {
	    	   
	           for (int i = 0; i < addresses.length; i++) {
	        	   int vfyear = Integer.parseInt(addresses[i].getValidFrom().substring(0,4));
				   int vfmonth = Integer.parseInt(addresses[i].getValidFrom().substring(5,7));
				   int vfdate = Integer.parseInt(addresses[i].getValidFrom().substring(8,10));
				  
				   int vtyear = Integer.parseInt(addresses[i].getValidTo().substring(0,4));
				   int vtmonth = Integer.parseInt(addresses[i].getValidTo().substring(5,7));
				   int vtdate = Integer.parseInt(addresses[i].getValidTo().substring(8,10));

	               // CHECK OBSOLETE CONDITION 
			        if (vtyear < year || vfyear > year)
			            System.out.println("Address at index " + (i+1) + " is obsolete");
			        else if (vfyear < year && vtyear > year) {
			            continue;
			        } else {
			            if (vfyear <= year && vtyear == year) {
			                if (vtmonth < month || vfmonth > month)
			                    System.out.println("Address at index " + (i+1) + " is obsolete");
			                else if (vtmonth > month) {
			                    continue;
			                } else {
			                    if (vfmonth <= month && vtmonth == month) {
			                        if (vtdate < day || vfdate > day)
			                            System.out.println("Address at index " + (i+1) + " is obsolete");
			                        else if (vtdate >= day) {
			                            continue;
			                        }
			                    } else if (vfmonth<= month && vtmonth > month) {
			                        if (vfdate > day)
			                            System.out.println("Address at index " + (i+1) + " is obsolete");
			                        else
			                            continue;
			                    } else {
			                        System.out.println("Address at index " + (i+1) + " is obsolete");
			                    }
			                }
			            } else if (vfyear <= year && vtyear > year) {
			                if (vfmonth > month)
			                    System.out.println("Address at index " + (i+1) + " is obsolete");
			                else
			                    continue;
			            } else {
			                System.out.println("Address at index " + (i+1) + " is obsolete");
			            }
			            
			        }  
			    }

			
	           
	           //calling copy method 
	           System.out.println("Displaying the copy of the addresses");
	           Address [] copy= copyAddresses(addresses); 
	           displayCopy(copy); 
	       

			}
	 
	}



