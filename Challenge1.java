import java.util.*;
class Challenge1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.print("Enter the rapeat : ");
		int key = sc.nextInt();
		System.out.println(num+" is converted into "+rotate(num,key));

	}
	static int rotate(int num, int key)
	{
		// int count=0;
		String str = ""+num;
		int len = str.length();
		String str1 = "";
		for(int i=1; i<=key; i++)
		{
			str+=num;
		}
		for(int i=0; i<len; i++)
		{
			str1 += str.charAt(i+key);
		}
		return Integer.parseInt(str1);
	}
}


// 27563 becomes 56327
// 123456 becomes 612345
// 123 becomes 312