// 33.Create a clone of 2D array without using clone().
import java.util.Scanner;
import java.util.Arrays;
class Q33_Clone2DArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of cols : ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the data");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(i+1+", "+(j+1)+" : ");
				arr[i][j]=sc.nextInt();
			}
		}

		int[][] clone = userClone(arr);
		System.out.println("The cloned array elements are :");
		for(int i=0; i<clone.length; i++)
		{
			for(int j=0; j<clone[i].length; j++)
			{
				System.out.print(clone[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] userClone(int[][] arr)
	{
		int[][] clone = new int[arr.length][arr[0].length];
		for(int i=0; i<clone.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				clone[i][j]=arr[i][j];
			}
		}
		return clone;
	}
}