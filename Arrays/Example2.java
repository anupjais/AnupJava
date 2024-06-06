import java.util.Arrays;
class Example2
{
	public static void main(String[] args)
	{
		byte [][] a = new byte[3][];
		a[0] = new byte[2];
		a[1] = new byte[1];
		a[2] = new byte[2];

		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[2][0] = 40;
		a[2][1] = 50;
		// System.out.println(Arrays.deepToString(a));
		for (byte[][] i : a)
		{
			System.out.println(i);
		}
	}
}
