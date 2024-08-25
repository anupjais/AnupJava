public final class MyString
{
	String str=null;

	MyString(String str)
	{
		this.str= str;
	}

	public int length()
	{
		int count=0;
		for(int i=0; ; i++)
		try{
			str.charAt(i);
			count++;
		}catch(StringIndexOutOfBoundsException e)
		{
			break;
		}
		return count;
	}


	public static void main(String[] args)
	{
		MyString str = new MyString("Hello");
		System.out.println(str.length());
	}
}