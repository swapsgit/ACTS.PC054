package cdac.acts.assignment.day7;
/*
 * Topics Covered: Inheritance, abstract class, final variable, final methods,
final class, upcasting, down casting, overriding, co-varient return type.
Object class methods like getClass and toString. Wrapper classes boxing
and un boxing.
Students should revise and try all above concepts
1. Create account class acount number, accountName, dateOfOpening,
amount.
Add below functionality

1. Generate account number on account creation.
2. Add abstract method as double applyInterest() in the
account class
3. Create child classes as SavingAccount, CurrentAccount,
DepostAccount. Override double applyInterest() in the
child classes.
4. Interst percentage of Saving are 3%, Deposit 8%, and
Current as 1%
5. Use upcasting and demonstarte Dynamic method
dispatch.
6. Make is menu driven.
*/
import java.util.Date;
import java.util.Scanner;
public abstract class AccountClass {
	private static int accNo = 1250;
	private static int nextAccNo;
	private String accName;
	private Date dateOpen;
	private long amount;
//	Scanner sc = new Scanner(System.in);
	
	public static int getNextAccNo() {
		return nextAccNo;
	}
	
	public static void setAccNo(int accNo) {
		AccountClass.nextAccNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public static int getAccNo() {
		return nextAccNo;
	}

	public static void setNextAccNo(int nextAccNo) {
		AccountClass.nextAccNo = nextAccNo;
	}

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
	
	protected AccountClass() {
		nextAccNo = accNo++;
	}
	
	public abstract double applyInterest();
	

	@Override
	public String toString() {
		return "AccountClass [accNo=" + nextAccNo + ", accName=" + accName + ", dateOpen=" + dateOpen + ", amount=" + amount+"]";
	}
	

}
