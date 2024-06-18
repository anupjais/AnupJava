// wajpt check if the arr is palindrome
import java.util.*;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter something to check palindrome : ");
		// String data = sc.next();
		// String rData = reverse(data);
		// System.out.println(data==rData);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		char[] arr = new char[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1+" - ");
			arr[i]=sc.next().charAt(0);
		}

		char[] rArr = new char[size];
		for(int i=0,j=size-1; j>=0; j--)
		{
			rArr[i++]=arr[j];
		}
		System.out.println(Arrays.equals(arr,rArr)?Arrays.toString(arr)+" is Palindrome.":Arrays.toString(arr)+" is not Palindrome.");
	}
	// static String[] reverse(String )

}