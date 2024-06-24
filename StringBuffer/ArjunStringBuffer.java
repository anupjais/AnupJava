class ArjunStringBuffer
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer();

		System.out.println(s);
		System.out.println("capacity : "+s.capacity());
		System.out.println("length : "+s.length());
		s.append("123456789012345678901234567890123456789012345678901234567890");
		System.out.println("\n"+s);
		System.out.println("capacity : "+s.capacity());
		System.out.println("length : "+s.length());
	}
}