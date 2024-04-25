class Z
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		int dup=rows;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(i==1 || i==rows || j==dup)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			dup--;
			System.out.println();
		} 
	}
}