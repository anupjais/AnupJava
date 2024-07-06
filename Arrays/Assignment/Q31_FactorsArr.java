// 31.Find factors of a number and store them in an array.
import java.util.Scanner;
import java.util.Arrays;
class Q31_FactorsArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int[] fact = factors(num);
		System.out.println(Arrays.toString(fact));
	}
	public static int[] factors(int num)
	{
		int count = 0;
		// int temp=num;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
				count++;
		}
		int[] fact = new int[count];
		for(int i=1, j=0; i<=num; i++)
		{
			if(num%i==0)
				fact[j++]=i;
		}
		return fact;
	}
}