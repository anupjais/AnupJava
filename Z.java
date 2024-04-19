class Z
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		int dup;
		for(int i=1; i<=rows; i++)
		{
			dup=i;
			for(int j=1; j<=rows; j++)
			{
				if(i==1 || i==rows)
					System.out.print(j);
					// System.out.print("* ");
				else if(dup++ == i)
					System.out.print(j);
					// System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}