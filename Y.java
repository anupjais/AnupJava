class Y
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows; j>i; j--)
			{
				if(i+j==rows+1)
					System.out.print("* ");
				else
					System.out.print(" ");
					// System.out.print("  ");
			}
			System.out.println("*");
			// System.out.println(" *");
		}
	}
} 