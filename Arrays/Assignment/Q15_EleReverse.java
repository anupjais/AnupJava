// 15.Reverse elements in an array.
import java.util.Scanner;
import java.util.Arrays;
class Q15_EleReverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+" ");
			arr[i]=sc.nextInt();
		}
		int[] revArr = new int[arr.length];
		int count=0;
		for(int i=arr.length-1; i>=0; i--)
		{
			revArr[count++] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(revArr));
	}
}