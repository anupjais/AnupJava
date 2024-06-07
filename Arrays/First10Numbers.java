import java.util.*;
class First10Numbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// 6,24,12,48,24,96
		System.out.print("Enter the number of elements : ");
		int len = sc.nextInt();
		// int num = 6;
		int[] arr = new int[len];
		arr[0]=6;
		for(int i=1; i<arr.length; i++)
		{
			if(i%2==0)
				arr[i] = arr[i-1]/2;
			else
				arr[i] = arr[i-1]*4;
		}
		// for (int i : arr)
		// {
		// 	System.out.print(i+" ");
		// }
		System.out.println(Arrays.toString(arr));
	}
}