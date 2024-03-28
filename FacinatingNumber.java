import java.util.Scanner;
class FacinatingNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Facinating Number : ");
		int num = sc.nextInt();
		int num1=num*2;
		int num2=num*3;
		int len=0, dup=num;
		while(dup!=0)
		{
			len++;
			dup/=10;
		}
		long faciNumber = num;
		for(int i=0; i<len; i++)
		{
			faciNumber*=10;
		}
		faciNumber+=num1;
		for(int i=0; i<len; i++)
		{
			faciNumber*=10;
		}
		faciNumber+=num2;

		System.out.println(faciNumber);
		dup=faciNumber;
		boolean flag=true;
		while(dup!=0)
		{
			int rem=dup%10;
			if(rem)
			dup/=10;
		}
	}
}