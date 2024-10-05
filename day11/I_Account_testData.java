package cdac.acts.assignment.day11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import cdac.acts.assignment.day11.Utils.I_ValidationUtils;

public class I_Account_testData {
	
public static List<I_AccountBase> getAccList() {
		
		List<I_AccountBase> list = new ArrayList<>();
		
		LocalDate validDOJ = I_ValidationUtils.validateDate("2000-01-01");
		double bal = I_ValidationUtils.validBalance(1500);
		
		
		list.add(new I_AccountBase(124, "Ganesh", validDOJ, bal));
		list.add(new I_AccountBase(123, "Dinesh", validDOJ, bal));
		list.add(new I_AccountBase(126, "Rupesh", validDOJ, bal));
		list.add(new I_AccountBase(125, "Deepali", validDOJ, bal));
		list.add(new I_AccountBase(127, "Rupali", validDOJ, bal));
		return list;
		
	}

}
