import java.util.Scanner;
class FactorsRecursion
{
	static int fact;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get their factors : ");
		int num = sc.nextInt();
		factor(num);
		System.out.println();
	}
	public static void factor(int num)
	{
		if(fact++ >= num)
		{
			System.out.println("\033[91;1m"+fact+"\033[0m");
			return ;
		}
		else if(num%fact==0)
			System.out.print(fact+" ");
		// fact++;
		factor(num);
	}
}