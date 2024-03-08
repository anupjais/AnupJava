import java.util.Scanner;
class NumberOfYears
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		enterAgain:
		System.out.print("Enter a number of minutes : ");
		long num = sc.nextLong();
		// if(num<1440)
		// {
		// 	System.out.println("Try to enter more than 1440 minutes : ");
		// 	return enterAgain;
		// }
		long days = num/(24*60);
		long years = days/365;
		days %=365;
		System.out.println("In \'"+num+"\' minutes the number of years is \""+years+"\"yr and days are \""+days+"\" days.");
	}
}