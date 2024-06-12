class ArraysLoops
{
	public static void main(String[] args)
	{
		int [][][] a = {{{10,20},{30}},{{40,50,60}}};
		System.out.println("\nFor Loop :");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
					System.out.print(a[i][j][k]+" ");
				System.out.println();
			}
		}
		System.out.println("\nWhile Loop:");
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				int k=0;
				while(k<a[i][j].length)
				{
					System.out.print(a[i][j][k++]+" ");
				}
				System.out.println();
				j++;
			}
			i++;
		}
		System.out.println("\nDo-While Loop :");
		int m=0;
		do{
			int n=0;
			do{
				int o=0;
				do{
					System.out.print(a[m][n][o++]+" ");
				}while(o<a[m][n].length);
				System.out.println();

			}while(++n <a[m].length);

		}while(++m <a.length);
		System.out.println("\nForEach Loop");
		for(int[][] z : a)
		{
			for(int [] j : z)
			{
				for(int k : j)
					System.out.print(k+" ");
				System.out.println();
			}
		}
	}
}