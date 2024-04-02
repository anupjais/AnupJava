import java.util.Scanner;
class PrimeMethod
{
	public static void main(String[] args) {
		System.out.println("The Prime numberes are : ");
		for(int i=2; i<1000; i++)
		{
			isPrime(i);
		}
	}
	public static void isPrime(int num)
	{
		boolean flag = true;
		for(int i = 2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.print(num+" ");
		// else
		// 	System.out.print(num+" ");
	}
}