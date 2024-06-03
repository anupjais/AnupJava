class Mamini
{
	// Mamini()
	// {
	// 	System.out.println("Constructor called");
	// }
	static
	{
		System.out.println("Hello there");
	}
	void m1()
	{
		System.out.println("good Morning");
	}
	public static void main(String[] args) {
		System.out.println("Hi from parents");
	}
}
class Rutuja extends Mamini
{
	void m1()
	{
		System.out.println("Good evening");
	}
}
class MaminiDriver
{
	
}