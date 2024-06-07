class LengthVar
{
	public static void main(String[] args)
	{
		int [] a = {10,20,30,40,50,60,70};
		int lngth = 0;
		for(;;)
		{
			try
			{
				System.out.println(a[lngth++]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("The length of the array is : "+--lngth);
				break;
			}
		}
	}
}