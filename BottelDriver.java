class BottelDriver
{
	public static void main(String[] args)
	{
		Bottel Obj = new Bottel();
		obj.displayBottel();
	}
}
class Bottel
{
	String material;
	double cap;
	double weight;

	void displayBottel()
	{
		System.out.println(material+" "+cap+" "+weight);
	}
}