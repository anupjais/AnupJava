// 32.Create a clone of 1D array without using clone().
import java.util.Scanner;
import java.util.Arrays;
class Q32_CloneArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the data");
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1+" : ");
			arr[i]=sc.nextInt();
		}

		int[] clone = userClone(arr);
		System.out.println("The cloned array elements : "+Arrays.toString(clone));
	}
	public static int[] userClone(int[] arr)
	{
		int[] clone = new int[arr.length];
		for(int i=0; i<clone.length; i++)
		{
			clone[i]=arr[i];
		}
		return clone;
	}
}