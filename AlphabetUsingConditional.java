import java.util.Scanner;
class AlphabetUsingConditional
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);
		System.out.println(((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?((ch>='a'&&ch<='z')?"A LowerCase Alphaber":"A UpperCase Alphaber"):"Not an alphabet");
		// System.out.println(((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?"An alphabet":"Not an alphabet");
	}
}