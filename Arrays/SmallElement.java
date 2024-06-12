import java.util.*;
class SmallElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// int[] a = {9,8,7,5,3,2,1};
		int[] a=new int[5];
		System.out.println("Enter array elements");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(i+1 + " : ");
			a[i]=sc.nextInt();
		}
		int sm = a[0];
		// for(int i:a)
		// {
		// 	if(sm>i)
		// 		sm=i;
		// }
		// System.out.println("Small : "+sm);


		for(int i=1; i<a.length; i++)
		{
			if(sm>a[i])
				sm=a[i];
		}
		System.out.println(sm);
	}
}