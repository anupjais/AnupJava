class Engine
{
	int horsePower;
	int noPiston;
	double capacityLitre;
	double milage;
	String engineType;

	Engine(int horsePower, String engineType, double capacityLitre, double milage, int noPiston)
	{
		this.horsePower = horsePower;
		this.engineType = engineType;
		this.capacityLitre = capacityLitre;
		this.milage = milage;
		this.noPiston = noPiston;
	}
	Engine()
	{

	}
	public void displayEngine()
	{
		System.out.println("Power : "+horsePower);
		System.out.println("Pistons : "+noPiston);
		System.out.println("Capacity : "+capacityLitre);
		System.out.println("Milage : "+milage);
		System.out.println("Engine type : "+engineType);
	}

}