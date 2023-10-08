package practice;

import java.util.Scanner;

public class MarksCase {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your Marks");
	int m=scan.nextInt();
	switch (m) {
	case (9):
		System.out.println("A grade");
	break;
	case (8):
		System.out.println("B grade");
	case (7):
		System.out.println("C grade");
	case (6):
		System.out.println("D grade");
	case (5):
		System.out.println("E grade");
	default:
		System.out.println("Try again...!");
	}
	scan.close();
}
}
