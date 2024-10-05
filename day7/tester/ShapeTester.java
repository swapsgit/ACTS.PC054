package cdac.acts.assignment.day7.tester;


import java.util.Scanner;

import cdac.acts.day7.BaseShapeClass;
import cdac.acts.day7.CircleClass;
import cdac.acts.day7.RectangleClass;

public class ShapeTester {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		BaseShapeClass base = null;
		
		do {
			
			System.out.println("**************************************************************");
			System.out.println("1.Add Rectangle ");
			System.out.println("2.Add Circle");
			System.out.println("3.Find the area");
			System.out.println("4.Find the perimeter");
			System.out.println("0.Exit the system");
			System.out.println("Enter choice ");
			
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:{
					System.out.println("Enter the length");
					double length = sc.nextDouble();
					
					System.out.println("Enter the width");
					double width = sc.nextDouble();
					
					base = new RectangleClass(length,width);
					System.out.println("Successfully added rectangle");
					
			}
				
				break;
				
			case 2:{
				
				System.out.println("Enter the radius");
				double radius = sc.nextDouble();
				
				base = new CircleClass(radius);
				System.out.println("Successfully circle added in system");
				
				
			}
				
				break;

				
			case 3:{
				// find area
				System.out.println("Area is : "+ base.getArea());
			}
				
				break;

				
			case 4:{
				System.out.println("Perimeter is : "+ base.getPerimeter());
			}
				
				break;

				
			case 0:{
				System.out.println("Thank you for visiting us! ");
			}
				
				break;


			default:{
				System.out.println("Enter a valid choice");
			}
				break;
			}
			
			

			
			
			
			
			
		} while (choice!=0);
		
	}
	
}
