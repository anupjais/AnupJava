import java.util.*;
class RepeatingEle
{
	public static void main(String[] args)
	{
		// Scanner sc = new Scanner(System.in);
		// int[] arr = {1,2,3,1,3,6,8,2};
		int[] arr = {1,2,3,1,3,6,8,2,1,2,3,2};
		// int[] repeat = new int[arr.length/2];
		System.out.println(Arrays.toString(arr));
		// System.out.println(Arrays.toString(repeat));
		for(int i=0; i<arr.length; i++)
		{
			int count=0, m=0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && arr[i]!=0)
				{
					// System.out.print(arr[i]+" ");
					// repeat[count++] = arr[i];
					arr[j] = m--;
					// arr[j] = 0;

					count++;
				}
			}
			if(count>0)
			{
				System.out.println(arr[i]);
			}
		}
		// System.out.println(Arrays.toString(repeat));
		System.out.println(Arrays.toString(arr));
	}
}