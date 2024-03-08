import java.util.Scanner;
class Addition
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		int add = num1+num2;
		System.out.println("The Addition of "+num1+" and "+num2+" is "+add);
	}
}