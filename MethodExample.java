import java.util.Scanner;
class MethodExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Execution statrs here ..");
		myMethod();
		System.out.print("Enter a number to check chec kEven Odd : ");
		int num=sc.nextInt();
		checkEvenOdd(num);

		System.out.println("Execution ENDS here ..");
	}

	public static void myMethod()
	{
		System.out.println("\033[31mWelcome to Methods Journey\033[0m");
	}
	public static void checkEvenOdd(int num)
	{
		if (num%2==0)
		{
			System.out.println("\033[95;1m"+num+"\033[0m is an even number");
		}else
			System.out.println("\033[95;1m"+num+"\033[0m is an odd number");
	}
}