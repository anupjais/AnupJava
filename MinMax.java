import java.util.Scanner;
class MinMax
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number : ");
		int num2 = sc.nextInt();
		int min = (num1>num2)?num2:num1;
		System.out.println("The minimum number among "+num1+" and "+num2+" is "+min+".");
	}
}