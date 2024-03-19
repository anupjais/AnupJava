import java.util.Scanner;
class Menu
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******\tWel-Come\t******");
		System.out.println("\t\t1. Home\n\t\t2. About Us\n\t\t3. Contact Us\n\t\t0. EXIT");
		System.out.print("\n\n\tEnter your Choice : ");
		byte choice = sc.nextByte();
		switch(choice)
		{
			case 1:
				System.out.println("Welcome HOME.");
				break;
			case 2:
				System.out.println("Welcome ABOUT-US.");
				break;
			case 3:
				System.out.println("Welcome CONTECT.");
				break;
			case 0:
				System.out.println("EXITED.");
				break;
			default : 
				System.out.println("Invalid Input.");
		}
	}
}