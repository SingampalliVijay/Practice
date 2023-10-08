package practice;
import java.util.Scanner;
public class Addingdemo {
	public static void main(String[] args)
	{
		int result=add();
		System.out.print("sum ="+result);
	}
	static int add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a+b;
		return sum;
	}

}
