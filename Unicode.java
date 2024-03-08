class Unicode
{
	public static void main(String args[])
	{
		for(int i=1; i<65537; i++)
		{

			System.out.print(i+" : "+(char)i+"\t");
			if(i%10==0)
				System.out.println();
		}
		System.out.println();
	}
}