package cdac.acts.assignment.day11.Utils;

import java.time.LocalDate;
public class I_ValidationUtils {
	
	public static LocalDate validateDate(String dte) {
		LocalDate date = LocalDate.parse(dte);
		LocalDate today = LocalDate.now();
		
		if(date.isBefore(today)) {
				return date;
		}
		return null;
	}

	public static double validBalance(double bal) {
		if(bal >= 1000) {
			return bal;
		}
		else {
			System.err.println("Please maintain minimum balance of 1000Rs");
		}
		return 0;
	}
}
