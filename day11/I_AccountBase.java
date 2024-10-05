package cdac.acts.assignment.day11;

/*Create Account class with accNO, accName, dateOfOpening, balances( please note that you need to create new account class and not to use extsing account Hiraechy).
Use LocalDate for  date of opening .



Validations:
1. Add validation for date of opening is not future date
2. balance should be more than 1000*/
import java.time.LocalDate;
public class I_AccountBase {
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

}
