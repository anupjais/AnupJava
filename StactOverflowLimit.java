class StactOverflowLimit
{
	static int num;
	public static void main(String[] args)
	{
		ramesh();
	}
	public static void ramesh()
	{
		System.out.print(num++ +" ");
		ramesh();
	}
}