class NonStaticAccessPossible
{
	String str1 = "Hi I'm non-static variable";
	public static void main(String[] args)
	{
		System.out.println("HEllo from main()");
		NonStaticAccessPossible2 obj = new NonStaticAccessPossible2();
		obj.m1();
	}
}
class NonStaticAccessPossible2
{
	static NonStaticAccessPossible obj = new NonStaticAccessPossible();
	void m1()
	{
		System.out.println("Hello from m1()");
		System.out.println(obj.str1);
		m2();
	}
	void m2()
	{
		System.out.println("Hello from m2()");
		System.out.println(obj.str1);
		m3();
	}
	static void m3()
	{
		System.out.println("Hello from m3() static");
		System.out.println(obj.str1);
	}

}

// NonStaticAccessPossible obj = new NonStaticAccessPossible2();
// error: incompatible types: NonStaticAccessPossible2 cannot be converted to NonStaticAccessPossible


// NonStaticAccessPossible obj = new NonStaticAccessPossible();
// error: non-static variable obj cannot be referenced from a static context
// 		System.out.println(obj.str1);