class Medium2
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.equals(s2) && s1==s2);
	}
}