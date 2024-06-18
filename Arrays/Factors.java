// wajpt fetch all the factors in an array
// wajp to find the factors of a numbers and store all these
// find sum of all elements at even indexes 
// find sum of all elements at odd indexes 
// wajpts first 10 prime numbers in a new array
// wajpts the fibonacci seriese of any terms in as array upto the number
import java.util.*;
class Factors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sz=0;
		for(int i=1; i<=num; i++)
		{
			if (num%i==0)
				// System.out.print();
				sz++;
		}
		int[] arr = new int[sz];
		int indx=0;
		System.out.print("Factors : ");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
				arr[indx++]=i;
		}
		System.out.println(Arrays.toString(arr));
	}
}
