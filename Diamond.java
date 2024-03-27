class Diamond
{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			System.out.print("\t\t\t\t\t");
			for(int j=5; j>i; j--)
			{
				System.out.print("  ");
			}
			for( int k=1; k<=(i*2-1); k++)
			{
				// System.out.print((k==1 || k==(i*2/2) || k==i*2-1 || i==5)?"\033[93m*\033[0m ":"\033[92;5m*\033[0m ");
				System.out.print((k==1 || k==(i*2/2) || k==i*2-1 || i==5)?"\033[1;93;5m*\033[0m ":"\033[92m*\033[0m ");
				// System.out.print("\033[92m*\033[0m ");
			}
			System.out.println();
		}
		for(int i=5; i>=1; i--)
		{
			System.out.print("\t\t\t\t\t");
			for(int k=5-i; k>0; k--)
				System.out.print("  ");
			for(int j=1; j<=(i*2-1); j++)
				// System.out.print((j==1 || j==(i*2/2) || j==i*2-1 || i==5)?"\033[96m*\033[0m ":"\033[92;5m*\033[0m ");
				System.out.print((j==1 || j==(i*2/2) || j==i*2-1 || i==5)?"\033[1;96;5m*\033[0m ":"\033[92m*\033[0m ");
				// System.out.print("\033[92m*\033[0m ");
				// System.out.print("* ");
			
			System.out.println();
		}
	}
}




