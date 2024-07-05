// 9.Write a java program to Print elements from3D array using for- loop.
import java.util.Scanner;
import java.util.Arrays;
class Q9_Print3DArEleFor
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
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				for(int k=0; k<z; k++)
				{
					System.out.print((i+1)+", "+(j+1)+", "+(k+1)+" : ");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("The elements are..");
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				for(int k=0; k<z; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
			}
			System.out.println();
		}
	}
}