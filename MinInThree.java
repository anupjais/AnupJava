import java.util.Scanner;
class MinInThree
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter another number : ");
		int num3 = sc.nextInt();
		int min = ((num1<num2)?((num1<num3)?num1:num3):(num2<num3?num2:num3));
		System.out.println("The minimum number among "+num1+","+num2+" and "+num3+" is "+min+".");
	}
}