import java.util.Scanner;
class PointerExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Entere a number : ");
		int num = sc.nextInt();

		int* ptr;
		System.out.println("Pointer variable : "+ptr);
		ptr = &num;
		System.out.println("Pointer variable : "+ptr);
	}
}