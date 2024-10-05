package cdac.acts.day6;

import java.util.Date;

import cdac.acts.utils.AddressInsertion;
import cdac.acts.utils.DateFormatter;

public class PersonDetailsDemo {
	private String name;
	private Date date;
	private String aadharNo;
	private AddressInsertion adr;
	
	public PersonDetailsDemo() {};
	
	public PersonDetailsDemo(String name, String date, String aadharNo, AddressInsertion adr) {
		this.name = name;
		this.date = DateFormatter.getDate(DateFormatter.getFormattedDate(date));
		this.aadharNo = aadharNo;
		this.adr = adr;
	}
	
//	public void setPerson(String name, Date date, String aadharNo) {
//		this.name = name;
//		this.date = date;
//		this.aadharNo = aadharNo;
//	}
//	
	public void displayDetail() {
		System.out.println("Name: "+name+"\nDOB: "+date+"\nAadhar Number: "+aadharNo);
		adr.displayAddress();
	}

}
