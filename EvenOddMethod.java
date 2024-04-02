import java.util.Scanner;
class EvenOddMethod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to see the even upto : ");
		int num = sc.nextInt();
		// System.out.println("The Prime numberes are : ");
		for(int i=1; i<=num; i++)
		{
			evenOdd(i);
		}
	}
	public static void evenOdd(int num)
	{
		if(num%2==0)
			System.out.print(num+" ");
		// else
		// 	System.out.print(num+" ");
	}
}