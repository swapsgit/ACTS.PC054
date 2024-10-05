package cdac.acts.assignment.day11;

import java.time.LocalDate;
import java.util.Comparator;
public class DateComparator implements Comparator<I_AccountBase> {

	@Override
	public int compare(I_AccountBase o1, I_AccountBase o2) {
		// TODO Auto-generated method stub
		return o1.getDateOfOpening().compareTo(o2.getDateOfOpening());
	}

	
	
}
