import java.util.Scanner;
class Month
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month number : ");
		int monthNum = sc.nextInt();
		String month = null;
		switch(monthNum)
		{
			case 1: month="JANUARY"; break;
			case 2: month="FEBRUARY"; break;
			case 3: month="MARCH"; break;
			case 4: month="APRIL"; break;
			case 5: month="MAY"; break;
			case 6: month="JUNE"; break;
			case 7: month="JULY"; break;
			case 8: month="AUGUST"; break;
			case 9: month="SEPTEMBER"; break;
			case 10: month="OCTOBER"; break;
			case 11: month="NOVEMBER"; break;
			case 12: month="DECEMBER"; break;
			default :
				System.out.println("Invalid Input");
		}
		System.out.println((month!=null)?(monthNum+" - "+month):"");
		// if(month!=null)
	}
}