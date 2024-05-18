import java.util.Scanner;
class Challege3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter alphabet : ");
		String str = sc.next().toUpperCase();
		// System.out.println(str);
		int sum = 0;
		for(int i=0; i<str.length(); i++)
		{
			sum*=26;
			char ch = str.charAt(i);
			if(ch>64 && ch<91)
			{
				// System.out.println(ch-64);
				sum+=(ch-64);
			}
		}
		System.out.println(sum);

	}
}