class NonStaticMain
{
	NonStaticMain obj = new NonStaticMain();
	static
	{
		System.out.print("main static block hoo.");
	}
	public void m1()
	{
		System.out.print("main non static main() hoo.");
	}
	public void main(String[] args) 
	{
		// obj.m1();
	}
}