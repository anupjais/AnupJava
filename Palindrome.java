import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Palindrome : ");
		int num = sc.nextInt();
		int dup = num, rev=0;
		while(dup!=0)
		{
			int rem = dup%10;
			rev = rev*10+rem;
			dup/=10;
		}
		// System.out.println(num==rev?num+" is a Palindrome.":num+" is not a Palindrome.");
		if(num==rev)
			System.out.println(num+" is a Palindrome.");
		else
			System.out.println(num+" is not a Palindrome.");
	}
}