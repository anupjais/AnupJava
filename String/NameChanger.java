import java.util.*;
class NameChanger
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();

		String ch = name.substring(0,1).toUpperCase();
		String subName = name.substring(1).toLowerCase();
		String newName = ch.concat(subName);
		System.out.println(newName);
	}
}