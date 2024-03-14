import java.util.Scanner;
class SalaryIncrement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float salary = 1000;
		System.out.print("Enter your monthly target score : ");
		int targetScore = sc.nextInt();
		if(targetScore>90)
		{
			System.out.println("You will pay for 3% increment in your salary.");
		}
		else {
			System.out.println("You will pay for 1% increment in your salary.");
		}
	}
}