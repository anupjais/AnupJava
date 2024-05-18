import java.util.Scanner;
class PrimeAddition
{
	public static void main(String[] args)
	{
		System.out.println("\033[H\033[2J");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		while(dup!=0)
		{
			int temp = dup%10;
			if(isPrime(temp))
				sum+=temp;
			dup/=10;
		}
		System.out.println("Prime Addition of "+num+" is "+sum);
		// System.out.println((isPrime(num))?num+" is Prime":num+" is not Prime");
	}
	static boolean isPrime(int num)
	{
		boolean flag = true;
		if(num>1)
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					flag = false;
					break;
				}
			}
		}
		else
			flag=false;
		return flag;
	}
}
