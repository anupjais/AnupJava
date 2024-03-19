class LoopParts
{
	public static void main(String[] args) {
		System.out.println("Upper-Case Alphabets..");
		for(char ch=65; ch<=90; ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println("Reverse of Upper-Case Alphabets..");
		for(char ch=90; ch>=65; ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println("\n\n\n****************************************************************************");
		System.out.println("Lower-Case Alphabets..");
		for(char ch=97; ch<=122; ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println("Reverse of Lower-Case Alphabets..");
		for(char ch=122; ch>=97; ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println("\n\n\n****************************************************************************");
		System.out.println("Digits..");
		for(char ch=48; ch<=57; ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println("Reverse of Digits..");
		for(char ch=57; ch>=48; ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
	}
}