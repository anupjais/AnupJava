import java.util.Scanner;
class HoloTriangle1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		byte rows = sc.nextByte();
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || j==i || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}