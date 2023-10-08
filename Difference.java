package practice;
import java.util.Scanner;
public class Difference {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if (a>b)
		{
		System.out.println("difference ="+(a-b));	
		}
		else
		{
			System.out.println("difference="+(b-a));
		}
	}

}