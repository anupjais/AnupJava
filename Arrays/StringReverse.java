class StringReverse
{
	public static void main(String[] args)
	{
		String [] names = {"Ashutosh", "Aditya", "Rushikesh", " Prakash"};
		System.out.print("Reversed array names : ");
		for (int i=names.length-1; i>=0; i--)
		{
			System.out.print("\033[92;1m"+names[i]+" ");
		}
		System.out.println("\033[0m");
	}
}