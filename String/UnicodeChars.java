// wajp to get the ASCII of all the characters
import java.util.*;
class UnicodeChars
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.nextLine();
		// String name = sc.next();
		System.out.println("Code Point At\n");
		for(int i=0; i<name.length(); i++)
		{
			System.out.println(name.charAt(i)+" : "+name.codePointAt(i));
		}
		System.out.println("Code Point Before\n");
		for(int i=1; i<name.length(); i++)
		{
			System.out.println(name.charAt(i)+" : "+name.codePointBefore(i));
		}
	}
}
