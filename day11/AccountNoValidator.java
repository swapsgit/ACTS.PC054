package cdac.acts.assignment.day11;
import java.util.Comparator;

public class AccountNoValidator implements Comparator<I_AccountBase> {

	public int compare(I_AccountBase o1, I_AccountBase o2) {
		
		return Integer.valueOf(o2.getAccNO()).compareTo(Integer.valueOf(o1.getAccNO()));
	}

}
