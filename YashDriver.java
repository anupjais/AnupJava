abstract class Yash
{
	private abstract void name();
}
class Hostel extends Yash
{
	void name()
	{
		System.out.println("Hey there I'm at hostel.");
	}
}
class YashDriver
{
	public static void main(String[] args)
	{
		Hostel obj = new Hostel();
	}
}