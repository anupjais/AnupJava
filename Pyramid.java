import java.util.Scanner;
class Pyramid
{
	public static void main(String[] args)
	{
		// Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++)
		{
			// for(int j=5; j>=i; j--)
			// {
			// 	// System.out.print("  ");
			// 	System.out.print(j+" ");
			// }
			for(int k=5; k>=i-1; k--)
			{
				// System.out.print("  ");
				System.out.print(k+" ");
			}

			for(int l=5; l>=i; l--)
			{
				// System.out.print("  ");
				System.out.print(l+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}