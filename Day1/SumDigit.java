public class SumDigit{
public static void main(String [] args){
	System.out.println(SumDigit.add(2345));
	System.out.println(SumDigit.adds(2345));
	
			
}


public static int add(int num){

	int sum = 0;
	for(; num>0; num /= 10){

		int lastDigit = num % 10;
		 sum = sum + lastDigit;

		}

	return sum;
}

public  static int adds(int num){
if(num == 0)
return 0;
//int sum = 0;

return num%10 + SumDigit.adds(num / 10);
}






}