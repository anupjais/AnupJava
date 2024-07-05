// 11.Write a java program to Print elements from 3D array using do- while loop.
import java.util.Scanner;
import java.util.Arrays;
class Q11_Print3DArEleFDoWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x-axis : ");
		int x = sc.nextInt();
		System.out.print("Enter y-axis : ");
		int y = sc.nextInt();
		System.out.print("Enter z-axis : ");
		int z = sc.nextInt();

		int[][][] arr = new int[x][y][z];
		System.out.println("Enter elements..");
		int i=0;
		do
		{
			int j=0;
			do
			{
				int k=0;
				do
				{
					System.out.print((i+1)+", "+(j+1)+", "+(k+1)+" : ");
					arr[i][j][k] = sc.nextInt();
				}while(++k<z);
			}while(++j<y);
		}while(++i<x);
		
		System.out.println("The elements are..");
		i=0;
		do
		{
			int j=0;
			do
			{
				int k=0;
				do
				{
					System.out.print(arr[i][j][k]+" ");
				}while(++k<z);
				System.out.println();
			}while(++j<y);
		}while(++i<x);
	}
}