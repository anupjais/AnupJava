class EvenOddRecusionMess
{
	static int num = 1;
	public static void main(String[] args)
	{
		evenOddRecusionMess();
	}
	public static void evenOddRecusionMess()
	{
		if(num++ %2==0)
			System.out.print(num-1+" ");
		// else
		// 	System.out.print(num+" ");

		if(num>=10)
		{
			System.out.println();
			return ;
		}
		evenOddRecusionMess();
	}
}