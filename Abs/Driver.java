abstract class Sajid
{
	abstract void m1();
}
class M700 extends Sajid
{
	void m1()
	{
		System.out.println("Hey there..");
	}
}
class Driver
{
	public static void main(String[] args)
	{
		System.out.println("I'm main methhod.");
		M700 m7 = new M700();
		m7.m1();
	}
}