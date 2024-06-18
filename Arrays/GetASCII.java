import java.util.*;
class GetASCII
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character to get their ASCII : ");
		char ch = sc.next().charAt(0);
		System.out.println("ASCII of "+ch+" = "+(int)ch);
	}
}