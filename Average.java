// write a java program except 8 sem marks as an input and calculate the avg for the sem
package practice;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter your marks");
     int sem1=scan.nextInt();
     int sem2=scan.nextInt();
     int sem3=scan.nextInt();
     int sem4=scan.nextInt();
     int sem5=scan.nextInt();
     int sem6=scan.nextInt();
     int sem7=scan.nextInt();
     int sem8=scan.nextInt();
     int average=Average(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
     System.out.println("Average of 8 sems ="+average);
     scan.close();
    }

	 static int Average(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		// TODO Auto-generated method stub
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}

        
}