class Driver
{
	public static void main(String[] args)
	{
		// Car car = new Car();
		// car.displayCar();
		Car car1 = new Car("Volvo", "C90", "SI", 3000000, 5);
	// Car(String brand, String model, String type, double price, int seatCapacity)
		car1.displayCar();
		Car car2 = new Car("Toyota", "Hrculus", "All Wheel Drive", 7000000, 5,(new Engine(200, "Hybride", 2.0, 5, 8)));
	// Engine(String horsePower, String engineType, double capacityLitre, double milage, int noPiston)
		car2.displayCar();
		car2.engine.displayEngine();
		// car.displayEngine();
		Car car3 = new Car("Tata", "Safari", "Off-Road", 2500000, 7,180, "Petrol", 1.2, 10, 6);
		car3.displayCar();
		car3.engine.displayEngine();
	}
}

/*
car1.engine.displayEngine();
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Engine.displayEngine()" because 
"<local1>.engine" is null
	at 
Driver.main(Driver.java:10)
*/