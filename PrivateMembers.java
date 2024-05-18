class PrivateMembers
{
	public static void main(String[] args)
	{
		Child child = new Child();
		child.dispChild();
		child.num2 = 30;
		child.dispChild();
		Sameer sameer = new Sameer();
		System.out.println(sameer.name,sameer.num,sameer.num2);
	}
}

class Sameer
{
	private int num = 10;
	protected int num2 = 20;
	String name = "Bhande";
}

class Child extends Sameer
{
	public void dispChild()
	{
		System.out.println("Number2 : "+num2);
		System.out.println("Name : "+name);
	}
}