class MatrixCol
{
	public static void main(String[] args) {
		int j, val=0;
		for(int i=0; i<11; i++)
		{
		  val = i*10;
			for(j=1; j<11; j++)
			{
				// int val = i*j;
				// val+=j;
				val++;
				if(val==47 || val==107)
				    System.out.print("\033["+val+";30;1m"+val+"\033[0m");
				// System.out.print(val+" : \033["+val+"m"+val+" \t\033[0m");
				//if((val>8 && val<30)||(val>47 && val<90)||(val>36 && val<40)||(val>96 && val<100)||(val>107 && val<111))
					//continue;
				System.out.print("\033["+val+"m"+val+" \t\033[0m");
			}
			// if((val>8 && val<30)||(val>47 && val<90))
			// 		continue;
			System.out.println();
		}
	}
}
