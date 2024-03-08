import  java.util.Scanner;
class ConditionalOperator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println((num%2==0)?num+" is an Even number.":num+" is an Odd number.");
	}
}