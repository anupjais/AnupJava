class L
{
	public static void main(String[] args)
	{
		int rows = 9;
		int cols = 5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if((i==rows && j!=1) || j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}