package practice;

import java.util.Scanner;

public class Vibgyor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char c =scan.next().charAt(0);
		switch (c){
		case'v':case 'V': 
			System.out.println("Violet");
			break;
		case 'i':case 'I':
			System.out.println("Indigo");
			break; 
		case 'b':case 'B':
			System.out.println("Blue");
		case 'g':case 'G':
			System.out.println("Green");
			break;
		case 'y':case 'Y':
			System.out.println("Yellow");
		case 'o':case 'O':
			System.out.println("Orange");
			break;
		case 'r':case 'R':
			System.out.println("Red");
		
		default:
			System.out.println("Not a rainbow colour");
		}
		scan.close();
	}
}
