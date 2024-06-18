import java.util.*;
class StingLen
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter something to get their length : ");
		String str = sc.nextLine();
		System.out.println("The length = "+userLen(str));
	}
	public static int userLen(String str)
	{
		int len = 0;
		for(int i=0;;i++)
		{
			try{
				str.charAt(i);
				len++;
			}
			catch(StringIndexOutOfBoundsException siobe)
			{
				break;
			}
		}
		return len;
	}
}
	
