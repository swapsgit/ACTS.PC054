import java.util.Scanner;
import java.lang.ArithmeticException;
public class ArithOperation {
public static void main(String[] args) {
int a = 15, b = 10;
int choice = 0;
Scanner sc = new Scanner(System.in);
do{
System.out.print("Enter first number: ");
a = sc.nextInt();
System.out.println();
System.out.print("Enter second number: ");
b = sc.nextInt();
System.out.println("Enter 1 to add, 2 to substract, 3 to multipy, 4 to divide, 0 to exit");
choice = sc.nextInt();
/*String ch = sc.next();
sc.close();
char ch1 = (String) ch;*/
switch(choice){
case 1:{
System.out.println(ArithOperation.add(a, b));
break;
}
case 2:{
System.out.println(ArithOperation.substract(a, b));
break;
}
case 3:{
System.out.println(ArithOperation.multiply(a, b));
break;
}
case 4:{
System.out.println(ArithOperation.divide(a, b));
break;
}
}}while(choice != 0);
}
public static int add(int a, int b) {
return a + b;
}
public static int substract(int a, int b) {
return a - b;
}
public static int multiply(int a, int b) {
return a * b;
}
public static int divide(int a, int b) {
try{
return a / b;
}catch(ArithmeticException ar){
ar.printStackTrace();
System.out.println("Cannot divide by zero");
}
return 0;
}

}