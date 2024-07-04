// 2. Write a java program to Print elements from1D array using while- loop.
import java.util.Scanner;
class Q2_PrintEleWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter elements..");
		int i=0;
		while(i<arr.length)
		{
			System.out.print(i+1+" : ");
			arr[i++]=sc.nextInt();
		}
		System.out.println("\033[H\033[2J");
		System.out.println("The elements are..");
		int j=0;
		while(j<arr.length)
		{
			System.out.print(arr[j++]+" ");
		}
		System.out.println();
	}
}