import java.util.*;
class OddArrayElements
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7,8,9};
		int count=0;
		for(int i:a)
		{
			if(i%2!=0)
				count++;
		}
		System.out.println(count);
		int[] oddElements = new int[count];
		int indx=0;
		for(int i:a)
		{
			if(i%2!=0)
				oddElements[indx++]=i;
		}
		System.out.println(Arrays.toString(oddElements));
		// System.out.println(Arrays.deepToString(oddElements));
	}
}