import java.util.Scanner;
class MockPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of iteration : ");
		int num=sc.nextInt();
		for(int i=0; i<num; i++)
		{
			for(int j=i; j>0; j--)
				System.out.print("\033[100m  \033[0m");
			for(int k=num; k>i; k--)
				System.out.print("* ");
			System.out.println();
		}
	}
}