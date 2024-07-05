class IterationWithAnotherCondition
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=1; count<5; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
	}
}