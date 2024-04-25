class ConstructorTypes
{
	ConstructorTypes()
	{
		System.out.println("default ConstructorTypes");
	}
	public ConstructorTypes(int a)
	{
		System.out.println("public ConstructorTypes with "+a);
	}
	protected ConstructorTypes(int a, int b)
	{
		System.out.println("protected ConstructorTypes with "+a +b);
	}
	private ConstructorTypes(String name)
	{
		System.out.println("private ConstructorTypes with "+name);
	}
	public static void main(String[] args)
	{
		ConstructorTypes obj1 = new ConstructorTypes();
		ConstructorTypes obj2 = new ConstructorTypes(9);
		ConstructorTypes obj3 = new ConstructorTypes(5,2);
		ConstructorTypes obj4 = new ConstructorTypes("Ankita");
	}
}