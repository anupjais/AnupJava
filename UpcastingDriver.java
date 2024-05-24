class Upcast
{
	void greet()
	{
		System.out.println("Good evening");
	}
	void m1()
	{
		System.out.println("m1() Parent");
	}
}
class UpcastChild extends Upcast
{
	void greet()
	{
		System.out.println("Good Morning");
	}
	void m2()
	{
		System.out.println("m2() child");
	}
}
class UpcastingDriver
{
	public static void main(String[] args)
	{
		UpcastChild child = new UpcastChild();
		child.greet();
		child.m2();
	}
}