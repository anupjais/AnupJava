import java.util.*;
import java.util.stream.*;
class Shrikant2
{
	public static void main(String[] args) {
		int [] arr = {1,2,4,3,2,4,3,1,4,2,3,2,4};
		System.out.println(Arrays.toString(arr));

		Arrays.stream(arr).max().forEach(ele->System.out.println(ele));

	}
}