import java.util.Scanner;
class EvenOddWithoutMod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(num+" is "+(((num/2)*2==num)?"an Even":"an Odd"));
		System.out.println(num+" is "+(((num/2)==(num/2.0))?"an Even":"an Odd"));
	}
}