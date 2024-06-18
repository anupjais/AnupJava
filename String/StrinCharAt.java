import java.util.*;
class StrinCharAt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter something to get at char at : ");
		// String str = sc.nextLine();
		String str = "Hello";
		System.out.print("Enter the index : ");
		int indx = sc.nextInt();
		System.out.print(userCarAt(indx, str)+" ");
		// for(int i=0; i<str.length(); i++)
		// {
		// 	System.out.print(userCarAt(i, str)+" ");
		// }
		System.out.println();
	}
	public static char userCarAt(int indx, String str)
	{
		if(indx<0 || indx>=str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong index");
		}
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			arr[i] = str.charAt(i);
		}
		return arr[indx];
	}
}