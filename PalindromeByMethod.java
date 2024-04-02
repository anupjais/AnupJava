import java.util.Scanner;
class PalindromeByMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Palindrome : ");
		int num = sc.nextInt();
		int rev = reverseNumber(num);
		isPalindrome(num,rev);
	}

	public static int reverseNumber(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev*=10 + rem;
			// System.out.print(rev+" ");
			// rev= rev * 10 + rem;
			num/=10;
		}
		return rev;
	}
	public static void isPalindrome(int num, int rev)
	{
		if(num==rev)
			System.out.println(num+" is a Palindrome.");
		else
			System.out.println(num+" is not a Palindrome.");
	}
}