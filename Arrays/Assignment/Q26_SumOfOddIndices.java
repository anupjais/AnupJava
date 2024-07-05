// 27.Find sum of all elements at odd indices in an array.
import java.util.Scanner;
import java.util.Arrays;
class Q26_SumOfOddIndices
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1+" : ");
			arr[i]=sc.nextInt();
			if(i%2!=0)
				sum+=arr[i];
		}
		System.out.println("The elements are : "+Arrays.toString(arr));
		System.out.println("The sum of odd indices = "+sum);
	}
}