import java.util.Scanner;
class ScannerExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next();
		// String name = sc.next().toLowerCase();
		// char ch = name.charAt(0).toLowerCase();
		// char ch = name.charAt(0);
		char ch = (name.toLowerCase()).charAt(0);
		System.out.println("Hi "+name+" welcome to our teritary and your name's first character is '"+ch+"'.");
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("your name is having '"+ch+"' which is a vowel.");
		}else {
			System.out.println("your name is having '"+ch+"' which is a consonent.");
		}

	}
}