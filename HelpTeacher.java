// program to arithmetic operations with parameters with return type
package practice;
public class HelpTeacher {
  public static void main(String[] args) {
	int num1=20;
	int num2=5;
	int result=subtract(num1,num2);
	System.out.println("subtract="+result);
	int num3=4;
	int num4=5;
	int result1=multiply(num3,num4);
	System.out.println("multiply="+result1);
	double num5=20;
	double num6=4;
	double result2=divide(num5,num6);
	System.out.println("divide="+result2);
	int num7=10;
	int num8=3;
	int result3=remainder(num7,num8);
	System.out.println("remainde="+result3);
  }
static int subtract(int num1, int num2)
	  {
		  int subtract=num1-num2;
		  return subtract;
	  }
static int multiply(int num3, int num4)
{
	int multiply=num3*num4;
	return multiply;
}
static double divide(double num5, double num6)
{
	double divide=num5/num6;
	return divide;
}
static int remainder(int num7, int num8)
{
    int remainder=num7%num8;
    return remainder;
}
}