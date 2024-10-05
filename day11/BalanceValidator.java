package cdac.acts.assignment.day11;
import java.util.Comparator;
public class BalanceValidator implements Comparator<I_AccountBase>{

	@Override
	public int compare(I_AccountBase o1, I_AccountBase o2) {
		// TODO Auto-generated method stub
		return Double.valueOf(o2.getBalances()).compareTo(o1.getBalances());
	}


}
