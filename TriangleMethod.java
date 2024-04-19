import java.util.Scanner;
class TriangleMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of row : ");
		int rows=sc.nextInt();
		int dup=rows;
		System.out.print("Enter your desired symboll otherwise it's '*' : ");
		char ch = sc.next().charAt(0);
		Space spc = new Space();
		Star str = new Star();

		for(int i=1; i<=rows; i++)
		{
			spc.space(dup--);
			str.star(i,ch);
			System.out.println();
		}
	}
}