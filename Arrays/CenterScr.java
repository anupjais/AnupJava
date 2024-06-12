class CenterScr extends Color
{
	public void centerScr()
	{
		System.out.print("\t\t\t\t\t");
		return ;
	}
	public void centerScr(int num)
	{
		for(int c=0; c<num; c++)
		System.out.print("\t");
	}
	public void clrScr()
	{
		System.out.print("\033[H \033[2J\n");
	}
	public void clrCenter()
	{
		for(int i=1; i<10; i++)
			System.out.println();

		// return ;
	}
	public void clrCenter(int num)
	{
		for(int i=1; i<num; i++)
			System.out.println();
	}
	void Delay(double r)
    {
        int i=1;
        while(i<r)
        {
            i++;
        }
    }
}