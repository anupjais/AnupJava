 class N
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols;
		for(int i=1; i<=rows; i++)
		{
			cols=i-1;
			for(int j=1; j<=rows; j++)
			{
				if(j==1 || j==i || j==rows)
				// if(j==1 || j==rows || (cols++ != rows))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}