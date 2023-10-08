package practice;
import java.util.Scanner;
public class Adding4 {
	public static void main(String[] args)
	{
	 System.out.print("enter 2 numbers");
	 Scanner scan = new Scanner(System.in);
	 int a =scan.nextInt();
	 int b =scan.nextInt();
	 int result=add(a,b);
	 System.out.print("sum ="+result);
	}
	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

}
