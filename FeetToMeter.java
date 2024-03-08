import java.util.Scanner;
class FeetToMeter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter feet amount : ");
		float feet = sc.nextFloat();
		double meter = feet*0.305;
		System.out.println("The "+feet+"\" into meter is "+meter+"m.");
	}
}