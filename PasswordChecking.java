import java.util.Scanner;
class PasswordChecking
{
	public static void main(String[] args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int count = 3;
		int sPass = 1213;
		int sec = 4000; 
		outerloop:
		for (; sec<=10000; )
		{
			do{
				System.out.print("\nEnter your Password : ");
				int uPass = sc.nextInt();
				if(sPass == uPass)
				{
					System.out.println("Welcome to the Laxmi Cheat Fund");
					// break;
					// count=0;
					// sec = 12000;
					break outerloop;
				}else{
					System.out.println("\033[91;1;5mYou have "+ --count + " Atteps More.\033[0m");
				}
			}while(count>0);
			if(count==0)
			{
				System.out.print("Password field will be available withing "+ sec/1000 +" seconds.");
				count = 3;
				Thread.sleep(sec);
				sec+=2000;
			}
		}
	}
}