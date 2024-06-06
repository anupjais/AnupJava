import java.util.Arrays;
class Example6
{
	public static void main(String[] args)
	{
		int num = 30;
		int [][][] a = new int[3][][];
		a[0] = new int[1][2];
		a[1] = new int[2][2];
		a[2] = new int[3][2];
		for (int[][] i : a) {
			System.out.println(i);
		}
		// System.out.println(Arrays.deepToString(a));
	}
}