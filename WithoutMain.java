import java.util.Scanner;
class WithoutMain
{
	static int op;
	static
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number : ");
		int num2 = sc.nextInt();
		op = addition(num1,num2);
		System.out.println(op);
		// System.exit(0);
	}
	// public static void main(String[] args) {
		
	// }
	public static int addition(int num1, int num2)
	{
		return num1+num2;
	}
}