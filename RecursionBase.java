class RecursionBase
{
	static int number = 1;
	public static void main(String[] args)
	{
		printNumbers();
		System.out.println();
	}
	public static void printNumbers()
	{
		// System.out.println(number);
		// System.out.print(number+" ");
		// number++;
		System.out.print(number++ +" ");
		if(number>10)
			return;
		printNumbers();
	}
}