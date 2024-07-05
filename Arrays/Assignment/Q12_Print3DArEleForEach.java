// 12.Write a java program to Print elements from 3D array using for- each loop.
import java.util.Scanner;
import java.util.Arrays;
class Q12_Print3DArEleForEach
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
		for(int[][] m : arr)
		{
			for(int[] n: m)
			{
				for(int o: n)
				{
					System.out.print(o+" ");
				}
				System.out.println();
			}
		}
	}
}