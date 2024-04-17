class TriangleDiamond
{
	public static void main(String[] args)
	{
		
		System.out.println("\033[H\033[2J");
		for(int i = 1; i<=5; i++)
		{
			System.out.print("\t\t\t\t\t\t");
			for(int j=5; j>i; j--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// System.out.println("Hello There!!!\n");
		for(int i = 1; i<=5; i++)
		{
			System.out.print("\t\t\t\t\t\t");
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// System.out.println("Hello There!!!\n");
		for(int i = 1; i<=5; i++)
		{
			System.out.print("\t\t\t\t\t\t");
			for(int j=1; j<=i-1; j++)
			{
				System.out.print("  ");
			}
			for(int j = 5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// System.out.println("Hello There!!!\n");
		for(int i = 1; i<=5; i++)
		{
			System.out.print("\t\t\t\t\t\t");
			for(int j = 5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// System.out.println("Hello There!!!\n");
	}
	public static void centerScr()
	{
		System.out.print("\t\t\t\t\t\t");
	}
}