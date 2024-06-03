class Chetan
{
	Chetan()
	{
		System.out.println("No argulmented constructor.");
	}
	void m1()
	{
		System.out.println("Hey there!, I'm Chetan..");
	}
}
class ChetanDriver
{
	public static void main(String[] args)
	{
		Chetan chetan = new Chetan();
		chetan.m1();
	}
}