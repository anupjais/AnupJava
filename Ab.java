class M7
{
	int a = 10;
	// static int a = 10;
}
class M6 extends M7
{
	int a = 20;
	// static int a = 20;
	M6()
	{
		System.out.println(super.a);
	}
}
class Ab
{
	public static void main(String[] args)
	{
		M6 obj = new M6();
		System.out.println(obj.a);
	}
}