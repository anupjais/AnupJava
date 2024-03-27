import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter upto the series of the Fibonacci : ");
		int con = sc.nextInt();
		int num1=0,num2=1;
		System.out.print(num1+" "+num2+" ");
		for(int i=1; i<con-1; i++)
		{
			int op=num1+num2;
			System.out.print(op+" ");
			num1=num2;
			num2=op;
		}
		System.out.println();
	}
}