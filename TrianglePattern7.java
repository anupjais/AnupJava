class TrianglePattern7
{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j>0; j--)
				System.out.print((i*j)+j +" ");
			System.out.println();
		}
	}
}


/*
	2 
	6  3 
	12 8  4 
	20 15 10 5 
	30 24 18 12 6 
*/