
package cdac.acts.assignment.day7.tester;

import java.util.Date;
import java.util.Scanner;

import cdac.acts.assignment.day7.AccountClass;


public class AccountTest extends AccountClass {
	private static String accName;
	private static Date dateOpen;
	private static long amount;
	
	final static int MAX_ACCNO = 100;
	static int count = 0;
	
	
	
	AccountTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AccountTest[] acts= new AccountTest[MAX_ACCNO];
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		AccountTest act= new AccountTest();
		do {
			
			System.out.println("****************Welcome to My Bank of Millionairs*************************");
			System.out.println("*Please enter 1. Create Account                                          *\n"
							 + "*Please enter 2. Deposit Money                                           *\n"
							 + "*Please enter 3. Display Balance                                         *\n"
							 + "*Please enter 4. Check Interst rates                                     *\n"
							 + "*Please enter 0. Exit                                                    *\n"
							 + "**************************************************************************");
			choice = sc.nextInt();
		
			switch (choice) {
			case 1:{
				
				accName = sc.nextLine();
				System.out.println("Please Enter Your Name");
				accName = sc.nextLine();
				act.setAccName(accName);
				System.out.println("Please Enter Deposit Amount");
				amount = sc.nextLong();
				act.setAmount(amount);
				Date dt = new Date();
				act.setDateOpen(dt);
				act.setAccNo(getAccNo());
				acts[count] = act;
				System.out.println(acts[count].toString());
				
				count++;
				
			}
				break;
			case 2:{
				int accNo;
				System.out.println("Please Enter Deposit Amount");
				accNo = sc.nextInt();
				for(int i = 0; i < count; i++) {
					if(accNo == acts[count].getAccNo())
					{
						
					}
				}
				
			}
				break;
			case 3: {
				
			}
				break;
			case 4: {
				//act = new AccountClass();
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

	@Override
	public double applyInterest() {
		// TODO Auto-generated method stub
		return applyInterest();
	}

}
