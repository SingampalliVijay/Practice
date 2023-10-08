package practice;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter 2 Strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		String s3=stringjoiner(s1,s2);
		System.out.println("Joiner="+s3);
	}

	 static String stringjoiner(String s1, String s2) {
		 
		return s1+s2;
	}
} 