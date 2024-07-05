// 23.Find first 10 prime numbers and store it in an array.
// import java.util.Scanner;
import java.util.Arrays;
class Q23_10Primes
{
	public static void main(String[] args)
	{
		int count=0;
		int[] primes = new int[10];
		System.out.print("The prime numbers are : ");
		for(int i=1; count<10; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
				// count++;
				primes[count++]=i;
			}
		}
		// System.out.print("The prime numbers are : ");
		// System.out.println(Arrays.toString(primes));
	}
	public static boolean isPrime(int num)
	{
		boolean flag = true;
		if(num<2)
			flag = false;
		for(int i=2; i<num; i++)
		{
			if(num%i==2)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}