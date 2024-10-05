package com.acts.assignment.day13;
import java.time.LocalDate;
public class I_DateValidationUtils {
	
	public static LocalDate getDate(String str) {
		LocalDate date = LocalDate.parse(str);
		return date;
	}

}
