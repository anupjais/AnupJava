import java.util.*;
class ArrayElementsStoring
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		for(int i=0; i<names.length; i++)
		{
			System.out.print("Enter a name "+(i+1)+" : ");
			names[i] = sc.next();
		}
		// for (String s : names)
		// {
		// 	System.out.print(names[i]+" ");
		// }
		System.out.println(Arrays.toString(names));
	}
}