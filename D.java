class D
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && j==cols) || (i==rows && j==cols))
					System.out.print("  ");
				else if(i==1 || j==1 || j==cols || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}