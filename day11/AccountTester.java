package cdac.acts.assignment.day11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import cdac.acts.assignment.day11.Utils.I_ValidationUtils;
public class AccountTester {
	static List<I_AccountBase> accList;
	public static void main(String[] args) {

			accList = new ArrayList<I_AccountBase>();
			accList.addAll(I_Account_testData.getAccList());
		System.out.println("Welcome to Bank of Millioniars");
		int choice;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("1.	Add account" + "\n2.	Print all accounts" + "\n3.	Sort by account no desc"
						+ "\n4.	Sort by accName" + "\n5.	Sort by Date of opening" + "\n6.	Sort by balance desc"
						+ "\n7.	exit");
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
					for(I_AccountBase ab : accList ) {
						System.out.println(ab);
					}
				}
					break;
				case 3: {
					Collections.sort(accList, new AccountNoValidator());
					accList.forEach(System.out::println);
//					System.out.println(accList);
				}
					break;
				case 4: {
					Collections.sort(accList, new AccountNameValidator());
//					accList.forEach(System.out::println);
					accList.forEach(System.out::println);
				}
					break;
				case 5: {
					Collections.sort(accList, new DateComparator());
					accList.forEach(System.out::println);
//					System.out.println(accList);
				}
					break;
				case 6: {
					Collections.sort(accList, new BalanceValidator());

accList.forEach(System.out::println);
//					System.out.println(accList);
				}
					break;
				}
			} while (choice != 7);
		}
	}
}
