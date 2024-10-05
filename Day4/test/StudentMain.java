package com.cdac.acts.test;

import com.cdac.acts.dev.StudentClass;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		StudentClass[] stu = new StudentClass[100];
		int count = 0;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. Add Student\r\n"
				+ "2. Print Student by rollNo\r\n"
				+ "3. Print All students Sorted by Marks\r\n"
				+ "0. exit");
		
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: {
			if(count<100) {
			
			StudentClass st = new StudentClass();
			String name;
			int mark;
			sc.nextLine();
			System.out.println("Please Enter Name: ");
			name = sc.nextLine();
			System.out.println("Marks: ");
			mark = sc.nextInt();
			st.insertStudent(name, mark);
			stu[count] = st;
			count++;
			st.printStudent();
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
					stu[i].printStudent();
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
					if(stu[j].getMarks() > stu[j+1].getMarks())
					{
						StudentClass temp = stu[j];
						stu[j] = stu[j + 1];
						stu[j + 1] = temp;
					}
				}
			}
			for(int i = 0; i < count ; i ++)
			{
				stu[i].printStudent();
			}
		}
		break;
		}
	
		}while(choice != 0);
	
		sc.close();
	}	
}
