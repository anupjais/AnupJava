class MethodInsideMethod
{
	public static void main(String[] args)
	{
		m1();
	}

	public static void m1()
	{
		System.out.println("Outer m1");
		static void m2()
		{
			System.out.println("Inner m2");
		}
	}
}