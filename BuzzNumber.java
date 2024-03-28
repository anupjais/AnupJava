import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number to check Buzz Number : ");
		// int num = sc.nextInt();
		System.out.print("The Buzz Numbers are : ");
		for(int i=1; i<1000; i++)
		{
			int num = i;
			if(num%7==0 || num%10==7)
				// System.out.println(num+" is a Buzz Number.");
				System.out.print(num+" ");
		}
		System.out.println();
		// else
		// 	System.out.println(num+" is not a Buzz Number.");
	}
}