import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Tech Number : ");
		int num = sc.nextInt();
		int len=0, sum=0, div=1;
		int dup=num;
		while (dup!=0)
		{
			len++;
			dup/=10;
		}
		if (len%2==0)
		{
			for(int i=1; i<=len/2; i++)
			{
				div*=10;
			}
			int fHalf = num/div;
			int lHalf = num%div;
			sum = fHalf+lHalf;
			// int sqr = sum*sum;
			System.out.println(num == sum*sum ? num+" is a Tech Number":num+" is not a Tech Number");
		}
	}
}