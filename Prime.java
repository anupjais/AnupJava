class Prime
{
	public static void main(String[] args)
	{
		for(int i=2; i<500; i++)
		{
			int num = i;
			boolean flag = false;
			for(int j=2; j<i; j++)
			{
				if(num%j==0)
				{
					flag = true;
					break;
				}

			}
			if(!flag)
				System.out.print(num+" ");
		}
		System.out.println();
	}
}