class PrimeNumbers
{
	static int num = 2;
	public static void main(String[] args)
	{
		int count = 0;
		for(;count!=10;)
		{
			// if(prime())
			// {
			// 	System.out.print(num+" ");
			// 	count++;
			// }
			// num++;
			System.out.println(" : "+prime());
			count++;
		}
		
	}
	/*public static boolean prime()
	{
		boolean flag = true;
		for(int i=2; i<num; i++)
		{
			if(num%i==0) 
			{
				flag = false;
				break;
			}
		}
		return flag;
	}*/
	public static int prime()
	{
		num++;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				num++;
				continue;
			}
			System.out.print(i+" ");
		}
		return num;
	}
}

// for(int i=2; i<500; i++)
// 		{
// 			int num = i;
// 			boolean flag = false;
// 			for(int j=2; j<i; j++)
// 			{
// 				if(num%j==0)
// 				{
// 					flag = true;
// 					break;
// 				}

// 			}
// 			if(!flag)
// 				System.out.print(num+" ");
// 		}