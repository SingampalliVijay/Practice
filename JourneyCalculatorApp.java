package practice;

import java.util.Scanner;

public class JourneyCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	JourneyCalculator j1=new JourneyCalculator();
	System.out.println("Enter the values");
	j1.speed=scan.nextDouble();
	j1.time=scan.nextDouble();
double c=j1.calculateDistance(j1.speed,j1.time);
	System.out.println("Distance="+c);
	
	
//}

 //static double calculateddistance( double speed,double time) {
	
	//return speed*time;
}
}
