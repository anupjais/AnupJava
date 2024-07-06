			// TARGETED BUT NOT COMPLETED.
// 30. Merge elements of a 2D array.
import java.util.Scanner;
import java.util.Arrays;
class Q30_Merge2dArr
{
	public static void main(String[] args)
	{
		int[][] arr1 = array();
		int[][] arr2 = array();
		int[][] mrg = merge1D(arr1,arr2);
		// int[] mrg = merge1D(arr1,arr2);
		// System.out.println("The merged array : "+Arrays.toString(merge1D(arr1[0],arr2[0])));
		System.out.println("The merged array : "+Arrays.toString(mrg));
	}
	public static int[][] array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of cols : ");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elements");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(i+1+", "+j+1+" : ");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static int[][] merge1D(int[][] arr1,int[][] arr2)
	{
		int[][] mrg = new int[arr1[0].length+arr2[0].length][arr1[1].length+arr2[1].length];
		for(int i=0; i<mrg.length; i++)
		{
			int count=0;
			for(int j=0; j<mrg[i].length; j++)
			{
				if(i<arr1.length)
				{
					mrg[i][j]=arr1[i][j];
					continue;
				}
				mrg[i][j]=arr2[i][count++];
			}
		}
		return mrg;
	}
}