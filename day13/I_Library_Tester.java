package com.acts.assignment.day13;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

import cdac.acts.assignment.day11.Utils.I_ValidationUtils;
import cdac.acts.assignment.day12.AccountNotFoundException;
import cdac.acts.assignment.day12.I_AccountBase;
import java.util.Map;

public class I_Library_Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws BookNotFoundException, BookNotAvailableException, DupicateBookException {
		Map<String, I_LibraryBase> libraryData = I_Librarydata.getReadyData();
		System.out.println("Welcome to Library of Millioniars");
		int choice;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("\n*****************************************************************"
						+ "\n* 1 Add book.                                                   *"
						+ "\n* 2 Display All books                                           *"
						+ "\n* 3 Allot book to student ( quantity -1). Find by book title    *"
						+ "\n* 4 Take book return ( quantity +1) Find by book title          *"
						+ "\n* 5 Remove book                                                 *"
						+ "\n*****************************************************************");
				choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {

				case 1: {
					System.out.println("Please Enter Title");
					String title = sc.nextLine();
					
					for (String ab : libraryData.keySet()) {
						I_LibraryBase temp = libraryData.get(title);
						if (temp.getTitle().equals(title)) {
							throw new DupicateBookException("Book is available in the Library please add other book!");
						} 
					}
					
					System.out.println("Please Enter books Genera");
					String bookGenera = sc.nextLine();
					System.out.println("Please Enter price");
					Integer price = sc.nextInt();
					sc.nextLine();
					System.out.println("Please Enter Opening date");
					LocalDate publishedDate = I_DateValidationUtils.getDate(sc.nextLine());
					System.out.println("Please Enter Autor name");
					String authorName = sc.nextLine();
					System.out.println("Please Enter quantity");
					Integer quantity = sc.nextInt();
					I_LibraryBase lb = new I_LibraryBase(title, bookGenera, price, publishedDate, authorName, quantity);
					
					
					libraryData.put(title, lb);

				}

					break;
				case 2: {
					for (String ab : libraryData.keySet()) {
						System.out.println(libraryData.get(ab));
					}
				}
					break;

				case 3: {
					System.out.println("Please Enter title");
					String key = sc.nextLine();
					boolean found = false;

					for (String ab : libraryData.keySet()) {

						I_LibraryBase temp = libraryData.get(key);
						if (temp.getQuantity() == 0) {
							throw new BookNotAvailableException("Book not available now!");
						} else {
							found = true;
							temp.setQuantity(temp.getQuantity() - 1);
							System.out.println(libraryData.get(key).toString());
							break;
						}

					}
					if (!found) {
						throw new BookNotFoundException("No such book available");
					}
				}
					break;
				case 4: {
					System.out.println("Please Enter title to return");
					String key = sc.nextLine();
					boolean found = false;

					for (String ab : libraryData.keySet()) {
						I_LibraryBase temp = libraryData.get(key);
						if (temp.getTitle().equalsIgnoreCase(key)) {
							found = true;
							temp.setQuantity(temp.getQuantity() + 1);
							System.out.println(libraryData.get(key).toString());
						}
						break;
					}
					if (!found) {
						throw new BookNotFoundException("No such book available");
					}
				}
					break;
				case 5: {
					System.out.println("Please Enter title to remove");
					String key = sc.nextLine();
					boolean found = false;

					for (String ab : libraryData.keySet()) {
						I_LibraryBase temp = libraryData.get(key);
						if (temp.getTitle().equalsIgnoreCase(key)) {
							found = true;
							libraryData.remove(key);
							System.out.println("Book removed successfully");
						}
						break;
					}
					if (!found) {
						throw new BookNotFoundException("No such book available");
					}

				}
					break;
				}

			} while (choice != 0);
		}
	}
}

class BookNotFoundException extends Exception {
	BookNotFoundException(String msg) {
		super(msg);
	}
}

class BookNotAvailableException extends Exception {
	BookNotAvailableException(String msg) {
		super(msg);
	}
}
class DupicateBookException extends Exception {
	DupicateBookException(String msg) {
		super(msg);
	}
}
