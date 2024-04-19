class K
{
	static int dup;
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		int k=1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if(i<=rows/2+1)
				{
					dup=cols;
					if(j==1 || j==dup--)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else
				{
					// dup;
					if(j==1 || j==dup++)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}