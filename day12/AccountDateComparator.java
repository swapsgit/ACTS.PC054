package cdac.acts.assignment.day12;
import java.util.Comparator;
public class AccountDateComparator implements Comparator<I_AccountBase>{

	@Override
	public int compare(I_AccountBase o1, I_AccountBase o2) {
		// TODO Auto-generated method stub
		return Integer.valueOf(o1.getAccNO()).compareTo(Integer.valueOf(o2.getAccNO()));
	}

}
