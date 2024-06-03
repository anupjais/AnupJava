class Suradsan
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
			System.out.println("Try Block");
			// System.out.println(10/0);
			try{
				System.out.println("Inner try");
				System.out.println(190/0);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmeticException ");
			}
			catch(NullPointerException npe)
			{
				System.out.println("NullPointerException ");
			}
			catch(Exception ae)
			{
				System.out.println("Exception ");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException ");
		}
		catch(NullPointerException npe)
		{
			System.out.println("NullPointerException ");
		}
		catch(Exception ae)
		{
			System.out.println("Exception ");
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException");
		}

	}
}