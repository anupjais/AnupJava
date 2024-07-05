// 25.Find first 10 Fibonacci numbers and store it in an array.
import java.util.Scanner;
import java.util.Arrays;
class Q25_10Fibbonacci
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter upto the fibbonacci : ");
		int count=sc.nextInt();
		int[] fibo = new int[count];
		System.out.print("\033[1;92mThe fibbonacci numbers are : \033[0m");
		fiboSeries(fibo);
		// System.out.print("The prime numbers are : ");
		System.out.println(Arrays.toString(fibo));
	}
	public static void fiboSeries(int[] fibo)
	{
		int num1 = 0;
		int num2 = 1;
		// System.out.print(num1+" "+num2);
		fibo[0]=num1;
		fibo[1]=num2;
		for(int i=2; i<fibo.length; i++)
		{
			int sum = num1+num2;
			// System.out.print(" "+sum);
			fibo[i]=sum;
			num1 = num2;
			num2 = sum;
		}
		// System.out.println();
	}
}