import java.util.Scanner;
class HoloTriangle2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		byte rows = sc.nextByte();
		for(int i=rows; i>=1; i--)
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

/*for(byte i=1; i<=rows; i++)
{
	for(byte j=rows; j>=i; j--)
	{
		if(j==rows || j+i==6 || i==rows)
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println();
}*/