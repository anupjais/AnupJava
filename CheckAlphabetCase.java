import java.util.Scanner;
class CheckAlphabetCase
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an alphabet : ");
		char ch = sc.next().charAt(0);
		if (ch>='a' && ch<='z') {
			System.out.println("The entered cahracter \'"+ch+"\' is a lower-case alphabet.");
		}else if (ch>='A' && ch<='Z' ) {
			System.out.println("The entered cahracter \'"+ch+"\' is a UPPER-CASE alphabet.");
		}else{
			System.out.println("\'"+ch+"\' is not an alphabet.");
		}
	}
}