class RightWardDiamond
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols =5;
		int dup;
		for(int i=1; i<=rows; i++)
		{
			dup=1;
			for(int j=1; j<=cols; j++)
			{
				if(dup>cols-1 || (i+ --dup) == 10)
					System.out.print("* ");
				// System.out.print("* ");
				else if(j==1 || i == ++dup)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}