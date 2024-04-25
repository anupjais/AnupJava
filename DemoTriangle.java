class DemoTriangle
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		int dup=1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=cols; j>=1; j--)
			{
				if(j==cols)
				{
					System.out.print("* ");
				}
				if(i<rows/2+1)
				{
					if(j>=i)
					{
						System.out.print("$ ");
					}
					else
					{
						System.out.print("  ");
					}
					// dup=j;
				}
				else
				{
					if(j>++dup)
					{
						System.out.print("# ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}