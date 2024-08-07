import java.util.*;
// import java.util.StringBuffer;
class InstanceCheck
{
	public static void main(String[] args)
	{
		String ab = new String();
		if(ab instanceof StringBuffer)
			System.out.println("It's a string");
		else
			System.out.println("It's a StringBuffer");
	}
}