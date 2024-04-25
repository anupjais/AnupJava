class ConstructorChaining
{
	static Color clr = new Color();
	ConstructorChaining()
	{
		System.out.println("default Constructor.");
	}
	ConstructorChaining(int a)
	{
		this();
		clr.yellow();
		System.out.println("1 argumented Constructor. '"+a+"'");
	}
	ConstructorChaining(int a, int b)
	{
		this(a);
		System.out.println("2 argumented Constructor. '"+a+"' and '"+b+"'");
	}
	public static void main(String[] args)
	{
		ConstructorChaining shweta = new ConstructorChaining(10,20);
	}
}