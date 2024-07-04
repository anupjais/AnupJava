// 4. Write a java program to Print elements from 1D array using for-each loop.
import java.util.Scanner;
class Q4_PrintEleForEach
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int[] ar = new int[size];

		System.out.println("Enter the elements");
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(i+1+" : ");
			ar[i]=sc.nextInt();
		}

		System.out.println("The elements are..");
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
	}
}