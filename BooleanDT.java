import java.util.Scanner;
class BooleanDT
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Boolean value : ");
		boolean shrutika = sc.nextBoolean();//.toLowerCase();

		System.out.println("You have entered \033[93m"+shrutika+"\033[0m");
	}
}