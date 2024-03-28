import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Duck Number : ");
		String num = sc.next();
		if(num.charAt(0)!='0')
		{
			// String dup=num;
			boolean flag = false;
			for(int i=1; i<=num.length(); i++)
			{
				// int comp=dup%10;
				System.out.println(i);
				if(num.charAt(i)=='0')
				{
					flag=true;
					break;
				}
				// dup/=10;
			}
			if(flag)
			{
				System.out.println(num+" is Duck Number.");
			}
			else
			{
				System.out.println(num+" is not Duck Number.");
			}
		}else
			System.out.println(num+" is an Octal.");
	}
}