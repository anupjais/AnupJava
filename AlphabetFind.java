// wajp to find alphabet from the input.
import java.util.Scanner;
class AlphabetFind
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an alphabet : ");
		char ch = sc.next().charAt(0);
		System.out.println((ch>64 && ch<91) || (ch>96 && ch<123)?ch+" is an alphabet.":ch+" is not an alphabet.");
	}
}