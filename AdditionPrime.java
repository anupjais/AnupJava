import java.util.Scanner;
class AdditionPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		// System.out.println(AddPrime());
		addPrime(num);
	}
	static void addPrime(int num)
	{
		int sum = 0;
		int dup = num;
		for(int i=1; i<=num; i++)
		{
			int temp = num/10;
			if(temp%i==0)
			{
				num/=10;
				continue;
			}
			sum+=temp;
		}
		System.out.println("Addition = "+sum);
	}
}