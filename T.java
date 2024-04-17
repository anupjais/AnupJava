class T
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=7;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if(j==cols/2+1 || i==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}