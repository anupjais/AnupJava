// 10.Write a java program to Print elements from 3D array using while-loop.
import java.util.Scanner;
import java.util.Arrays;
class Q10_Print3DArEleFWhile
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
		while(i<x)
		{
			int j=0;
			while(j<y)
			{
				int k=0;
				while(k<z)
				{
					System.out.print((i+1)+", "+(j+1)+", "+(k+1)+" : ");
					arr[i][j][k++] = sc.nextInt();
				}
				j++;
			}
			i++;
		}
		
		System.out.println("The elements are..");
		i=0;
		while(i<x)
		{
			int j=0;
			while(j<y)
			{
				int k=0;
				while(k<z)
				{
					System.out.println(arr[i][j][k++]+" ");
				}
				// System.out.println();
				j++;
			}
			System.out.println();
			i++;
		}
	}
}