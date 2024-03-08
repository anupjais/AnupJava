import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st velocity : ");
		float velocity1 = sc.nextFloat();
		System.out.print("Enter the 2nd velocity : ");
		float velocity2 = sc.nextFloat();
		System.out.print("Enter the time-span : ");
		float timeSpan = sc.nextFloat();

		float avg = Math.abs((velocity1 - velocity2)/timeSpan);
		System.out.println("The average acceleration = "+avg+" m/s^2.");
	}
	
}