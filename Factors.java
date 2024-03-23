import java.util.Scanner;
class Factors
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get their factors : ");
		int num = sc.nextInt();
		System.out.print("The Factors of "+num+" is ");
		for(int i=num; i>=1; i--)
			if(num%i==0)
				System.out.print("\033[91m"+i+" ");
		System.out.println("\033[0m");
	}
}