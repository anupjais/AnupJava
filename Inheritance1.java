class Parent
{
	String str1 = "I'm from Parent Class";
	static int num =10;
	void m1()
	{
		System.out.println("Hello, I'm m1() from Parent Class");
	}
	static void m3()
	{
		System.out.println("Hello, I'm m3() static from Parent Class");
	}
}

class Child extends Parent
{
	String str1 = "I'm from Child class";

	void m2()
	{
		m1();
		System.out.println("Hi, from m2() of Child class");
	}
	static void m4()
	{
		// System.out.println("Super Num : "+super.num);
		System.out.println("Hello, I'm m4() static from Child Class");
	}
}

class Inheritance1
{
	public static void main(String[] args)
	{
		Child child = new Child();
		// child.m2();
		// child.m1();
		// System.out.println();
		// // System.out.println(super.child.str1);
		// System.out.println(child.str1);
		// System.out.println();
		// child.m3();
		// child.m4();

		System.out.println("Child Num : "+child.num);
		child.num = 20;
		System.out.println("Child Num : "+child.num);
		System.out.println("Parent Num : "+Parent.num);
		System.out.println("Super Num : "+super.num);
	}
}