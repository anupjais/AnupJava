import java.util.*;
class First10Numbers7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		// 1, 3, 9, 3, 153, 873
		System.out.println(Arrays.deepToString(arr));
	}
}