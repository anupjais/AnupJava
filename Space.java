class Space
{
	public void space(int num)
	{
		for(int i=1; i<num; i++)
			System.out.print("  ");
	}
}
class Star
{
	public void star(int num)
	{
		for(int i=1; i<=num; i++)
			System.out.print("* ");
	}
	public void star(int num, char ch)
	{
		for(int i=1; i<=num; i++)
			System.out.print(ch+" ");
	}
}