class TwoThreeD
{
	public static void main(String[] args)
	{
		int[][][] a = {{{1,2,3,4},{5,6}},{10,20}};
		for(int[][] i: a)
		{
			for(int [] j: i)
			{
				for(int k: j)
					System.out.print(k+" ");
				System.out.println();
			}
		}
	}
}