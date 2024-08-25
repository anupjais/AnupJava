class IntMax
{
	public static void main(String[] args)
	{
		for(int i=0; i<Integer.MAX_VALUE; i++)
		// for(int i=0; i<100; i++)
		{
			if(i%2==0 ||i%3==0 ||i%5==0 ||i%7==0 ||i%11==0 ||i%13==0||i%15==0 ||i%17==0 ||i%19==0 ||i%23==0||i%29==0 ||i%31==0 ||i%37==0 ||i%41==0||i%43==0 || i%47==0 || i%53==0 || i%59==0 || i%61==0 || i%67==0 || i%71==0 || i%73==0 || i%79==0 || i%83==0 || i%89==0 || i%97==0)
				continue;
			System.out.print(i+" ");
		}
		// System.out.println(Integer.MAX_VALUE);
	}
}