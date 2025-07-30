package practice;

import java.util.Scanner;

//Simple Calculator
public class Task2 {
	static int add(int x,int y) {
		int sum=x+y;
		return sum;
	}
	static int sub(int x, int y) {
		int sub=x-y;
		return sub;
	}
	static int mul(int x, int y) {
		int mul=x*y;
		return mul;
	}
	static int div(int x, int y) {
		int div=x/y;
		return div;
	}
	static int mod(int x, int y) {
		int mod= x%y;
		return mod;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Simple Arithmetic Calculator \n Enter the first number: ");
		int a=s.nextInt();
		System.out.println("Enter the second number: ");
		int b=s.nextInt();
		System.out.println("Enter the choice of operation: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.modulus");
		int c=s.nextInt();
		switch(c) {
		case 1:
			System.out.println("Sum: "+ add(a,b));
			break;
		case 2:
			System.out.println("Difference: "+sub(a,b));
			break;
		case 3:
			System.out.println("Product: "+mul(a,b));
			break;
		case 4:
			System.out.println("Division: "+div(a,b));
			break;
		case 5:
			System.out.println("Modulus: "+mod(a,b));
			break;
		default:
			System.out.println("You gave Invalid input");
		}
	}

}
/*Output
Simple Arithmetic Calculator 
 Enter the first number: 
77
Enter the second number: 
33
Enter the choice of operation: 
 1.Addition 
 2.Subtraction 
 3.Multiplication 
 4.Division 
 5.modulus
2
Difference: 44

*/