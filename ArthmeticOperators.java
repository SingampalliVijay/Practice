package practice;

import java.util.Scanner;

public class ArthmeticOperators {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int substraction=substraction(a,b);
		int product=product(a,b);
		double quotient=quotient(a,b);
		int remainder=remainder(a,b);
		System.out.println("substraction="+substraction);
		System.out.println("product="+product);
		System.out.println("quotient="+quotient);
		System.out.println("remainder="+remainder);
    }

	static int remainder(int a, int b) {
	     
		return a%b;
	}

	static double quotient(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

   static int product(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

    static int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
    
}
