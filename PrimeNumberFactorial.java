import java.util.Scanner;
class PrimeNumberFactorial
{
	static int num;
	static int i=2;
	static boolean flag = true;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check prime : ");
		num = sc.nextInt();
		isPrime(num);
		System.out.println(flag?num+" is Prime.":num+" is not Prime.");
	}
	public static void isPrime(int num)
	{
		if(i==num)
		{
			return ;
		}
		if(num%i==0)
		{
			flag = false;
			return ;
			// return flag;
		}
		i++;

		isPrime(num);
	}
}