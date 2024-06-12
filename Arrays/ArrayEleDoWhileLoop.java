class ArrayEleDoWhileLoop
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,50,60};
		int i=0;
		do
		{
			System.out.print(a[i++]+" ");
		}while(i<a.length);
		System.out.println();
	}
}