class TrianglePattern9
{
	public static void main(String[] args)
	{
		int temp=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((i+j+ temp--) +" ");
			}
			temp=i;
			System.out.println();

		}
	}
}