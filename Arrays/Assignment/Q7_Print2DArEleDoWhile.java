// 7.Write a java program to Print elements from 2D array using do- while loop.
import java.util.Scanner;
import java.util.Arrays;
class Q7_Print2DArEleDoWhile
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
		do
		{
			int j=0;
			do
			{
				System.out.print((i+1)+", "+(j+1)+" : ");
				ar[i][j]=sc.nextInt();
			}while(++j<cols);
		}while(++i<rows);

		System.out.println("The elements are..");
		i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(ar[i][j]+" ");
			}while(++j<cols);
		}while(++i<rows);
		System.out.println();
	}
}