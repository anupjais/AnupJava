// 5. Write a java program to Print elements from2D array using for- loop.
import java.util.Scanner;
class ForEach_2D
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter the no. of cols : ");
		int cols = sc.nextInt();
		int[][] ar = new int[rows][cols];
		System.out.println("Enter the elements");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print((i+1)+", "+(j+1)+" : ");
				ar[i][j]=sc.nextInt();
			}
		}

		System.out.println("The elements are..");
		for(int[] i: ar)
		{
			for(int j: i)
			{
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
}