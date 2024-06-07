import java.util.*;
class First10Numbers3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		// 10, 12, 68, 30, 222, 56
		System.out.println(Arrays.toString(arr));
	}
}