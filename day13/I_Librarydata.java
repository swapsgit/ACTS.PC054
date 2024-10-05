package com.acts.assignment.day13;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
public class I_Librarydata {
	static LocalDate date;
	static Map<String, I_LibraryBase> map; 
	public static Map<String, I_LibraryBase> getReadyData() {
		map = new HashMap<String, I_LibraryBase>();
		
		map.put("Pride and Prejudice", new I_LibraryBase("Pride and Prejudice", "Romance", 840, date.parse("1813-06-01"), "Jane Austen", 0));
		map.put("1984", new I_LibraryBase("1984", "Dystopian", 950, date.parse("1949-06-01"), "George Orwell", 120));
		map.put("To Kill a Mockingbird", new I_LibraryBase("To Kill a Mockingbird", "Fiction", 1680, date.parse("1960-06-01"), "Harper Lee", 600));
		map.put("The Great Gatsby", new I_LibraryBase("The Great Gatsby", "Classic", 1220, date.parse("1925-06-01"), "F. Scott Fitzgerald", 250));
		map.put("Moby-Dick", new I_LibraryBase("Moby-Dick", "Adventure", 720, date.parse("1851-01-01"), "Herman Melville", 1000)); // $12-$20 converted to INR
		map.put("Brave New World", new I_LibraryBase("Brave New World", "Dystopian", 720, date.parse("1932-01-01"), "Aldous Huxley", 830)); // $10-$18 converted to INR
		map.put("The Catcher in the Rye", new I_LibraryBase("The Catcher in the Rye", "Fiction", 720, date.parse("1951-01-01"), "J.D. Salinger", 830)); // $10-$15 converted to INR
		map.put("The Hobbit", new I_LibraryBase("The Hobbit", "Fantasy", 720, date.parse("1937-01-01"), "J.R.R. Tolkien", 830)); // $10-$20 converted to INR
		map.put("Fahrenheit 451", new I_LibraryBase("Fahrenheit 451", "Science_Fiction", 720, date.parse("1953-01-01"), "Ray Bradbury", 1000)); // $12-$18 converted to INR
		map.put("The Alchemist", new I_LibraryBase("The Alchemist", "Adventure", 720, date.parse("1988-01-01"), "Paulo Coelho", 830));
	
		return map;
	}

}
