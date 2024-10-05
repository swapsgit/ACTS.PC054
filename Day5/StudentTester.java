package cdac.acts.day6;

import java.util.Date;

//import com.cdac.acts.dev.StudentClass;

import java.util.Scanner;

import cdac.acts.utils.DateFormatter;

public class StudentTester {
	public static void main(String[] args) {
		StudentClass[] stu = new StudentClass[100];
		int count = 0;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. Add Student\r\n"
				+ "2. Print Student by rollNo\r\n"
				+ "3. Print All students Sorted by Date\r\n"
				+ "0. exit");
		
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: {
			if(count<100) {
			
			StudentClass st = new StudentClass();
			String name;
			String dept;
			int mark;
			String date;
			sc.nextLine();
			System.out.println("Please Enter Name: ");
			name = sc.nextLine();
			System.out.println("Please Enter DOB: [dd/MM/yyy]");
			date = sc.nextLine();
			System.out.println("Please Enter Dept: \n[DESD, DAC, DAI, DETISS]");
			dept = sc.nextLine();
			System.out.println("Marks: ");
			mark = sc.nextInt();
			String forDate = DateFormatter.getFormattedDate(date);
			st.insertStudent(name, mark, dept, forDate);
			stu[count] = st;
			count++;
			st.toString();
			}
			break;
		}
		
		case 2: {
		
			System.out.println("Roll no: ");
			int rNo = sc.nextInt();
			//if(rNo < count) {
			boolean found = false;
			for(int i = 0; i < count && !found ; i ++)
			{
				
				if(rNo == stu[i].getRollNo())
				{
					stu[i].toString();
					found = true;
					
				}
				}
			if(!found) {			
				System.out.println("Not found");
			}
			break;
		}
		
		case 3: {
			
			//StudentClass[] st1 = new StudentClass[count];
			for(int i = 0; i < count; i++)
			{
				for(int j = 0; j < count - 1; j++)
				{
					if(stu[j].getDate().before(stu[j+1].getDate()))
					{
						StudentClass temp = stu[j];
						stu[j] = stu[j + 1];
						stu[j + 1] = temp;
					}
				}
			}
			for(int i = 0; i < count ; i ++)
			{
				stu[i].toString();
			}
		}
		break;
		}
	
		}while(choice != 0);
	
		sc.close();
	}	
}
