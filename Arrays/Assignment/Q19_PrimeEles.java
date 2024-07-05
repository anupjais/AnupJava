// 19.Find all prime elements present in an array.
import java.util.Scanner;
import java.util.Arrays;
class Q19_PrimeEles
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int prod=1;
		System.out.println("Enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+" ");
			arr[i]=sc.nextInt();
			prod*=arr[i];
		}
		System.out.println("The elements : "+Arrays.toString(arr));
		System.out.print("The prime elements are : ");
		for(int i:arr)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
		System.out.println();
	}
	public static boolean isPrime(int num)
	{
		boolean flag = true;
		if(num<2)
			flag=false;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag =  false;
				break;
			}
		}
		return flag;
	}
}