import java.util.Scanner;
class DuckNumbeer2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Duck Numbeer : ");
		int num = sc.nextInt();
		int dup=num;
		boolean flag = false;
		while(dup!=0)
		{
			if(dup%10==0)
			{
				flag = true;
				break;
			}
			dup/=10;
		}
		if(flag)
			System.out.println(num+" is a Duck Numbeer.");
		else
			System.out.println(num+" is not a Duck Numbeer.");
	}
}