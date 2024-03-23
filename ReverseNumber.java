import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente a number to reverse that : ");
		int num = sc.nextInt();
		int dup = num;
		// int rev = 0;
		String rev = "";
		while(dup!=0)
		{
			int rem = dup%10;
			// System.out.println(rem);
			// rev=rev*10+rem;
			rev = rev + rem; // String Concatination.
			// System.out.println(rev);
			dup/=10;
		}
		System.out.println("Reverse of "+num+" is "+rev);
	}
}