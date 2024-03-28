import java.util.Scanner;
class PerfectSquarerRoot
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number to get the Perfect Squarer Root of the number : ");
		// int num = sc.nextInt();
		for(int j=1; j<10000; j++)
		{
			int num = j;
			int sqrrt = 0;
			boolean flag=false;
			for(int i=1; i<=num/2; i++)
			{
				if(i*i==num)
				{
					flag=true;
					sqrrt=i;
					break;
				}
			}
			if(flag)
				System.out.println("\033[92m"+sqrrt+"\033[0m is the Perfect Squarer Root of \033[96m"+num+"\033[0m");
		}
		// else
		// 	System.out.println("\033[1;91m"+num+"\033[0m doesn't have any Perfect Squarer Root");
	}
}