// 16.Find product of all elements present in an array.
import java.util.Scanner;
import java.util.Arrays;
class Q16_ElesProduct
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int prod=1;
		System.out.println("Enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+" ");
			arr[i]=sc.nextInt();
			prod*=arr[i];
		}
		
		System.out.println("The elements : "+Arrays.toString(arr));
		System.out.println("The product : "+prod);
	}
}