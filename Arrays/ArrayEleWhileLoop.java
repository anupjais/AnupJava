class ArrayEleWhileLoop
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,50,60};
		int i=0;
		while(i<=a.length-1)
		{
			System.out.print(a[i++]+" ");
		}
		System.out.println();
	}
}