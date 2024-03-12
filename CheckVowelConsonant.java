import java.util.Scanner;
class CheckVowelConsonant
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an alphabet : ");
		char alphabet = sc.next().charAt(0);
		if((alphabet>64 && alphabet<91) || (alphabet>96 && alphabet<123))
		{
			if((alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u') || (alphabet=='A' || alphabet=='E' || alphabet=='I' || alphabet=='O' || alphabet=='U'))
				System.out.println("\'"+alphabet+"\' is a vowel.");
			else {
				System.out.println("\'"+alphabet+"\' is a consonent.");
			}
		}else{
			System.out.println("\'"+alphabet+"\' is not an alphabet.");
		}
	}
}