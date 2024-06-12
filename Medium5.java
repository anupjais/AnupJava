class Medium5
{
	public static void main(String[] args)
	{
		boolean a = true;
		boolean b = false;
		// boolean c = a || b && !a;
		boolean c = a && !a;
		// boolean c = a || b;
		System.out.println(c);
	}
}