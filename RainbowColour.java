package practice;

import java.util.Scanner;

public class RainbowColour {
    public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Character");
		char c=scan.next().charAt(0);
		if (c=='V' && c=='v') {
			System.out.println("Rainbow colour");
		}
		else if (c=='I' && c=='i') {
			System.out.println("Rainbow colour");
		}
		else if (c=='B' && c=='b') {
			System.out.println("Rainbow colour");
		}
		else if (c=='G' &&c== 'g') {
			System.out.println("Rainbow colour");
		}
		else if(c=='Y' &&c== 'y') {
			System.out.println("Rainbow colour");
		}
		else if(c=='O' &&c== 'o') {
			System.out.println("Rainbow colour");
		}
		else if(c=='R'&& c=='r') {
			System.out.println("Rainbow colour");
		}
		else
		{
			System.out.println("Not a rainbow colour");
		}
		scan.close();
    }
}
