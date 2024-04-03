import java.util.Scanner;
class EmirpNumberMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Emirp Number : ");
		int num = sc.nextInt();
		boolean flag = isPrime(num);
		if(flag)
		{
			int revNum = reverseNumber(num);
			boolean flag1 = isPrime(revNum);
			if(flag1)
				System.out.println(num+" is an Emirp Number.");
			else
				System.out.println("Due to reverse "+revNum+", num"+" is not an Emirp Number.");

		}
		else
			System.out.println(num+" is not a Prime");
	}
	public static boolean isPrime(int num)
	{
		boolean flag = true;
		if(num<2)
		{
			return false;
		}
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static int reverseNumber(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num/=10;
		}
		return rev;
	}
}