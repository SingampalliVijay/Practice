package practice;

public class AtmApp {
	public static void main(String[] args) {
		Atm a1=new Atm();
		a1.money=10000;
		a1.switches=1.0-9.0;
		a1.screen="touchpad";
		System.out.println("money of = "+a1.money+" withdrawn from ATM by using of "+a1.switches+"switches to insert my pin in the "+a1.screen);
		a1.Inserting();
		a1.Clicking();
		a1.Debiting();
		
	} 

}
