//write a program to take an input and find out whether it is even or odd number
package practice;
import java.util.Scanner;
public class EvenorOdd 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
	if (num%2==0)
	{
		System.out.println("the given number is even");
	}
	else
	{
		System.out.println("the given number is odd");
	}
	}
}
