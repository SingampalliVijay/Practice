package practice;

public class PuneriChai {
	public static void main(String[] args) {
		makechai();
		makechai(12);
		makechai("green");
		makechai("ginger",30);
		makechai("vennla",200,30);
	}
	static void makechai()
	{
		System.out.println("normal chai cost = 10");
	}
	static void makechai(int quantity)
	{
		System.out.println("the normal chai for "+ quantity +" cost ="+(quantity*10));
	}
	static void makechai(String flavour)
	{
		System.out.println("cost for "+flavour +" chai = 15");
	}
	static void makechai(String flavour,int quantity)
	{
		System.out.println("the cost for "+ flavour +" chai ="+(quantity*15));
	}
	static void makechai(String flavour,int cost,int quantity)
	{
		System.out.println("cost of "+flavour+" chai for "+quantity+" members ="+cost);
	}

}
