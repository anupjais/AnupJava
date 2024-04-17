class Hexaware
{
	public static void main(String[] args)
	{
		String str = "hello*3";
		String str1="";
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch>64 && ch<91)
				if(ch==122)
					str1 = str1+'a';
				else
					str1 = str1 + ++ch;
			// System.out.print(str.charAt(i)+" ");
			// if(str.charAt(i).toUpperCase>64 && str.charAt(i).toUpperCase<91)
			
		}
		System.out.println(str);
		System.out.println(str1);
	}
}