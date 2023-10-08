//write a program to take an input and determine whether it is a positive or negative number
package practice;
import java.util.Scanner;
public class PositiveorNegative {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" give any number =");
	int num=scan.nextInt();
	if (num>0)
	{
		System.out.println("given number is positive");
	}
	else
	{
		System.out.println("given number is negative");
	}
	scan.close();
}
}
