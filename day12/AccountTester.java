package cdac.acts.assignment.day12;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import cdac.acts.assignment.day11.Utils.I_ValidationUtils;

public class AccountTester {
	static List<I_AccountBase> accList;


	public static void main(String[] args) throws MinimumBalanceException {

		accList = new LinkedList<I_AccountBase>();
		accList.addAll(I_Account_testData.getAccList());
		System.out.println("Welcome to Bank of Millioniars");
		int choice;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("***********************************************************************************"
						+ "\n*1 Accept A/C details from user                                               *"
						+ "\n*2 Display all Accounts content using Enhanced For loop                       *"
						+ "\n*3 Accept account No & display details or error message if account Not        *"
						+ "\n*4 Accept From A/C NO and To Account ID and to Funds transfer.                *"
						+ "\n*5 Accept A/C NO; remove A/C from List                                        *"
						+ "\n*6 Apply interest on all saving A/C                                           *" 
						+ "\n*7 Sort accounts as per ascending A/C No.                                     *"
						+ "\n*8 Sort by accountOpeningDate                                                 *");
				choice = sc.nextInt();

				switch (choice) {

				case 1: {
					System.out.println("Please Enter AccountNo");
					int accNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Please Enter Name");
					String accName = sc.nextLine();
					System.out.println("Please Enter Opening date");
					LocalDate date = I_ValidationUtils.validateDate(sc.nextLine());
					System.out.println("Please Enter Balance");
					double balance = I_ValidationUtils.validBalance(sc.nextDouble());

					I_AccountBase ab = new I_AccountBase(accNo, accName, date, balance);
					accList.add(ab);

				}

					break;
				case 2: {
					for (I_AccountBase ab : accList) {
						System.out.println(ab);
					}
				}
					break;
				case 3: {
					System.out.println("Please Enter account no");
					int accNo = sc.nextInt();
					boolean found = false;

					for (I_AccountBase ac : accList) {

						if (accNo == ac.getAccNO()) {
							System.out.println(ac);
							found = true;
							break;
						}
					}
					if (!found) {
						try {
							throw new AccountNotFoundException("Account no not found");
						} catch (Exception e) {
							e.getMessage();
						}
					}
				}
					break;
				case 4: {
					System.out.println("Please Enter your account no");
					int accNo = sc.nextInt();

					System.out.println("Please Enter beneficiary account no");
					int accNo1 = sc.nextInt();

					System.out.println("Please Enter amount to transfer");
					int transfer = sc.nextInt();

					boolean found = false;
					boolean foundBen = false;

					for (I_AccountBase ac : accList) {
						if (accNo == ac.getAccNO() ) {
							found = true;
							if ((ac.getBalances()-transfer) < 1000) {
								throw new MinimumBalanceException("Insufficient account balance");
							} else {
								for (I_AccountBase bc : accList) {
									if (accNo1 == bc.getAccNO()) {
										found = true;
										ac.setBalances(ac.getBalances() - transfer);
										bc.setBalances(bc.getBalances() + transfer);
										System.out.println(bc);
										break;
									}
								}

							}
							System.out.println(ac);
							break;
						}
						
					}

					if (!found || !foundBen) {
						try {
							throw new AccountNotFoundException("Account no not found");
						} catch (Exception e) {
							e.getMessage();
						}
					}
				}
					break;
				case 5: {
					System.out.println("Remove account number");
					System.out.println("Please Enter account no");
					int accNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Please confirm that you are removing account Y/N");
					String choice1 = sc.nextLine();
					while( ! choice1.equalsIgnoreCase("N")) {
					if (choice1.equalsIgnoreCase("N") || choice1.equalsIgnoreCase("no")) {
						break;
					} else {
						System.out.println("Plz Reenter the  valid choice as (N/no):");
						choice1 = sc.nextLine();
					}
					}
					boolean found = false;

					for (I_AccountBase ac : accList) {

						if (accNo == ac.getAccNO()) {
							accList.remove(ac);
							found = true;
							break;
						}
					}
					System.out.println("Please give feedback");
					if (!found) {
						try {
							throw new AccountNotFoundException("Account no not found");
						} catch (Exception e) {
							e.getMessage();
						}
					}
				}
					break;
				case 6: {
					System.out.println("Plz enter the accNo");
					int choice1 = sc.nextInt();
					
					accList.contains(choice1);

				}
					break;

				case 7: {

					Collections.sort(accList, new AccountNoComparator());
					accList.forEach(System.out::println);
				}
					break;

				case 8: {

					Collections.sort(accList, new AccountDateComparator());
					accList.forEach(System.out::println);
				}
					break;
				}
			} while (choice != 7);
		}
	}
};
