package cdac.acts.assignment.day12;

/*1 JobSeeker registration
//TODO Get all details and validate data if it is valid then add in list
2 Update email
//Get old and new email from user
3 Display all job seeker by theie degree type. take degree from user

4 Sort JobSeeker details as per email ( comparable)
5 Sort JobSeeker details as per dob ( Comparator)
6 Sort customer details as per graduationDate ( Comparator)*/

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import cdac.acts.assignment.day12.utils.II_ValidationUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import cdac.acts.assignment.day12.utils.*;

public class II_ApplicationFormTester {
	
	static List<II_ApplicationFormBase> lab = II_ApplicationRawDate.getDate();

	public static void main(String[] args) {
		
		
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to My Company");
			int choice;
		do {
			
			System.out.println("1 JobSeeker registration\r\n"
							 + "2 Update email\r\n"
							 + "3 Display all job seeker by their degree type\r\n"
							 + "4 Sort details as per email\r\n"
							 + "5 Sort details as per dob\r\n"
							 + "6 Sortdetails as per graduationDate\r\n"
							 + "7 Display all details");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1: {
			
			System.out.println("Please enter following details to continue.");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Date of Birth: (dd/mm/yyyy)");
			LocalDate dOfBirth = II_ValidationUtils.validDate(sc.nextLine());
			System.out.println("Degree: ");
			String degree = sc.nextLine();
			System.out.println("University: ");
			String university = sc.nextLine();
			System.out.println("Passout Year: (yyyy) ");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
			LocalDate passoutYear = LocalDate.parse(sc.nextLine(), dtf);
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Mobile no: ");
			String mNo = sc.nextLine();
			
			while(mNo.length() != 10) {
				System.err.println("Please enter valid 10 digit no.");
				System.out.println("Mobile no: ");
				mNo = sc.nextLine();
			}
			II_ApplicationFormBase application = new II_ApplicationFormBase(name, dOfBirth, degree, university, passoutYear, email, mNo);
			 lab.add(application);
			
			
			
			
		}break;
		case 2: {
			System.out.println("Email edit.");
			System.out.println("Old email: ");
			String old = sc.nextLine();
			II_ApplicationFormBase application = new II_ApplicationFormBase();
			boolean flag = false;
			for(II_ApplicationFormBase af: lab) {
				if(old.equalsIgnoreCase(af.getEmail())) {
					flag = true;
					System.out.println(af.getEmail());
					System.out.println("Email Id found!");
					System.out.println("New email: ");
					String nnew = sc.nextLine();
					af.setEmail(nnew);
					//System.out.println(af.getEmail());
					System.out.println(af);
					//lab.add(af);
				break;
				}
			}
			if(!flag) {
			System.err.println("Your email id not found, try again.");
			}
		}break;
		case 3: {
			System.out.println("Display degree.");
			System.out.println("Degree: ");
			String degree = sc.nextLine();
			boolean flag = false;
			for(II_ApplicationFormBase af: lab) {
				if(degree.contains(af.getDegree())) {
					flag = true;
					System.out.println(af.toString());
				}
			}
			if(!flag) {
				System.err.println("Your degree related form not found, try again.");
				}
		}break;
		case 4: {
			Collections.sort(lab, new II_EmailComparator());
			lab.forEach(System.out::println);
		}break;
		case 5:{
			Collections.sort(lab, new II_DobComparator());
			lab.forEach(System.out::println);
		}break;
		case 6:{
			Collections.sort(lab, new II_GraduationComparator());
			lab.forEach(System.out::println);
		}break;
		case 7:{
			lab.forEach(System.out::println);
		}break;
		}
		}while(choice != 0);
		}
	}

}
