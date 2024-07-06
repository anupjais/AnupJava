// 34.Create a clone of 3D array without using clone().
import java.util.Scanner;
import java.util.Arrays;
class Q34_Clone3DArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of x-axis : ");
		int x = sc.nextInt();
		System.out.print("Enter the number of y-axis : ");
		int y = sc.nextInt();
		System.out.print("Enter the number of z-axis : ");
		int z = sc.nextInt();
		
		int[][][] arr = new int[x][y][z];
		System.out.println("Enter the data");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print((i+1)+", "+(j+1)+", "+(k+1)+", "+" : ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}

		int[][][] clone = userClone(arr);
		System.out.println("The cloned array elements are :");
		for(int i=0; i<clone.length; i++)
		{
			for(int j=0; j<clone[i].length; j++)
			{
				for(int k=0; k<clone[j].length; k++)
				{
					System.out.print(clone[i][j][k]+" ");
				}
				System.out.println();
			}
			// System.out.println();
		}
	}
	public static int[][][] userClone(int[][][] arr)
	{
		int[][][] clone = new int[arr.length][arr[0].length][arr[0][0].length];
		for(int i=0; i<clone.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[j].length; k++)
				{
					clone[i][j][k] = arr[i][j][k];
				}
			}
		}
		return clone;
	}
}