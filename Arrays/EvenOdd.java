// wajp to find the even and odd numbers in an array using the 1st syntex
import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Even numbers : ");
		for (int i=0; i<nums.length; i++)
		{
			if(nums[i]%2==0)
				System.out.print(nums[i]+" ");
		}
		System.out.print("\nOdd numbers : ");
		for (int i=0; i<nums.length; i++)
		{
			if(nums[i]%2!=0)
				System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
}