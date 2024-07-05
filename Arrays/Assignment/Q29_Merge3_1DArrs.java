// 29.Merge three 1D arrays.
import java.util.Scanner;
import java.util.Arrays;
class Q29_Merge3_1DArrs
{
	public static void main(String[] args)
	{
		int[] arr1 = array();
		int[] arr2 = array();
		int[] arr3 = array();
		// int[] mrg = merge1D(arr1,arr2);
		// int[] mrg = merge1D(arr1,arr2);
		System.out.println("The merged array : "+Arrays.toString(merge1D(arr1,arr2,arr3)));
		// System.out.println("The merged array : "+Arrays.toString(mrg));
	}
	public static int[] array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+" : ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int[] merge1D(int[] arr1,int[] arr2,int[] arr3)
	{
		int[] mrg = new int[arr1.length+arr2.length+arr3.length];
		int count=0,count1=0;
		for(int i=0; i<mrg.length; i++)
		{
			if(i<arr1.length)
			{
				mrg[i]=arr1[i];
				continue;
			}
			else if(count<arr2.length)
			{
				mrg[i]=arr2[count++];
				continue;
			}
			mrg[i]=arr3[count1++];
		}
		return mrg;
	}
}