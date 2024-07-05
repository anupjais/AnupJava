class GreaterSum
{
	public static void main(String[] args)
	{
		int[] arr = {16,17,4,3,5,2};
		int max = Integer.MIN_VALUE;
		int indx=0;
		for(int i=0; i<arr.length; i++)
		{
			// int sum=0;
			for(int j=i+1; j<arr.length; j++)
			{
				sum=arr[j];
				System.out.println(sum);
			}
			// if(arr[i]>sum)
			// {
			// 	System.out.print(arr[i]+" ");
			// }
				// if(max<arr[i])
				// {
				// 	indx = i;
				// 	max = arr[i];
				// }
			// }
		}
		// System.out.println(max+" "+indx);
		System.out.println();
	}
}