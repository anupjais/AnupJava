// import java.util.Scanner;
abstract class Arith
{
	abstract int addition(int num1, int num2);
	abstract int subtraction(int num1, int num2);
	abstract int multiplication(int num1, int num2);
	abstract int division(int num1, int num2);
	abstract int modulus(int num1, int num2);
}
class ArithImplementation extends Arith
{
	int addition(int num1,int num2)
	{
		return num1+num2;
	}
	int subtraction(int num1,int num2)
	{
		return num1-num2;
	}
	int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	int division(int num1,int num2)
	{
		// if(num2!=0)
		return num1/num2;
		// else
		// 	return 0;
	}
	int modulus(int num1,int num2)
	{
		// if(num2!=0)
		return num1%num2;
		// else
		// 	return 0;
		// return num1%num2;
	}
}
class AbstractExample
{
	public static void main(String[] args)
	{
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter first number : ");
		// int num1 = sc.nextInt();
		// System.out.print("Enter second number : ");
		// int num2 = sc.nextInt();
		
		ArithImplementation obj = new ArithImplementation();
		System.out.println(obj.addition(5,5));
	}
}