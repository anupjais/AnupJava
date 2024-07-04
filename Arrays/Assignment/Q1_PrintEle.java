// 1. Write a java program to Print elements from1D array using for- loop.
import java.util.Scanner;
import java.util.Arrays;
class Q1_PrintEle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Inter the array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("\033[H\033[2J");
		System.out.println("Please enter the elements..");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+" : ");
			arr[i]=sc.nextInt();
		}

		System.out.println("\033[H\033[2J");
		System.out.println("By using while loop");
		int i=0;
		while(i<arr.length)
		{
			System.out.print(arr[i++]+", ");
		}

		System.out.println("\b\b\n\nBy using do while loop");
		int j=0;
		do
		{
			System.out.print(arr[j++]+", ");
		}while(j<arr.length);

		System.out.println("\b\b\n\nBy using for loop");
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]+", ");
		}

		System.out.println("\b\b\n\nBy using forEach loop");
		for(int l: arr)
		{
			System.out.print(l+", ");
		}

		System.out.println("\b\b\n\nBy using in-built method");
		System.out.println(Arrays.toString(arr));
	}
}