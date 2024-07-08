import java.util.Scanner;
import java.util.Arrays;
class Dynamic2DArrInitialization
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// int[] arr1 = {5,6,7,8};
		// int[] arr2 = {11,12,13,14};
		int[][] arr1 = {{5,6,7},{1,2,3,4}};
		int[][] arr2 = {{55,66,77,88},{11,1,3,3,12,13,14}};

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("hashCode : "+Arrays.hashCode(arr1));
		System.out.println("arr1 : "+arr1);
		System.out.println("hashCode : "+Arrays.hashCode(arr2));
		System.out.println("arr2 : "+arr2);
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr2));
		// System.out.println("Arrays.toString(arr1) : "+Arrays.toString(arr1));
		// System.out.println("Arrays.toString(arr1[0]) : "+Arrays.toString(arr1[0]));
		// System.out.println("Arrays.toString(arr1[1]) : "+Arrays.toString(arr1[1]));
		// System.out.println("arr1.length : "+arr1.length);
		// System.out.println("arr1[0].length : "+arr1[0].length);
		// System.out.println("arr1[1].length : "+arr1[1].length);
		// System.out.println("Arrays.toString(arr2) : "+Arrays.toString(arr2));		
		// System.out.println("Arrays.toString(arr2[0]) : "+Arrays.toString(arr2[0]));
		// System.out.println("Arrays.toString(arr2[1]) : "+Arrays.toString(arr2[1]));
		// System.out.println("\narr2.length : "+arr2.length);
		// System.out.println("arr2[0].length : "+arr2[0].length);
		// System.out.println("arr2[1].length : "+arr2[1].length);
	}
}