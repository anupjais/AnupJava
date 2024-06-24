// wajpts first 10 prime numbers in a new array
import java.util.*;
class Primes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to start : ");
		int num=sc.nextInt();
		int[] arr = new int[num];

		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1+" : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Prime Numbers");
		for(int i:arr)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
		System.out.println();
	}
	static boolean isPrime(int i)
	{
		boolean flag = true;
		if(i<2)
			flag=false;
		else
		{
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
}

/*
		for(int i=0, k=num; k<arr.length; k++)
		{
			if(isPrime(k))
				arr[i++]=k;
		}
		System.out.println(Arrays.toString(arr));
	}
	static boolean isPrime(int num)
	{
		boolean flag = true;
		if(num<2)
			flag=false;
		else
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
}
*/