package cdac.acts.assignment.day12.utils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class II_ValidationUtils {
	
	public static LocalDate validDate (String dte) {
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dob = LocalDate.parse(dte, format);
		
		if(dob.isBefore(date.minusYears(21)) && dob.isAfter(date.minusYears(30))) {
			return dob;
		}else {
			System.err.println("Your age is not valid for our profile");
		}
		return null;
	}

}
