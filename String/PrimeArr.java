// wajpt fetch all prime in an array
import java.util.*;
class PrimeArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size=sc.nextInt();
		int[] arr = new int[size];
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
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}