package cdac.acts.assignment.day12;

/*1. Create simple List using LinkedList of Account implement below menu
Menus
1 Accept A/C details from user
2 Display all Accounts content using Enhanced For loop
3 Accept account No &amp; display details or error message if account Not
Found ( Create AccountNotFoundException)
4 Accept From A/C NO and To Accoun ID and to Funds transfer. ( check
for min Bal Exception)
5 Accept A/C NO &amp; remove A/C from List
6 Apply interest on all saving A/C
7 Sort accounts as per ascending A/C No.
8 Sort by accountOpeningDate*/

import java.lang.Comparable;
import java.time.LocalDate;
public class I_AccountBase implements Comparable<I_AccountBase>{
	private int accNO;
	private String accName;
	private LocalDate dateOfOpening;
	private double balances;
	
	I_AccountBase(int accNO,String accName,LocalDate dateOfOpening,double balances) {
		this.accNO = accNO ;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balances = balances;
		}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public double getBalances() {
		return balances;
	}

	public void setBalances(double balances) {
		this.balances = balances;
	}

	@Override
	public String toString() {
		return "I_AccountBase [accNO=" + accNO + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening
				+ ", balances=" + balances + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof I_AccountBase) {
			I_AccountBase acc = (I_AccountBase)obj;
			return this.accNO == acc.accNO;
		}
		return false;
		
	}
	@Override
	public int compareTo(I_AccountBase obj) {
		// TODO Auto-generated method stub
		return this.dateOfOpening.compareTo(obj.dateOfOpening);
	}
	
	public int compareAccNoTo(I_AccountBase o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.accNO).compareTo(Integer.valueOf(o.accNO));
	}

}
