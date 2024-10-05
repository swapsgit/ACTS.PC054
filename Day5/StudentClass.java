package cdac.acts.day6;

import java.util.Date;

import cdac.acts.utils.DateFormatter;

public class StudentClass {
	private static int rollNoCounter = 0;

	private final int rollNo;
	private String stuName;
	private int stuMarks;
	private ClassEnums enm;
	private String date;
	
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
	public Date getDate() {
		return DateFormatter.getDate(date);
	}
	public void insertStudent(String name, int marks, String dept, String date) {
		this.stuName = name;
		this.stuMarks = marks;
		enm = ClassEnums.valueOf(dept.toUpperCase());
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "StudentClass [rollNo=" + rollNo + ", stuName=" + stuName + ", stuMarks=" + stuMarks + ", enm=" + enm
				+ ", date=" + date + "]";
	}
}
