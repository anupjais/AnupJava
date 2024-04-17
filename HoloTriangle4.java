import java.util.Scanner;
class HoloTriangle4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		byte rows = sc.nextByte();
		for(byte i=1; i<=rows; i++)
		{
			for(byte j=rows; j>i; j--)
			{
				System.out.print("  ");
			}
			for(byte j=1; j<=i; j++)
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