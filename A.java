class A
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		CenterScr artist = new CenterScr();
		artist.clrScr();
		artist.clrCenter(14);
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
				if((i==1 && j==1) || (i==1 && j==cols) )
					System.out.print("  ");
				else if( i==1 || j==1 || j==cols || i==(rows/2)+2)
					System.out.print("* ");
				else
				System.out.print("  ");
			System.out.println();
		}
		artist.clrCenter(20);
	}
}