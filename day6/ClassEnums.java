package cdac.acts.day6;

public enum ClassEnums {
	DAC("Diploma in Advance Computing"),
	DESD("Diploma in Embedded System D"),
	DAI("Diploma in Artificial Intelligence"),
	DETISS("Diploma in ETISS");
	
	String str;
	
	private ClassEnums(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
	
}
