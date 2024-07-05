// 6.Write a java program to Print elements from 2D array using while - loop.
import java.util.Scanner;
import java.util.Arrays;
class Q6_Print2DArEleWhile
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
		int i=0;
		while(i<rows)
		{
			int j=0;
			while(j<cols)
			{
				System.out.print((i+1)+", "+(j+1)+" : ");
				ar[i][j++]=sc.nextInt();
			}
			i++;
		}

		System.out.println("The elements are..");
		i=0;
		while(i<rows)
		{
			int j=0;
			while(j<cols)
			{
				System.out.print(ar[i][j++]+" ");
			}
			i++;
			System.out.println();
		}
		System.out.println();
	}
}