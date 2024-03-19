class SquarePattern
{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			System.out.print("\t\t\t");
			for(int j=1; j<=5; j++)
			{
				// System.out.print("\033[91m* \033[0m");
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}