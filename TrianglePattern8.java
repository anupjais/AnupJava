class TrianglePattern8
{
	public static void main(String[] args)
	{
		int sum =0;
		for(int i=1; i<=5; i++)
		{
			// sum=i;
			for(int j=1; j<=5; j++)
			{
				System.out.print((i+j)-sum +" ");
			}
			System.out.println();
		}
	}
}



/*
	* Expectation

	1
	3  2
	6  5  4
	10 9  8  7
	15 14 13 12 11

	* Realities

	1 
	2 3 
	3 4 5 
	4 5 6 7 
	5 6 7 8 9 

	1 
	2 1 
	3 2 1 
	4 3 2 1 
	5 4 3 2 1
*/