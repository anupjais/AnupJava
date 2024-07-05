// 13.Find number of elements without using length variable.
import java.util.Scanner;
class Q13_Length
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
			arr[i]=sc.nextInt();
		}
		int len=0;
		for(int i: arr)
		{
			len++;
		}
		System.out.println("Length = "+len);
	}
}