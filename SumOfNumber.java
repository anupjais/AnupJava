import java.util.Scanner;
class SumOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente a number : ");
		int num = sc.nextInt();
		int sum=0, dup=num;
		while (num>0)
		{
			int rem = num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("The sum of "+dup+" is "+sum);
	}
}