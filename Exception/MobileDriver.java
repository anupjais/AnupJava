import java.util.Scanner;
class MobileDriver
{
	static Mobile mobile;
	// boolean key;
	public static void main(String[] args)
	{
		System.out.println("\033[94;1mWelcome to Deccan Mitra Mandali\033[0m");
		Scanner sc = new Scanner(System.in);

		try
		{
			boolean key = true;
			mobile.key = key;
			mobile.playGame(key);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			try
			{
				mobile = new Mobile();
				mobile.key = true;
				System.out.println("1. To play Game\n2. To watch Reels\n");
				System.out.print("\033[94mEnter your choice : \033[0m");
				int num = sc.nextInt();
				mobile.key=true;
				switch(num)
				{
					case 1:
							mobile.playGame(mobile.key);
						break;
					case 2:
							mobile.watchReels(mobile.key);
						break;
					default :
						System.out.println("\033[94;5mWrong input\033[0m");
						System.out.println("\033[91mWatch Reels\033[0m");
						mobile.watchReels(mobile.key);
				}
			}
			catch(Exception e2)
			{
				System.out.println(e2.getMessage());
			}
		}
		System.out.println("\033[95mProgram Over\033[0m");
	}
}