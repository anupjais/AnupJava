// wajpt store even & odd ele in to diff arr
import java.util.*;
class EvenOddArrays
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1 +" ");
			arr[i]=sc.nextInt();
		}
		int evn=0;
		for(int i: arr)
		{
			if (i%2==0)
				evn++;
		}
		int odd=arr.length-evn;
		int[] evnArr = new int[evn];
		int[] oddArr = new int[odd];
		int ev=0,od=0;
		for(int i:arr)
		{
			if(i%2==0)
				evnArr[ev++]=i;
			else
				oddArr[od++]=i;
		}
		System.out.println("Evens : "+Arrays.toString(evnArr));
		System.out.println("Odds : "+Arrays.toString(oddArr));
	}
}