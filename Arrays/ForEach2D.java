class ForEach2D
{
	public static void main(String[] args)
	{
		int [][] arr = {{10,11,12}, {20,21}, {30,31,32,33,34}};
		System.out.println("\nForEach Loop");
		for(int[] i : arr)
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("\nFor Loop");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nWhile Loop");
		int i=0;
		while(i<arr.length)
		{
			int j=0;
			while(j<arr[i].length)
			{
				System.out.print(arr[i][j++]+" ");
			}
			System.out.println();
			i++;
		}
		System.out.println("\nDo-While Loop");
		int x=0;
		do{
			int y=0;
			do{
				System.out.print(arr[x][y++]+" ");
			}while(++y<arr[x].length);
			System.out.println();
		}while(++x<arr.length);
	}
}