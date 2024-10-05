package com.cdac.acts.dev;


public class Employee {
			public int empId ;
			String empName;
			public int empSal;
			
			
			public Employee(int i,String n, int s) {
				this.empId= i;
				this.empName=n;
				this.empSal= s;
			}


			public void show() {
				System.out.println("Employee Name = "+ empName + "Employee id = "+ empId + "emp sal is "+empSal);
			}

}
