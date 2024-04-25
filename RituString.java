import java.util.Scanner;
class RituString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter something in String : ");
		String str1 = sc.next();
		// String str1 = "onion";
		String str2 = "";
		for(int j=0; j<str1.length(); j++)
		{
			if(str1[j].equals('i') || str1[j].equals('I'))
			{
				for(int k=j-1; k>=0; k--)
					str2 = str2 + str1[k];
			}
		}
		if(str2!="")
			System.out.println(str2);
		else
			System.out.println(str1);
	}
}