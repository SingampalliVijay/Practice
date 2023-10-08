package practice;

public class CodeApp {
	public static void main(String[] args) 
	{
		Code c1=new Code();
		c1.main="public static void main";
		c1.semicolumn="after the we use ; ";
		c1.paranthesis=" we can use { after main ";
		System.out.println("main= "+c1.main);
		System.out.println("semicolumn ="+c1.semicolumn);
		System.out.println("paranthesis= "+c1.paranthesis);
		c1.Run();
		c1.Error();
	}

}
