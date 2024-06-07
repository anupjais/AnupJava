import java.util.Arrays;
class Class1
{
	public static void main(String[] args)
	{
		char ch = 'a';
		// char [][] a = {{'a','b'},{'c','d','e'},{'f','g'}};
		char [][] a = {{ch++,ch++},{ch++,ch++,ch++},{ch++,ch++}};
		System.out.println(Arrays.deepToString(a));
	}
}