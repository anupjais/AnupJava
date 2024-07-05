import java.util.Arrays;
import java.util.Scanner;
class RotateEle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {4,2,1,3,5};
		int[] rot = new int[arr.length];
		System.out.print("Enter the iteration : ");
		int iteration=sc.nextInt();
		// int iteration=2;
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<iteration; i++)
		{
			// int cnt=0;
			int temp = arr[0];
			// int temp = arr[i];
			for(int j=0; j<arr.length-1; j++)
			{
				// rot[cnt++] = arr[j];
				arr[j]=arr[j+1];
				// arr[j] = temp;
			}
			arr[arr.length-1] = temp;
			// arr
			// a
		}
		System.out.println(Arrays.toString(arr));

	}
}