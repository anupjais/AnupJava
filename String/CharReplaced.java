import java.util.*;
class CharReplaced
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();
		System.out.print("Enter a Character which has to replace : ");
		String ch = sc.next();
		System.out.println(name+" = "+name.replace(ch,""));
	}
}