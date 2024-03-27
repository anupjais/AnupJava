import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number to check Automorphic : ");
		// int num=sc.nextInt();
		for(int j=1; j<10000; j++)
		{
			int num=j;
			int dup=num;
			int div=1;
			while (dup!=0)
			{
				div*=10;
				dup/=10;
			}
			System.out.println(num==(num*num%div)?num+" is an Automorphic Number":num+" is not an Automorphic Number");
		}
	}
}