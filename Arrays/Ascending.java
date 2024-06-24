// wajpt short the elements in ascending order
import java.util.*;
class Ascending
{
	public static void main(String[] args)
	{
		int [] arr1 ={5,7,2,3,4,8,9,1,6};
		
		System.out.println(Arrays.toString(arr1));
		// Arrays.sort(arr1);
		bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));

	}
	public static void bubbleSort(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j-1]<arr[j])
				{
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}