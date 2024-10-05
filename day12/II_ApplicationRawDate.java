package cdac.acts.assignment.day12;
//II_ApplicationFormBase( String name, LocalDate dOfBirth, String degree, String university, LocalDate passoutYear, String email, long mobileNo)
import java.util.List;

import cdac.acts.assignment.day12.utils.II_ValidationUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class II_ApplicationRawDate {
	
	public static List<II_ApplicationFormBase> getDate() {
		
	List<II_ApplicationFormBase> li = new ArrayList<>();
	LocalDate dOfBirth = II_ValidationUtils.validDate("12/01/2000");
	LocalDate dOfBirth1 = II_ValidationUtils.validDate("12/01/1998");
	LocalDate dOfBirth2 = II_ValidationUtils.validDate("12/01/2002");
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate passoutYear = LocalDate.parse("01/03/2020", dtf);
	LocalDate passoutYear1 = LocalDate.parse("01/03/2022", dtf);
	LocalDate passoutYear2 = LocalDate.parse("01/03/2018", dtf);
	
	String mno = new String("1234567890");
	String mno1 = new String("1234567890");
	String mno2 = new String("1234567890");
	
	li.add(new II_ApplicationFormBase("Sandesh", dOfBirth, "Mechanical engg", "Savitribai Phule university", passoutYear, "sandeshbk@gmail.com", mno));
	li.add(new II_ApplicationFormBase("Sampat", dOfBirth, "Cs engg", "Shivaji university", passoutYear1, "sampatk@gmail.com", mno1));
	li.add(new II_ApplicationFormBase("Suresh", dOfBirth1, "It engg", "Savitribai Phule university", passoutYear, "sureshbk@gmail.com", mno2));
	li.add(new II_ApplicationFormBase("Sanket", dOfBirth1, "ETC engg", "Babasaheb Ambedkar university", passoutYear2, "sanketbk@gmail.com", mno));
	li.add(new II_ApplicationFormBase("Sankalp", dOfBirth2, "Mechanical engg", "Tilak university", passoutYear, "sankalp@gmail.com", mno1));
	li.add(new II_ApplicationFormBase("Sanju", dOfBirth2, "Cs engg", "MG university", passoutYear1, "sanju@gmail.com", mno2));
	li.add(new II_ApplicationFormBase("Sangram", dOfBirth, "IT engg", "Bharti university", passoutYear, "sangramhbk@gmail.com", mno));
	li.add(new II_ApplicationFormBase("Samadhan", dOfBirth, "etc engg", "Delhi university", passoutYear2, "samadhanbk@gmail.com", mno1));
	
	return li;
	}
}
