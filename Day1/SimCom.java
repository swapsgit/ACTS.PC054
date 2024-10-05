import java.lang.Math;

public class SimCom {
	public static void main(String [] args){
	System.out.println(SimCom.simpleInterest(12000,12,3));
	System.out.println(compoundInterest(23000,12, 4, 1));

}
public static float simpleInterest(int prin, float rate, float year){

	return ((prin * rate * year)/100);
}

public static double compoundInterest(int prin, float rate , float year, int yearlyCompounded ){
	float r = rate/100;
	float a = (1-r/yearlyCompounded);
	float b = year*yearlyCompounded;
	return   prin *(Math.pow(a , b));
}
	

}