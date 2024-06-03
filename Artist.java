class Santanu
{
	abstract void m1();
}
class JavaM7 extends Santanu
{
	void m1(int a)
	{
		System.out.println("M1(a) "+a);
	}
}
class Artist
{
	public static void main(String[] args)
	{
		System.out.println("Hiiiii");
		JavaM7 obj = new JavaM7();
		obj.m1(4);
	}
}