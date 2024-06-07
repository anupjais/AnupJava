import java.util.Arrays;
class Class2
{
	public static void main(String[] args)
	{
		int [][][] a = {{{10,20},{30,40,50}},{{60},{70,80,90,100}}};
		// for (int[][] i: a)
		// {
		// 	System.out.print(i+" ");
		// }
		System.out.println(Arrays.deepToString(a));
	}
}