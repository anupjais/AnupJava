class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatCapacity;

	Engine engine;

	Car(String brand, String model, String type, double price, int seatCapacity)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatCapacity = seatCapacity;
	}
	Car(String brand, String model, String type, double price, int seatCapacity,int horsePower, String engineType, double capacityLitre, double milage, int noPiston)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatCapacity = seatCapacity;
		engine = new Engine(horsePower, engineType, capacityLitre, milage, noPiston);
	}
	Car(String brand, String model, String type, double price, int seatCapacity, Engine engine)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatCapacity = seatCapacity;
		this.engine = engine;
	}
	Car()
	{

	}
	public void displayCar()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Seatting Capacity : "+seatCapacity);
		System.out.println();
	}

}