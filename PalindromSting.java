import java.util.Scanner;
class PalindromSting
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();
		String revName="";
		for (int i=name.length()-1; i>=0; i--)
		{

			revName +=name.charAt(i);
		}
		System.out.println((revName.equals(name))?"\033[92m"+name+"\033[0m is a Palindrom.":"\033[95m"+name+"\033[0m is not a Palindrom.");
	}
}