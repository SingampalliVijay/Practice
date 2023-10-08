package practice;
import java.util.Scanner;
public class Votingdemo {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
	System.out.println("Enter your age");
	if (age>=18)
	{
		System.out.println("Eligible for voting");
	}
	else
	{
		System.out.println("Not eligible for voting");
	}
}
}
