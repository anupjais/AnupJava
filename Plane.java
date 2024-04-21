class Aircraft
{
	String brand;
	String model;
	double price;
	int sittingCapacity;
	// double 

	Aircraft()
	{

	}
	Aircraft(String brand, String model, int sittingCapacity, double price)
	{
		this.brand = brand;
		this.model = model;
		this.sittingCapacity = sittingCapacity;
		this.price = price;
	}

	void displayAircraft()
	{
		System.out.println("______________________________\n");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Capacity : "+sittingCapacity);
		System.out.println("Price : "+price);
	}
}

class Plane
{
	public static void main(String[] args)
	{
		Aircraft obj1 = new Aircraft("Tejus","Mark-3",7,124.7);
		obj1.displayAircraft();

		Aircraft obj2 = new Aircraft();
		obj2.displayAircraft();
		obj2.brand="Lokeed-Martin";
		obj2.model="360-Globe Master";
		obj2.sittingCapacity=400;
		obj2.price=100.5;
		obj2.displayAircraft();

		 Aircraft obj3 = new Aircraft();
		 obj3.displayAircraft();
	}
}