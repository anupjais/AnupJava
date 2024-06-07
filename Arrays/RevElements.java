// wajp to reverse elements in an array
class RevElements
{
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6};
		System.out.print("Reversed array : ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}