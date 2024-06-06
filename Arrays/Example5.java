import java.util.Arrays;
class Example5
{
	public static void main(String[] args)
	{
		int i = 20;
		int [][][] a = new int[2][][];
		a[0] = new int[3][1];
		a[1] = new int[2][];

		a[1][0] = new int[2];
		a[1][1] = new int[3];

		a[0][0][0] = i++;
		a[0][1][0] = i++;
		a[0][2][0] = i++;

		a[1][0][0] = i++;
		a[1][0][1] = i++;

		a[01][1][0] = i++;
		a[1][1][1] = i++;
		a[01][1][2] = i++;
		// a[1][1][1] = i++;
		
		System.out.println(Arrays.deepToString(a));
	}
}