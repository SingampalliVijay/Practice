package practice;

import java.util.Scanner;

public class Messagedecoder {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Character");
	char c =scan.next().charAt(0);
	int uniCodeCharacter=messagedecoder(c);
	System.out.println("The unicode for "+c+" ="+uniCodeCharacter);
}
    static int messagedecoder(char c) {
	
	return (int)c ;
}
}
 