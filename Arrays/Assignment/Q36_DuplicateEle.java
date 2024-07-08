// 36.Find duplicate elements in an array.
import java.util.Arrays;
import java.util.Scanner;
class Q36_DuplicateEle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements..");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+" : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			if(isDuplicate(arr,i))
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static boolean isDuplicate(int[] arr,int num)
	{
		for(int i=num; i<arr.length; i++)
		{
			if(arr[i]==arr[num])
			{
				System.out.println(arr[i]);
				return true;
			}
		}
		return false;
	}
}