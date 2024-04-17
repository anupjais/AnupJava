import java.util.Scanner;
class HoloTriangle3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		byte rows = sc.nextByte();
		for(byte i=1; i<=rows; i++)
		{
			for(byte j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(byte j=rows; j>=i; j--)
			{
				if(i==1 || j==rows || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}