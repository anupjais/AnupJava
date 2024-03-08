import java.util.Scanner;
class ScannerObjs
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a byte : ");
		byte b = sc.nextByte();
		System.out.print("Enter a short : ");
		short s = sc.nextShort();
		System.out.print("Enter a int : ");
		int i = sc.nextInt();
		System.out.print("Enter a Long : ");
		long l = sc.nextLong();
		System.out.print("Enter a Float : ");
		float f = sc.nextFloat();
		System.out.print("Enter a Double : ");
		double d = sc.nextDouble();
		System.out.print("Enter a Char : ");
		char ch = sc.next().charAt(0);
		System.out.print("Enter a String : ");
		String str1 = sc.next();
		System.out.print("Enter a String : ");
		String str2 = sc.nextLine();
		System.out.println(b+", "+s+", "+i+", "+l+", "+f+", "+d+", "+ch+", "+str1+", "+str2);
	}
}