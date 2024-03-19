class MatrixCol
{
	public static void main(String[] args) {
		for(int i=1; i<11; i++)
		{
			for(int j=1; j<11; j++)
			{
				int val = i*j;
				System.out.print(val+" : "+\033[val+"m \033[0m");
			}
			System.out.println();
		}
	}
}