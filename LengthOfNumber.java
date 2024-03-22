import java.util.Scanner;
class LengthOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check their length : ");
		int num = sc.nextInt();
		int length=0;
		for(int i=num; i!=0; i/=10)
		{
			length++;
		}
		System.out.println("Length of \033[94m"+num+" \033[0mis \033[92m"+length+"\033[0m");
	}
}