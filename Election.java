import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.print("Do you have Voter Id : ");
			String voterId = sc.next();
			if(voterId.equals("yes"))
			{
				System.out.println("********\tWel-Come\t********");
				System.out.print("\t\t\t1.\tBJP \n\t\t\t2.\tCongress\n\t\t\t3.\tNCP\n\t\t\t4.ShivSena");
			}
			else {
				System.out.println("Jaldi yaha se hato..");
			}

		}
		else {
			System.out.println("Your are not eligible for vote come after "+(18-age)+" years.");
		}
	}
}