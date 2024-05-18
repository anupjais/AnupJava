class University
{
	String name;
	String type;
	int unicode;
	int noOfColleges;
	int establishedYear;
	int cources;
	College college;
	// ()

	University(String name, String type, int unicode, int noOfColleges, int cources, int establishedYear)
	{
		this.name = name;
		this.type = type;
		this.unicode = unicode;
		this.noOfColleges = noOfColleges;
		this.cources = cources;
		this.establishedYear = establishedYear;
	}

	public void displayUniversity()
	{
		System.out.println("\n\033[93m***** \033[94mUniversity \033[93m*****\033[0m");
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
		System.out.println("University Code : "+unicode);
		System.out.println("Colleges : "+noOfColleges);
		System.out.println("Cources : "+cources);
		System.out.println("Estd. : "+establishedYear);
	}
	public void createInstanceOfCollege(String name, String address, int clgCode, int noOfDeparment, int staffCount, char grade)
	{
		college = new College(name, address, clgCode, noOfDeparment,staffCount, grade);
	}
}