import java.util.*;
class OddArray
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7,8,9};
		int count=0;
		for(int i:a)
		{
			count++;
		}
		int[] b = new int[count];
		int indx=0;
		for(int i:b)
		{
			if(i%2!=0)
				b[indx++]=i;
		}
		System.out.println(Arrays.toString(b));
	}
}