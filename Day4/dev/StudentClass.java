package com.cdac.acts.dev;

public class StudentClass {
	private static int rollNoCounter = 0;

	private final int rollNo;
	private String stuName;
	private int stuMarks;
	
	public StudentClass() {
		this.rollNo = ++rollNoCounter;
		this.stuName = "";
		this.stuMarks = 0;
	}
	
	public StudentClass(String name, int marks) {
		this.rollNo = ++rollNoCounter;
		this.stuName = name;
		this.stuMarks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getMarks() {
		return stuMarks;
	}
	public void insertStudent(String name, int marks) {
		this.stuName = name;
		this.stuMarks = marks;
	}
	
	public void printStudent() {
		System.out.println("Name: "+this.stuName+
		" Roll no: "+this.rollNo+
		" Marks: "+this.stuMarks);
	}
}
