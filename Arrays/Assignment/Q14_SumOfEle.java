// 14.Find sum of all elements present in an array.
import java.util.Scanner;
class Q14_SumOfEle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum=0;

		System.out.println("Enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+ " : ");
			arr[i] = sc.nextInt();
			sum+= arr[i];
		}
		System.out.println("The sum = "+sum);
	}
}