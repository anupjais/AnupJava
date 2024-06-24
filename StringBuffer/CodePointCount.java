import java.util.*;
class CodePointCount
{
	static String name;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		name = sc.nextLine();

		StringBuffer sb = new StringBuffer(name);

		System.out.print("Enter the start index : ");
		int sIndx = sc.nextInt();
		System.out.print("Enter the end index : ");
		int eIndx = sc.nextInt();
		// System.out.println("Code-Point-Count : "+name.codePointCount(sIndx,eIndx));
		System.out.println("Code-Point-Count : "+userCodePointCount(sIndx,eIndx));
	}
	public static int userCodePointCount(int sIndx, int eIndx)
	{
		if((sIndx<0 || sIndx>eIndx) || (eIndx>name.length()-1))
		{
			throw new IndexOutOfBoundsException("\033[91mWrong index : \033[94m["+sIndx+", "+eIndx+")\033[0m");
		}
		return eIndx-sIndx;
	}
}