package cdac.acts.assignment.day10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FruitTester {
public static void main(String[] args) {
		
		FruitClass fc = null;
		System.out.println("Welcome to food mall ");
		List<FruitClass> ls = new ArrayList<FruitClass>();
		
		
		
		
		
		fc = new FruitClass();
		String str = "y";
		try(Scanner sc = new Scanner(System.in)) {
		while(str.equalsIgnoreCase("y")) {
				System.out.println("Please enter name of fruit ");
				fc.setName(sc.nextLine());
				System.out.println("Please enter color of fruit ");
				fc.setColor(sc.nextLine());
				System.out.println("Please enter quntity of fruits");
				fc.setQuantity(sc.nextInt());
				System.out.println("Please enter price of fruits");
				fc.setPrice(sc.nextInt());
				sc.nextLine();
				
				ls.add(fc);
				System.out.println("Add more \"Y/N\" ");
				str = sc.nextLine();
		}
		
		}
		System.out.println(ls);
	}
}
