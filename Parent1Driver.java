abstract class Parent1
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("Hello from Parent1.");
	}
}
abstract  class Child1 extends Parent1
{
	void m1()
	{
		System.out.println("Hello from m1() Child1.");
	}
	abstract void m4();
}
class Subchild1 extends Child1
{
	void m2()
	{
		System.out.println("m2 implementaion in Subchild1.");
	}
}
class Child2 extends Parent1
{
	void m2()
	{
		System.out.println("m2() implementaion in Child2");
	}
	void m5()
	{
		System.out.println("Hello from m5() Child2");
	}
}
class Parent1Driver
{
	public static void main(String[] args)
	{
		Child2 obj = new Child2();
		Subchild1 obj1 = new Subchild1();
		// obj.m2();
		// obj1.m5();
	}
}