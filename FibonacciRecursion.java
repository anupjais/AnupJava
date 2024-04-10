import java.util.*;
class FibonacciRecursion
{
	static int first = 0, second = 1;
	static int sum;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get upto the Fibonacci seriese : ");
		int num = sc.nextInt();
		System.out.print(first+" "+second+" ");
		fibonacci(num-2);
		System.out.println();
	}
	public static void fibonacci(int num)
	{
		sum = first + second;
		System.out.print(sum+" ");
		first = second;
		second = sum;

		if(--num==0)
			return;
		fibonacci(num);
	}
}