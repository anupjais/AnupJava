import java.util.*;
class First10Numbers4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		// 5, 26, 17, 124, 37, 342
		System.out.println(Arrays.toString(arr));
	}
}