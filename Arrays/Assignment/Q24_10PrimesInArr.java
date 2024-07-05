// 24.Find first 10 prime numbers and store it in an array.
import java.util.*;
class Q24_10PrimesInArr
{
	public static void main(String[] args)
	{
		int count=0;
		int[] primes = new int[10];
		for(int i=1; count<10; i++)
		{
			if(isPrime(i))
			{
				// System.out.print(i+" ");
				primes[count++]=i;
				// count++;
			}
		}
		System.out.println(Arrays.toString(primes));
	}
	public static boolean isPrime(int num)
	{
		boolean flag=true;
		if(num<2)
			flag=false;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}
