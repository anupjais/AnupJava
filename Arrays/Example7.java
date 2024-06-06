import java.util.Arrays;
class Example7
{
	public static void main(String[] args)
	{
		int [][][][] a = new int[2][][][];
		a[0] = new int[2][1][1];
		a[1] = new int[2][][];
		a[1][0] = new int[1][1];
		a[1][1] = new int[2][1];
		a[1][2] = new int[3][1];
		System.out.println(Arrays.deepToString(a));
	}
}