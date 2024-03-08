import java.util.Scanner;
class PoundsIntoKilograms
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter pound amount : ");
		float pounds = sc.nextFloat();
		double killoGram = pounds*0.454;
		System.out.println("The "+pounds+" pounds into Killo-Gram is "+killoGram+" KG.");
	}
}