import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number to check Spy : ");
		// int num = sc.nextInt();
		for(int i=1; i<=10000; i++)
		{
			int num = i;
			int sum=0, prod=1, dup=num;
			while(dup!=0)
			{
				int rem = dup%10;
				sum+=rem;
				prod*=rem;
				dup/=10;
			}
			if(sum==prod)
				// System.out.println(num+" is a Spy Number");
				System.out.print(num+" ");
		}
		System.out.println();
		// else
		// 	System.out.println(num+" is not a Spy Number");
	}
}