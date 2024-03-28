import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number to check Sunny Number : ");
		// int num=sc.nextInt();
		for(int num=1; num<=10000; num++)
		{
			int nNum = num+1;
			boolean flag = false;
			for(int i=1; i<=nNum/2; i++)
			{
				if (i*i==nNum)
				{
					flag = true;
					// sqrrt=i;
					break;
				}
			}
			if(flag)
				// System.out.print(num+" is Sunny Number");
				System.out.print(num+" ");
		}
		
		// else
		// 	System.out.println(num+" is not Sunny Number");
		System.out.println();
	}
}