import java.util.*;
class PrimeArray
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int count=0;
		for(int i:arr)
		{
			if(isPrime(i))
				count++;
		}
		System.out.println(count);
		// int indx=0;
		// int[] primeArr = new int[count];
		// for(int i:arr)			
		// {
		// 	for (int j=2; j<i; j++)
		// 	{
		// 		if(i%j==0)
		// 			break;
		// 	}
		// 	primeArr[indx++]=i;
		// }
		// System.out.println(Arrays.toString(primeArr));
	}

	static boolean isPrime(int num)
	{
		boolean flag = true;
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