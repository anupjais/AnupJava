class ThrowsExample
{
	public static void main(String[] args)
	{
		try
		{
			anup();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void anup() throws ArithmeticException, NullPointerException
	{
		System.out.println(10/0);
	}
}