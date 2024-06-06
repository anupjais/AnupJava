import java.util.Arrays;
class Example4
{
	public static void main(String[] args)
	{
		int i = 10;
		int [][][] a = new int[2][2][];
		a[0][0] = new int[1];
		a[0][1] = new int[2];
		a[1][0] = new int[1];
		a[1][1] = new int[3];

		a[0][0][0] = i++;

		a[0][1][0] = i++;
		a[0][1][1] = i++;

		a[1][0][0] = i++;
		
		a[1][1][0] = i++;
		a[1][1][1] = i++;
		a[1][1][2] = i++;
		
		// System.out.println(Arrays.deepToString(a));
		for (int[][] j : a)
		{
			System.out.println(a);
		}
	}
}