import java.util.Scanner;
class CalculateTipe
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sub total : ");
		float gratuity = sc.nextFloat();
		// float tip = (gratuity*15)/100;
		System.out.print("Enter the tip percentage : ");
		float tipPercentage = sc.nextFloat();
		float tip = (gratuity*tipPercentage)/100;
		float subTotal = gratuity+tip;
		System.out.println("The sub-Total amount is "+subTotal);
	}
}