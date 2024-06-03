import java.util.Scanner;
class InputMasking
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		try
		{
			int num = sc.nextInt();
			System.out.print("\b*");
		}
		System.out.println(num+".");
	}
}