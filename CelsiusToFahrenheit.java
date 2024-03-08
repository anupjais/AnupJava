// import java.lang.scanner;
import java.util.Scanner;
class CelsiusToFahrenheit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		System.out.print("Enter temperature in celcius : ");
		double celsius = sc.nextDouble();
		double fahrenheit = (9.0/5)*celsius+32;
		System.out.println("The "+celsius+"C into Fahrenheit is "+fahrenheit+"F.");
	}
}