import java.lang.*;
class ClassName
{
	public static void main(String[] args)
	{
		// System.out.println("Name : "+Thread.currentThread().getName());
		// System.out.println("ClassName : "+Thread.currentThread().getClass());
		// int i=0;
		// while(i++<1)
		// {
		// 	try
		// 	{
		// 		System.out.println("TRY block");
		// 		System.out.println(10/0);
		// 	}
		// 	catch(ArithmeticException ae)
		// 	{
		// 		return;
		// 		System.exit(0);
		// 	}
		// 	finally
		// 	{
		// 		System.out.println("I'm finally block.");
		// 	}
		// 	System.out.println("Execution Ends");
		// }

		// throw new ArrayStoreException("Ankit");
		// Thread.setName("AnupThread");
		Thread.currentThread().setName("AnupThread");
		// System.out.println(Thread.getName());
		System.out.println("Name : "+Thread.currentThread().getName());
	}
}