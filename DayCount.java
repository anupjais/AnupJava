import java.util.Scanner;
class DayCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\033[H\033[2J Months Day Count");
		System.out.print("Enter month umber : ");
		byte month = sc.nextByte();
		short days = 0;
		switch(month)
		{
			case 12:
				days+=31;
			case 11:
				days+=30;
			case 10:
				days+=31;
			case 9:
				days+=30;
			case 8:
				days+=31;
			case 7:
				days+=31;
			case 6:
				days+=30;
			case 5:
				days+=31;
			case 4:
				days+=30;
			case 3:
				days+=31;
			case 2:

				days+=28;
			case 1:
				days+=31;
			
		}
		System.out.println("Days are "+days);
		// System.out.println(month);

	}
	public static boolean isLeap(short yr)
	{
		boolean val=false;
		if(yr%100==0 && yr%400==0)
			val=true;
		else if(yr%4==0)
			val=true;

		return val;
	}
}
/*
if(yr%100==0)
	if(yr%400==0)
		System.out.println(yr+" is leap");
	else
		System.out.println(yr+" is not leap");
else if(yr%4==0)
	System.out.println(yr+" is leap");
else
	System.out.println(yr+" is not leap");
	*/