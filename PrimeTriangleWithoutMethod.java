import java.util.Scanner;
class PrimeTriangleWithoutMethod
{
	static int num = 1;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		byte rows = sc.nextByte();
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				num++;
				for(int d=2; d<num; d++)
				{
					if(num%d==0)
					{
						num++;
						continue;
					}
				}
				System.out.print(num+" ");
			}
			System.out.println();
		}
		System.out.println("Prime nubers finished..");
	}
}