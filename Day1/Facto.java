public class Facto{

public static void main(String []args){

	// System.out.println(Facto.factorial(5));
	Facto.series(5);
}


public static int factorial(int n){

		int res = 1;
		for(int i = 1; i<=n; i++){
			 res = res * i;
			
}

		return res;
}


public static void  series(int n1){
		int a = 0;
		for(int i = 1; i<=n1; i++){
	 System.out.print(Facto.factorial(i) + " " );
		
		
		}
	
	


}












}