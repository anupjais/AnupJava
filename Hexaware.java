import java.util.Scanner;
class Hexaware
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired string : ");
		String str = sc.next();
		// String str = "hello*3";
		String str1="";
		String op="";

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if((ch>='a' && ch<='z'))
			{
				if(ch=='z')
					str1 = str1+'a';
				else
					str1 = str1 + ++ch;
			}
			else if(ch>='A' && ch<='Z')
			{
				if(ch=='Z')
					str1 = str1+'A';
				else
					str1 = str1 + ++ch;
			}
			// System.out.print(str.charAt(i)+" ");
			// if(str.charAt(i).toUpperCase>64 && str.charAt(i).toUpperCase<91)
		}
		for(int i=0; i<str1.length(); i++)
		{
			char ch = str1.charAt(i);
			// if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' || ch== 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch== 'U')
			if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u')
				// op = op+ (ch-32);
				op = op+ (char)(ch-32);
			else
				op = op+ch;
		}
		System.out.println(str);
		System.out.println(str1);
		System.out.println(op);
	}
}