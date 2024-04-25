class W
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(j==1 || j==rows)
				{
					System.out.print("* ");
					if(i>rows/2 && (i+j==8 ))
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
} 