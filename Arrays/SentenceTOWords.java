import java.util.*;
class SentenceTOWords
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String sen = sc.nextLine();
		String word = "";
		int i=0,cnt=1;
		for(;;)
		{
			String word = "";
			for(; i<sen.length(); i++)
			{
				char ch = sen.charAt(i);
				if(ch==' ')
				{
					i++;
					cnt++;
					break;
				}
				word+=ch;
			}
			if(i==sen.length())
				break;
		}

		String[] words=stringToWords(cnt,sen);
		System.out.println(Arrays.toString(word));
	}
	static String[] stringToWords(int cnt, String sen)
	{
		String [] words = new String[cnt];
		int indx=0,i=0;
		
		for(;;)
		{
			String[] word="";
			for(;i<sen.length(); i++)
			{
				char ch=sen.charAt(i);
				if(ch==' ')
				{
					i++;
					break;
				}
				word+=ch;
			}
			words[indx++]=word;
			if(i==sen.length())
				break;
		}
		return words;
	}
}