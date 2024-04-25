 class V
{
	public static void main(String[] args)
	{
		int rows=9;
		int cols=5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows*2; j++)
			{
				if(i==j || i+j==rows*2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}