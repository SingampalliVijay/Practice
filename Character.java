//write a program to accept a character and find out whether vowel or consonant
package practice;
import java.util.Scanner;
public class Character {

	public static void main(String[] args) {
	   Scanner scan= new Scanner(System.in);
	   System.out.println("Give any character");
	   char c=scan.next().charAt(0);
	   if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	   {
		   System.out.println("Given character is vowel");
	   }
	   else if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	   {
		   System.out.println("Given character is vowel");
	   }
	   else
		   {
			   System.out.println("Given character is consonant");
		   }
	   scan.close();
	}

}
