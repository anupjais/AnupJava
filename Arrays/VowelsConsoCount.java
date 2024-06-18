// wajp to cound vowels and consonents in a given array
import java.util.*;
class VowelsConsoCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size array : ");
		int size = sc.nextInt();

		char[] alpha = new char[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			System.out.print(i+1+" - ");
			alpha[i]=sc.next().toLowerCase().charAt(0);
			// alpha[i]=sc.next().charAt(0).toLowerCase();
		}
		int vCount=0, cCount=0;
		for(int i=0; i<size; i++)
		{
			if(alpha[i]=='a'||alpha[i]=='e'||alpha[i]=='i'||alpha[i]=='u'||alpha[i]=='o')
				vCount++;
			else
				cCount++;
		}
		System.out.println(Arrays.toString(alpha)+"\nVowels = "+vCount+"\nConsonetns = "+cCount);
		// char[] alphas = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		// System.out.print();
	}
}