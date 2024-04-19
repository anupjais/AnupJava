class JavaM7
{
	public static void main(String[] args)
	{
		JavaM7 obj = new JavaM7();
		System.out.println("M1() is called");
		obj.m1();
	}
	public void m1()
	{
		System.out.println("Hello there this is M1() from Demo class.");
		JavaM7_1 m77_1 = new JavaM7_1();
		m77_1.m2();
	}
}

class JavaM7_1
{
	public void m2()
	{
		System.out.println("Hey there this is m2() from JavaM7_1 class");
		m3();
	}
	public void m3()
	{
		System.out.println("Hey there I'm M3() from JavaM7_1 class.");
	}
}