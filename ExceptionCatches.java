class ExceptionCatches
{
	public static void main(String[] args)
	{
		System.out.println("Hiii");
		try{
			System.out.println("Outer try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE handeled");
			System.out.println("Outer catch");
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("NPE handeled");
			}
			catch(RuntimeException re)
			{
				System.out.println("RE handeled");
			}
		}
		// catch(RuntimeException re)
		// {
		// 	System.out.println("RE handeled");
		// }
	}
}