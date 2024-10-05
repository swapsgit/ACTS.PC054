package cdac.acts.assignment.day12;
import java.util.Date;
import java.time.LocalDate;
public class II_ApplicationFormBase {
	
	private String name;
	private Integer formNo;
	private LocalDate dOfBirth;
	private String degree;
	private String university;
	private LocalDate passoutYear;
	private String email;
	private String mobileNo;
	
	public II_ApplicationFormBase() {
	}
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private static int formcounter = 1;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getdOfBirth() {
		return dOfBirth;
	}

	public void setdOfBirth(LocalDate dOfBirth) {
		this.dOfBirth = dOfBirth;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public LocalDate getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(LocalDate passoutYear) {
		this.passoutYear = passoutYear;
	}

	II_ApplicationFormBase( String name, LocalDate dOfBirth, String degree, String university, LocalDate passoutYear, String email, String mobileNo) {
		formNo = formcounter++;
		this.name = name;
		this.dOfBirth = dOfBirth;
		this.degree = degree;
		this.university = university;
		this.passoutYear = passoutYear;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "II_ApplicationFormBase [Form no= "+formNo+",0 name= " + name + ", dOfBirth= " + dOfBirth + ", degree= " + degree
				+ ", university= " + university + ", passoutYear= " + passoutYear +", email= "+email+", mobileNo= "+mobileNo+ "]";
	}
	
	

}
