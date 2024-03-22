// import java.util.Scanner;
class ArmstrongNumbers
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number to check Armstrong : ");
		// int num = sc.nextInt();
		System.out.print("The Armstrong numbers are : ");
		for(int k=1; k<999; k++)
		{
			int dup=k, dup1=k;
			int length = 0, sum=0;
			while (dup!=0)
			{
				length++;
				dup/=10;
			}
			while(dup1!=0)
			{
				int rem = dup1%10;
				int pow=1;
				for(int i=1; i<=length; i++)
					pow*=rem;
				sum+=pow;

				dup1/=10;
			}
			if(sum==k)
			{
				// System.out.println(num+" is an Armstrong number.");
				System.out.print(k+" ");
			}
		}
		System.out.println();
	}
}