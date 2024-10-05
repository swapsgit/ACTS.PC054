package cdac.acts.assignment.day11;
import java.util.Comparator;
public class AccountNameValidator implements Comparator<I_AccountBase>{

	@Override
	public int compare(I_AccountBase o1, I_AccountBase o2) {
		// TODO Auto-generated method stub
		return o1.getAccName().compareTo(o2.getAccName());
	}

}
