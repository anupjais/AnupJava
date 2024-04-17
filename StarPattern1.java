import java.util.Scanner;
class StarPattern1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pattern symboll : ");
		char ch = sc.next().charAt(0);
		for(int i=1; i<=4; i++)
		{
			System.out.print("\t\t\t");
			for(int j=1; j<=4; j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}