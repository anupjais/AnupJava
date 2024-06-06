import java.util.Arrays;
class Example3
{
	public static void main(String[] args)
	{
		int i=10;
		short [][][] a = new short[2][2][2];
		a[0][0][0] = 10;
		a[0][0][1] = 11;
		a[0][1][0] = 12;
		a[0][1][1] = 13;
		a[1][1][0] = 14;
		a[1][1][1] = 15;
		// a[0][0][0] = i++;
		// a[0][0][1] = i++;
		// a[0][1][0] = i++;
		// a[0][1][1] = i++;
		// a[1][1][0] = i++;
		// a[1][1][1] = i++;
		
		System.out.println(Arrays.deepToString(a));
	}
}