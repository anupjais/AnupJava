import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Armstrong : ");
		int num = sc.nextInt();
		int dup=num, dup1=num;
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
		if(sum==num)
		{
			System.out.println(num+" is an Armstrong number.");
		}else{
			System.out.println(num+" is not an Armstrong number.");
		}
	}
}