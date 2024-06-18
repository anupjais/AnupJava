import java.util.*;
class DeccanMitra
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String gf = sc.next();
		System.out.print("Enter wife : ");
		String wife = sc.next();

		if(gf.isEmpty())
		{
			try{
				throw new Exception("GirlFriend Missing");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else{
			System.out.println(wife.concat(gf));
		}
	}
}