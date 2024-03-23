// import java.util.Scanner;
class GauriPattern
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int num=
		for(int i=0; i<13; i++)
		{
			// if(i%4==0)
			// 	// System.out.println("*");
			// 	System.out.println(i);
			for(int j=1; j<4; j++)
			{
				// if(j%1==0)
				// 	System.out.println("*");
				if(j%2==0)
				{

					// System.out.println("  *");
					System.out.println("  "+j);
				}
				else if(j%3==0)
				{
					// System.out.println("    *");
					System.out.println("    "+j);
				}

			}
		}
	}
}