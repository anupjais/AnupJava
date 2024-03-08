class IndianCensus
{
	public static void main(String[] args) {
		long cp = 312032486; // cp: Current Population
		long secondsPeryear=365*24*60*60;
		long birthPerYear = (secondsPeryear)/7;
		long deathPerYear = (secondsPeryear)/13;
		long immigrantsPerYear = (secondsPeryear)/45;
		byte desiredYear = 5;
		long updatedPopulation = cp+(birthPerYear+immigrantsPerYear-deathPerYear)*desiredYear;
		System.out.println("The current population is "+cp);
		// System.out.println(" and one year later - "+updatedPopulation);
		System.out.println(" and "+desiredYear+" year later - "+updatedPopulation);
	}
}