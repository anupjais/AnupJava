import java.util.Scanner;
class MissionMarry
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you age : ");
		int age = sc.nextInt();
		System.out.print("Enter your property amount : ");
		double property = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter you sur-name : ");
		String surName = sc.nextLine().toUpperCase();
		
		// if((age>21 && property>10000000) && surName=="AMBANI")
		if((age>20 && property>10000000)||(surName.equals("AMBANI")))
		{
			// System.out.println("You're "+age+"yr old.");
			// if (property>10000000 && surName.equals("AMBANI")) {
				System.out.println("Now, you are eligible for marry.");
			// }
		}
		else{
			System.out.println("you are not eligible for the marry..");
		}
	}
}