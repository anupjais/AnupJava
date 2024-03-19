import java.util.Scanner;
class Percentage
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you percentage : ");
		float percentage = sc.nextFloat();
		if(percentage>=90)
		{
			System.out.println("First Class with extention \'O\'.");
		}
		else if (percentage>=75) {
			System.out.println("Distiction with \'A+\'.");
		}
		else if (percentage>=60) {
			System.out.println("First Class with \'A\'.");
		}
		else if (percentage>=35) {
			System.out.println("Second Class with \'B\'.");
		}
		else {
			System.out.println("Keep your study simple and effective make an effective time-table and make conversation with others regarding the subjects.");
			System.out.println("You're efforts are greate but, not the right dirrection \nYOU ARE FAIL. \'C\'.");
		}
	}
}