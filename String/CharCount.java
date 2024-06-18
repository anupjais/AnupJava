import java.util.*;
class CharCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();
		System.out.print("Enter a Character to get their count : ");
		char ch = sc.next().charAt(0);

		int count=0;
		for(int i=0; i<name.length(); i++)
		{
			if(ch==name.charAt(i))
				count++;
		}

		System.out.println(ch+" is repeted into "+name+" = "+count);
	}
}