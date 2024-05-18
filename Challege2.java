import java.util.*;
class Challege2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		// int num = 12457;
		int num = sc.nextInt();
		String str = ""+num;
		
		for(char i=str.charAt(0); i<=str.charAt(str.length()-1); i++)
		{
			if(!(str.contains(""+i)))
				System.out.print(i);
		}	
		System.out.println();	
		
	}
}