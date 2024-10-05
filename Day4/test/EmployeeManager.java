package com.cdac.acts.test;

import java.util.Scanner;

import com.cdac.acts.dev.Employee;

public class EmployeeManager {
	
	static Scanner sc = new Scanner(System.in);
	static Employee[] em = new Employee[100];
	static int emCount = 0;
	static int nextEmpId = 1000;
	
	public static void addEmployee() {
		
		sc.nextLine();
		System.out.print("Enter employee name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter employee salary  : ");
		int salary = sc.nextInt();
	
	
		em[emCount]= new Employee(++nextEmpId,name,salary);
		++emCount;
		System.out.println("Your are added sussfully with empId is : "+ (nextEmpId));
		
	}
	
	
	public static void empByempId() {
		
			System.out.println("Enter your employee id : ");
			int id = sc.nextInt();
			
			boolean found = false;
			
			for(int i = 0; i<emCount; i++) {
				
				if(em[i].empId == id) {
					em[i].show();
					found = true;
					break;
				}
			}
		
			if(!found) {
				System.out.println("Entry was not found ! ");
			}
	}
	public static void sortBySal() {
		
			for(int i = 0; i<emCount-1; i++) {
				for(int j= 0; j<(emCount-i-1);j++){
					if(em[j].empSal>em[j+1].empSal) {
						Employee temp = em[j];
						em[j]=em[j+1];
						em[j+1]= temp;
				}
			}
	}
			for(int i = 0; i<emCount; i++) {
				em[i].show();
			}
				
	}			
			
	
		
	
	public static void main(String[] args) {
			int choice;
		do {
			
			System.out.println("Welcome to Employee System. " );
			System.out.println(" Case 1. Add Employee  " );

			System.out.println(" Case 2. Show Imformation by using id  " );

			System.out.println(" Case 3. Show Employee by Salaries."  );

			System.out.println(" Case 4. Exit from the system" );

			System.out.println("Enter the choice " );
			choice = sc.nextInt();
			
			
			
		switch(choice) {
		
		case 1 : {
						addEmployee();
			break;
		}
		
		
        case 2 : {
						empByempId();
			break;
		}
		


        case 3 : {
        				sortBySal();
	break;
}



        case 4 : {
        			System.out.println("Thank you for visiting us");
	break;
}



         default : {
        	 		System.out.println("Please Enter a valid choice ");
	break;
}
		}
			
		} while(choice!=4);
		
			
			
	

		}
}

