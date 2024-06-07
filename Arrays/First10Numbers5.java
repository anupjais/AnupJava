import java.util.*;
class First10Numbers5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		arr[0] = 2;
		int pow = 2;
		// 2, 6, 22, 278, 65814
		for(int i=1; i<arr.length; i++)
		{
			pow *= pow;
			arr[i] = arr[i-1]+pow;
			// arr[i] = pow;
		}
		// for (int i : arr)
		// {
		// 	System.out.print(i+" ");
		// }
		System.out.println(Arrays.toString(arr));
	}
}