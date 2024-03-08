import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		long sum=0;
		while(num!=0)
		{
			sum +=num%10;
			num /=10;
		}
		System.out.println("The sum of "+temp+" is "+sum+".");
	}
}