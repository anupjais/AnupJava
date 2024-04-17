class PrimeTriangle
{
	static int num = 1;
	public static void main(String[] args)
	{
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(prime()+" ");
				// System.out.print("\033[1;4m"+prime()+"\033[0;103m\t\033[0m");
			}
			System.out.println();
		}
	}
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
		}
		return num;
	}
}