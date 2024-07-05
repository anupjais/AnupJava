import java.util.Scanner;
import java.util.Arrays;
class InsertionSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1+" : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			int current = arr[i];
			int j=i-1;
			while(j>=0 && current < arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		System.out.println(Arrays.toString(arr));
	}
}