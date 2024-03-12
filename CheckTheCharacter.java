import java.util.Scanner;
class CheckTheCharacter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);
		if (ch>47 && ch<58) {
			System.out.println("\'"+ch+"\' is a number.");
		}
		else if ((ch>64 && ch<90) || (ch>96 && ch<123)) {
			System.out.println("\'"+ch+"\' is an alphabet.");
		}
		else{
			System.out.println("\'"+ch+"\' is a special syboll.");
		}
	}
}