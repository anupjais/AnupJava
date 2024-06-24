class StringBufferExample
{
	public static void main(String[] args)
	{
		StringBuffer name1 = new StringBuffer();
		StringBuffer name2 = new StringBuffer("javajavajavajavajava");
		StringBuffer name3 = new StringBuffer();
		System.out.println(name1.capacity());
		System.out.println(name1.length());

		name1.append("java");
		System.out.println(name1.capacity());
		System.out.println(name1.length());

		// System.out.println(name2.capacity());
		// System.out.println(name3.capacity());
		// System.out.println(name2.length());
		// StringBuffer n3 = name1.append("Pro");
		// StringBuffer n4 = name2.append("Pro");
		// // System.out.println(n3==n4);

		// if(name1.equals(name2))
		// {
		// 	System.out.println(name1.toString());
		// 	System.out.println(name2.toString());
		// }
		// else
		// 	System.out.println("not equals");


		// StringBuffer s1="java";
		// StringBuffer s2="java";
		// System.out.println(s1==s2);
		// System.out.println(s1.equals(s2));
		// System.out.println(name1==name2);
		// System.out.println(name1.equals(name2));
	}
}