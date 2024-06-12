// wajp to merge arrays into a single arrays;
import java.util.*;
class MergeArrays
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
	 	
	 	System.out.print("Enter the size of 1st array : ");
	 	int size1 = sc.nextInt();
	 	int[] arr1 = inputArr(size1);
	 	System.out.print("Enter the size of 2nd array : ");
	 	int size2 = sc.nextInt();
	 	int[] arr2 = inputArr(size2);

	 	mergedArr(arr1,arr2);
	 	
	}
	static int[] inputArr(int size)
	{
		System.out.println("Enter elements");
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1 +" - ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static void mergedArr(int[] arr1, int[] arr2)
	{
		int[] arr=new int[arr1.length+arr2.length];
		int i=0;
		for(; i<arr1.length; i++)
		{
			arr[i]=arr1[i];
		}
		for(int j=0; j<arr2.length; j++)
		{
			arr[i++]=arr2[j];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
	}
}