// 21.Find odd elements and store it in a new array.
import java.util.Scanner;
import java.util.Arrays;
class Q21_OddElesArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int count=0;
		System.out.println("Enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+1+" ");
			arr[i]=sc.nextInt();
			if(arr[i]%2!=0)
				count++;
		}
		int[] odd = new int[count];
		int cnt=0;
		System.out.println("The elements : "+Arrays.toString(arr));
		// System.out.println("The elements : "+Arrays.toString(odd));
		System.out.print("The odd elements are : ");
		for(int i:arr)
		{
			if(i%2!=0)
				odd[cnt++]=i;
		}
		System.out.println(Arrays.toString(odd));
	}
}