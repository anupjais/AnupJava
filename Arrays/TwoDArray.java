import java.util.*;
class TwoDArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of Cols : ");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];
		int sum=0,prod=1;
		System.out.println("Enter the array elements");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print((i+1) + (j+1) + " - ");
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
				prod*=arr[i][j];
			}
		}
		System.out.println("\033[H\033[2J");
		System.out.println("Elements are..");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+prod);
	}
}