class Medium1
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;
		System.out.println(b^a);
		a ^= b ^= a;
		System.out.println(a+" - "+b);
	}
}