// wajp to fethch the -ve numbers in an array
class NegativeArray
{
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,-3,-5,6,78,-8,-0};
		System.out.print("The negative numbers : ");
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}