import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find factorial : ");
		int num = sc.nextInt();
		long fact = 1;
		for(int i=num; i>1; i--)
			fact*=i;
		System.out.println("The factorial of "+num+" is "+fact);
	}
}