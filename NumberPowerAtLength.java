import java.util.Scanner;
class NumberPowerAtLength
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num,length = 0;
		long power=1;
		// int length = 0;
		while(dup!=0)
		{
			length++;
			dup/=10;
		}
		// for(; length>0; length--)
		for(int i=1; i<=length; i++)
		{
			power*=num;
		}
		System.out.println(power);
	}
}