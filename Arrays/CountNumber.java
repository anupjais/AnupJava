import java.util.*;
class CountNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1+" : ");
			arr[i]=sc.nextInt();
		}
		for(;;)
		{
			int count=0, num;
			System.out.print("Enter the number to get to know the number of times insidet the array : ");
			num=sc.nextInt();
			for(int i=0; i<size; i++)
			{
				if(arr[i]==num)
					count++;
			}
			System.out.println(num+" got "+count+" of times.");
		}
	}
}