package cdac.acts.assignment.day10;

import java.util.ArrayList;
import java.util.List;
/*//Create Fruit class with name, color, price and quantity and do following
things

1. Implement toString() method
2. Add Constructors
3. Create ArrayList&lt; Fruit&gt; fruitList = new
ArrayList&lt;Fruit&gt;();
4. Provide for adding fruit in the list
5. Remove fruit by index
6. Print whole list using advacned for
7. Print whole list using for each
8. Print whole list using forword iterator
9. Print whole list using backword iterator*/

public class FruitClass {
	private static String name; 
	private static String color;
	private static int price;
	private static int quantity;
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		FruitClass.name = name;
		
	}
	public static String getColor() {
		return color;
	}
	public static void setColor(String color) {
		FruitClass.color = color;
		
	}
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		FruitClass.price = price;
		
	}
	public static int getQuantity() {
		return quantity;
	}
	public static void setQuantity(int quantity) {
		FruitClass.quantity = quantity;
		
	}
	@Override
	public String toString() {
		
		return "FruiteClass [Name=" + getName() +" color=" + getColor() +" quantity=" + getQuantity() +" price=" + getPrice() 
		+"]";
	}
	
	
}
