import java.util.Scanner;
class NumberToWords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup=num;
		String word = "";
		while (num!=0)
		{
			int rem = num%10;
			switch (rem)
			{
				case 0: word="\033[91mZero \033[0m"+word; break;
				case 1: word="\033[92mOne \033[0m"+word; break;
				case 2: word="\033[93m Two \033[0m"+word; break;
				case 3: word="\033[94m Three \033[0m"+word; break;
				case 4: word="\033[95m Four \033[0m"+word; break;
				case 5: word="\033[96m Five \033[0m"+word; break;
				case 6: word="\033[31m Six \033[0m"+word; break;
				case 7: word="\033[32m Seven \033[0m"+word; break;
				case 8: word="\033[33m Eight \033[0m"+word; break;
				case 9: word="\033[34m Nine \033[0m"+word; break;
			}
			num/=10;
		}
		System.out.println(dup+" : "+word);
	}

}