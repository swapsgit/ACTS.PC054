package cdac.acts.day6;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import cdac.acts.utils.AddressInsertion;

public class PersonDetailTester {
	static Date date;
	public static void main(String[] args) {
		 String name;
		 String aadharNo;
		 String city;
		 String state;
		 String distr;
		 String pin;
		 
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Please Enter Name: ");
		 name = sc.nextLine();
		 
		 System.out.println("Please Enter Date of birth: ");
		 String strDate = sc.nextLine();
		 
		 System.out.println("Please Enter Aadhar No: ");
		 aadharNo = sc.nextLine();
		 
		 System.out.println("Please Enter State: ");
		 state = sc.nextLine();
		 
		 System.out.println("Please Enter District: ");
		 distr = sc.nextLine();
		 
		 System.out.println("Please Enter City: ");
		 city = sc.nextLine();
		 
		 System.out.println("Please Enter Pin: ");
		 pin = sc.nextLine();
		 
		 sc.close();
		 
		 AddressInsertion adrin = new AddressInsertion( state,  distr,  city,   pin);
		 PersonDetailsDemo pdd = new PersonDetailsDemo( name,  strDate,  aadharNo,  adrin);
		 
		 pdd.displayDetail();
		 
	
		 
	}

}
