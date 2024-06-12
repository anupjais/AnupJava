import java.util.*;
class First10Numbers51
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int len = sc.nextInt();
		long[] arr = new long[len];
		arr[0] = 2;
		long pow = 2;
		// 2, 6, 22, 278, 65814
		for(int i=1; i<arr.length; i++)
		{
			pow *= pow;
			arr[i] = arr[i-1]+pow;
			// arr[i] = pow;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}