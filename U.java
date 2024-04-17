class U
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=7;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if(i==rows && (j==1 || j==cols))
					System.out.print("  ");
				else if(j==1 || j==cols || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}