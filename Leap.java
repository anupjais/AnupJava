import java.util.Scanner;
class Leap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int yr = sc.nextInt();
		if(yr%100==0)
			if(yr%400==0)
				System.out.println(yr+" is leap");
			else
				System.out.println(yr+" is not leap");
		else if(yr%4==0)
			System.out.println(yr+" is leap");
		else
			System.out.println(yr+" is not leap");
	}
}