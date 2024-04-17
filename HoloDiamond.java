class HoloDiamond
{
	public static void main(String[] args)
	{
		int rows=7;
		for(int i=1; i<rows; i++)
		{
			CenterScr.centerScr(7);
			for(int j=rows-1; j>i; j--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i*2; j++)
			{
				if(j==1 || j==i*2-1 )
				{
					Color.blink();
					Color.Indigo();
					System.out.print("* ");
					Color.neutral();
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

/*
	        * 			
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * * *

*/
		for(int i=1; i<rows; i++)
		{
			CenterScr.centerScr(7);
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=rows*2-2; j>i*2-1; j--)
			{
				if(j==rows*2-2 || j==i*2)
				{
					Color.blink();
					Color.Green();
					System.out.print("* ");
					Color.neutral();
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}