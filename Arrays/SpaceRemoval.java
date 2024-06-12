import java.util.*;
class SpaceRemoval
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String sen = sc.nextLine();
		String word = "";
		for(int i=0; i<sen.length(); i++)
		{
			char ch = sen.charAt(i);
			if(ch==' ')
				continue;
				// break;
			word+=ch;
		}
		System.out.println(word);
	}
	static String[] stringToWords(String sen)
	{
		// String [] words;
		int len=0;
		// for(String s:sen)
		// {

		// }
		for(int i=0; i<sen.length(); i++)
		{
			char ch = sen.charAt(i);
			if(ch==' ')
				len++;
		}
		String [] words = new String[len];
		return null;
	}
}