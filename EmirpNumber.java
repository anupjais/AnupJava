import java.util.Scanner;
class EmirpNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Emirp Number : ");
		int num = sc.nextInt();
		int dup=num,count=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		boolean flag = count==0?true:false;
		if (flag)
		{
			int rev=0;
			while(dup!=0)
			{
				// rev=rev*(dup%10);
				int rem = dup%10;
				rev*=10+rem;
				dup/=10;
			}
			int count1=0;
			for(int i=2; i<rev; i++)
			{
				if(rev%i==0)
				{
					count1++;
					break;
				}
			}
			boolean flag1 = count1==0?true:false;
			if(flag && flag1)
				System.out.println(num+" is an Emirp Number.");
			else
				System.out.println("Due to "+rev+", "+num+" is not an Emirp Number.");
			
		}else
			System.out.println(num+" is not an Emirp Number.");
	}
}