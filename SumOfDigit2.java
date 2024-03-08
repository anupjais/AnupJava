import java.util.Scanner;
class SumOfDigit2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		sum += num%10;
		num /= 10;
		sum += num%10;
		num /= 10;
		sum += num%10;
		num /= 10;
		System.out.println("The sum of digits is "+sum+" and the number is "+dup);
	}
}