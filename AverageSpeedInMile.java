class AverageSpeedInMile
{
	public static void main(String[] args) {
		float runsInKm = 14;
		double timeTakenInSeconds = 45*60+30;
		double runsInMiles = runsInKm/1.6;
		double timeInHr = timeTakenInSeconds/(60*60);
		double avgSpeed = runsInMiles/timeInHr;
		System.out.println("The average speed in Miles is "+avgSpeed+"mile/hr");
	}
}