class Screen extends Color
{
	public static void centerScr()
	{
		System.out.print("\t\t\t\t\t");
	}
	public static void centerScr(int num)
	{
		for(int c=0; c<num; c++)
		System.out.print("\t");
	}
	public static void clrScr()
	{
		System.out.print("\033[H \033[2J");
	}
	public static void clrCenter()
	{
		for(int i=1; i<10; i++)
			System.out.println();
	}
	public static void clrCenter(int num)
	{
		for(int i=1; i<num; i++)
			System.out.println();
	}
	public static void dashLine()
	{
		centerScr();
		for(int i=0; i<=10; i++)
		{
			System.out.print("- ");
		}

	}
	public static void line(char ch)
	{
			centerScr();
		for(int i=0; i<=10; i++)
		{
			System.out.print(ch+" ");
		}

	}

}