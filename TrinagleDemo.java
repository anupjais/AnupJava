class TrinagleDemo
{
	public static void main(String[] args) {
		int num =0;
		for (int i=1; i<=6; i++)
		{
			int a=num;
			for (int j=1; j<i; j++ ) {
				System.out.print(a-- +" ");
			}
			num+=i;
			System.out.println();
		}
	}
}