import java.util.*;
class SentenceTOWords
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
				break;
			word+=ch;
		}
		System.out.println(word);
	}
}