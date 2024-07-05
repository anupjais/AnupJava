import java.util.Scanner;
import java.util.Arrays;

class ClockwiseRotation
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		int[] arr = {4,2,1,3,5};
		System.out.print("Enter the number of rotation : ");
		int rt = sc.nextInt();
		System.out.print("Enter the direction(C/A) of rotation : ");
		char dir = sc.next().toLowerCase().charAt(0);
		System.out.println(Arrays.toString(arr));
		switch(dir)
		{
			case 'a':
				{
					antiClockWise(arr,rt);
					break;
				}
			case 'c':
				{
					for(int i=0; i<rt; i++)
					{
						int temp=arr[0];
						for(int j=0; j<arr.length-1; j++)
						{
							arr[j] = arr[j+1];
						}
						arr[arr.length-1] = temp;
					}
					break;
				}
			default :
				System.out.println(dir+" is not a direction.");
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void antiClockWise(int[] arr, int rt)
	{
		for(int i=0; i<rt; i++)
		{
			int temp=arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
	}
}
