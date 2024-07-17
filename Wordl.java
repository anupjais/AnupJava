import java.util.Scanner;
class Wordl
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);
		System.out.print("The wordle is : ");
		for(int i=0; i<5; i++)
		{
			// if(ch > 96 && ch<122)
			if(ch >= 'a' && ch < 'z')
				System.out.print(++ch);
			// else if((ch > 64 && ch < 91))
			else if((ch >= 'A' && ch < 'Z'))
				System.out.print(++ch);
			// else if(ch == 122)
			else if(ch == 'z')
			{
				ch = 'A';
				System.out.print(ch);
			}
			else if(ch == 'Z')
			{
				ch = 'a';
				System.out.print(ch);
			}
		}
		// System.out.println(ch);
		System.out.println();
	}
}