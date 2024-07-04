// 3. Write a java program to Print elements from1D array using do- while loop.
import java.util.Scanner;
class Q3_PrintEleDoWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements..");
		int i=0;
		do{
			System.out.print(i+1+" ");
			arr[i++]=sc.nextInt();
		}while(i<arr.length);
		System.out.println("The elements are..");
		int j=0;
		do{
			System.out.print(arr[j++]+" ");
		}while(j<arr.length);
		System.out.println();
	}
}