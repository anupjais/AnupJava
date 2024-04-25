class Parent
{
	public Parent()
	{
		System.out.println("Public Parent Constructor.");
	}
	// Parent()
	// {
	// 	System.out.println("Default Parent Constructor.");
	// }
	// default Parent()
	// {
	// 	System.out.println("Default Parent Constructor.");
	// }
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Default Child Constructor.");
	}
	public Child(int a)
	{
		System.out.println("Public Child Constructor With "+a);
	}
	protected Child(double a, int b)
	{
		System.out.println("Public Child Constructor With "+a+b);
	}
	private Child(String name)
	{
		System.out.println("Public Child Constructor With "+name);
	}
}

class ParentChildConstructor
{
	public static void main(String[] args)
	{
		Child obj1 = new Child();
		Child obj2 = new Child(4);
		Child obj3 = new Child(5.3, 99);
		Child obj4 = new Child("Pallavi");

	}
}