package practice;

public class CarApp {
  public static void main(String[] args) {
	Car c1=new Car("i20","hyundai","blue");
//	c1.givedata("i20", "Hyundai","blue");
//	c1.model="i20";
//	c1.manufacture="Hyundai";
//	c1.color="blue";
	System.out.println("model="+c1.model+"manufature="+c1.manufacture+"color="+c1.color);
	c1.drive();
	c1.honk();
	Car c2=new Car("xuv700","mahindra","white") ;
//	c2.givedata("xuv700","Mahindra","white");
//	c2.model="xuv700";
//	c2.manufacture="Mahindra";
//	c2.color="white";
	System.out.println("model="+c1.model+"manufature="+c1.manufacture+"color="+c1.color);
	c2.drive();
	c2.honk();
}
}
