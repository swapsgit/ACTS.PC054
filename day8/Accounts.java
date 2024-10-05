package cdac.acts.assignment.day8;

import java.util.Date;

import cdac.acts.assignment.day7.AccountClass;

public abstract class Accounts implements Depositable, Maturable, Withdrawable{
	private static int accNo = 1250;
	private static int nextAccNo;
	private String accName;
	private String accType;
	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}


	private Date dateOpen;
	private long amount;
//	Scanner sc = new Scanner(System.in);
	
	public static int getNextAccNo() {
		return accNo++;
	}
	
	public static void setAccNo(int accNo) {
		nextAccNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public static int getAccNo() {
		return nextAccNo;
	}

	/*
	 * public static void setNextAccNo(int nextAccN) { nextAccNo = nextAccN; }
	 */

	public void setAccName(String accName) {
		this.accName = accName;
	}
	public Date getDateOpen() {
		return dateOpen;
	}
	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	
	public double deposit(double amt) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calculateMaturityAmount(double amt, int years) {
		// TODO Auto-generated method stub
		return amt + amt * 0.08 * years;
	}

	public double withdrawable(double amt) {
		// TODO Auto-generated method stub
		return 0;
	}
	public abstract double applyInterest();
	

	@Override
	public String toString() {
		return "AccountClass [accNo=" + nextAccNo + "accType=" + accType + ", accName=" + accName + ", dateOpen=" + dateOpen + ", amount=" + amount+"]";
	}
	
	
	
}
