class TrianglePattern10
{
	public static void main(String[] args)
	{
		int temp=0;
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(j==0)
					temp=i+j;
				System.out.print((i+ temp--) +" ");
			}
			// temp=i;
			System.out.println();

		}
	}
}