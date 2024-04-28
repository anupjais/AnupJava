class StaticClass
{
	static class InnerStaticClass
	{
		static
		{
			System.out.println("\033[95mMai inner class ka static hoo.\033[0m");
		}
	}
	static
	{
		System.out.println("\033[92mMai outer class ka hoo.\033[0m");
	}
	public static void main(String[] args) 
	{
		InnerStaticClass Object = new InnerStaticClass();
	}
}