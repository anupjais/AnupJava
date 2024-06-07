// wajptf an element in an array
import java.util.*;
class FindElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr [] = {1,2,3,4,5,6,7,8};
		System.out.print("Find number : ");
		int key = sc.nextInt();
		boolean flag = true;
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				System.out.println("The element at : "+(i+1));
				flag=false;
				break;
			}
			// flag = false;
		}
		if(flag)
		{
			System.out.println(key+" not found.");
		}
	}
}