import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number to check Neon : ");
		// int num = sc.nextInt();
		for(int i=1; i<90000000; i++)
		{
			int num = i;
			int sum=0, sqr=num*num;
			while(sqr!=0)
			{
				int rem = sqr%10;
				sum+=rem;
				sqr/=10;
			}
			// System.out.println(sum==num?num+" is a Neon Number":num+" is not a Neon Number");
			if(sum==num)
			// if(sum!=num)
				System.out.print(num+" ");
		}
		System.out.println();
	}
}