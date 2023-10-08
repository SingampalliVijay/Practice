package practice;

public class Car {
	String model;
	String manufacture;
	String color;
	void drive()
	{
		System.out.println("car started driving");
	}
    void honk()
    {
    	System.out.println("Poo...Poo...");
    }
//     void givedata(String a,String b,String c)
//    {
//    	model=a;
//    	manufacture=b;
//    	color=c;
//    }
    Car(String model,String manufacture,String color)
    {
    this.model=model;
    this.manufacture=manufacture;
    this.color=color;
    }
}
