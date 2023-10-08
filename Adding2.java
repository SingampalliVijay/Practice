package practice;
import java.util.Scanner;
public class Adding2 {
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter numbers");
	  int a =scan.nextInt();
	  int b =scan.nextInt();
	    add(a,b);
  }
  static void add(int x,int y)
  {
	  int sum=x+y;
	  System.out.print("sum ="+sum);
	  
  }
}
