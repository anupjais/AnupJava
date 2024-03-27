import java.util.Scanner;
class KrishnaMurthiNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Krishna Murthi : ");
		int cond = sc.nextInt();
		int num=1;
		while (num<cond)
		{
			int dup = num;
			int sum = 0;
			while(dup!=0)
			{
				int rem = dup%10;
				int fact=1;
				for(int i=rem; i>1; i--)
				{
					fact *=i;
				}
				sum+=fact;
				dup/=10;
			}
			if(num==sum)
				System.out.println(num+" is a Krishna Murthi Number.");
			// else
			// 	System.out.println(num+" is not a Krishna Murthi Number.");
			num++;
		}

	}
}