
package cdac.acts.assignment.day8.Tester;

import java.util.Date;
import java.util.Scanner;

import cdac.acts.assignment.day8.Accounts;
import cdac.acts.assignment.day8.CurrentAcc;
import cdac.acts.assignment.day8.DepositAcc;
import cdac.acts.assignment.day8.SavingsAcc;


public class AccountTest extends Accounts {
	private static String accName;
	private static Date dateOpen;
	private static long amount;
	private static String accType;
	
	final static int MAX_ACCNO = 100;
	static int count = 0;
	
	
	
	
	AccountTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	static Accounts ac;
	public static void main(String[] args) {
		AccountTest[] acts= new AccountTest[MAX_ACCNO];
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		AccountTest act= new AccountTest();
		do {
			
			System.out.println("****************Welcome to My Bank of Millionairs*************************");
			System.out.println("*Please enter 1. Create Account                                          *\n"
							 + "*Please enter 2. Deposit Money                                           *\n"
							 + "*Please enter 3. Withdraw Balance                                        *\n"
							 + "*Please enter 4. Display Balance                                         *\n"
							 + "*Please enter 5. Check Interst rates                                     *\n"
							 + "*Please enter 6. Fixed deposit                                           *\n"
							 + "*Please enter 0. Exit                                                    *\n"
							 + "**************************************************************************");
			choice = sc.nextInt();
		
			switch (choice) {
			case 1:{
				
				sc.nextLine();
				System.out.println("Please Enter Your Name");
				accName = sc.nextLine();
				act.setAccName(accName);
				System.out.println("Interest Rates are as follows \nSavings account: "+SavingsAcc.applyInterest()+"%"+"\nCurrent account: "+CurrentAcc.applyInterest()+"%"
						+"\nFixed deposit "+DepositAcc.applyInterest()+"%");
				System.out.println("Please Enter Account Type");
				accType = sc.nextLine();
				if(accType.equalsIgnoreCase("Savings")) {
					act.setAccType("Savings");
				}
				if(accType.equalsIgnoreCase("Current")) {
					act.setAccType("Current");
				}
				if(accType.equalsIgnoreCase("Fixed Deposit")) {
					act.setAccType("Fixed Deposit");
				}
				System.out.println("Please Enter Deposit Amount");
				amount = sc.nextLong();
				act.setAmount(amount);
				Date dt = new Date();
				act.setDateOpen(dt);
				act.setAccNo(getNextAccNo());
				acts[count] = act;
				System.out.println(acts[count].toString());
				
				count++;
				
			}
				break;
			case 2:{
				int accNo;
				long amt;
				System.out.println("Please Enter Account Number");
				accNo = sc.nextInt();
				System.out.println("Please Enter Deposit amount");
				amt = sc.nextLong();
				
				for(int i = 0; i < count; i++) {
					if(accNo == acts[count].getAccNo())
					{
						long temp = acts[i].getAmount();
						System.out.println("Your old balance was: "+temp);
						temp += amt;
						acts[i].setAmount(temp);
						
						System.out.println("Your new balance is: ");
						System.out.println(acts[i].getAmount());
						break;
					}
				}
				System.out.println("your deposit completed.");
				
			}
				break;
			case 3: {
				int accNo;
				System.out.println("Please Enter Account Number");
				accNo = sc.nextInt();
				for(int i = 0; i < count; i++) {
					if(accNo == acts[count].getAccNo())
					{
						
						System.out.println("Your balance is: "+ acts[i].getAmount());
						break;
					}
				}
				System.out.println("your Transaction completed.");
				
			}
				break;
			case 4: {
				
				System.out.println("Interest Rates are as follows \nSavings account: "+SavingsAcc.applyInterest()+"%"+"\nCurrent account: "+CurrentAcc.applyInterest()+"%"
				+"\nFixed deposit "+DepositAcc.applyInterest()+"%");
			}
			
			case 5: {
				ac = new AccountTest();
				System.out.println("Please Enter Deposit Amount");
				long fdAmount = sc.nextLong();
				System.out.println("Please Enter No of Years");
				int years = sc.nextInt();
				System.out.println("Maturity period will be 2 Years and You will get Rs "+act.calculateMaturityAmount(fdAmount, 2));
				System.out.println("You will get Rs "+ac.calculateMaturityAmount(fdAmount, years)+" After "+years+" years.");
				
			}
				break;
			case 0: 
				System.out.println("Thankyou for banking with us.");
				break;
			default:
				System.out.println("Please Enter valid Choice");
				break;
			}
		} while (choice != 0);
		
	}

	public double applyInterest() {
		// TODO Auto-generated method stub
		return applyInterest();
	}
	@Override
	public double calculateMaturityAmount(double amt, int years) {
		return amt + amt * 0.08 * years;
	}

	public double withdraw(double amt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
