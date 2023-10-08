package practice;
import java.util.Scanner;
public class ChaiWala {
   public static void main(String[] args) 
   {
	makechai();
	makechai(5);
   }
   static void makechai()
   {
	   Scanner scan=new Scanner(System.in);
	   int a=scan.nextInt();
	   System.out.println("enter the cost for normal chai="+a);
   }
   static void makechai(int quantity)
   {
	   Scanner scan=new Scanner(System.in);
	   int chai=scan.nextInt();
	   System.out.println("chai for");
	   System.out.println("cost for "+quantity+ " chai ="+chai);
   }
}
