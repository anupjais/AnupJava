
// Not working

import java.util.*;
class UniqueEle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// int[] a = new int[5];
		int[] a = {6,6,5,6,4,4,4,6,6};
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			// for(int j=i+1; j<a.length-1; j++) // 19
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
					continue;
				// System.out.print(a[i]+" ");
				count++;
			}
		}
		int [] a2 = new int[count];
		for(int i: a)
		{
			// if(i)
		}
		// for(int i=0; i<a.length; i++)
		// {
		// 	for(int j=0)
		// }
		System.out.println(count);
	}
}