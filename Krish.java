import java.util.Scanner;
class Krish
{
	public static void main(String[] args) {
		for(int j=1; j<999999999; j++)
		{
			int num=j;
			int dup=num, sum=0;
			while (dup!=0)
			{
				int fact = 1;
				int rem = dup%10;
				for(int i=rem; i>1; i--)
					fact*=i;
				sum+=fact;
				dup/=10;
			}
			if(num==sum)
				System.out.println(num+" is a Krish Number.");
		}
	}
}