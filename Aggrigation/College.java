class College
{
	String name;
	int clgCode;
	int noOfDeparment;
	String address;
	int staffCount;
	char grade;
	Department deparment;
	College(String name, String address, int clgCode, int noOfDeparment, int staffCount, char grade)
	{
		this.name = name;
		this.address = address;
		this.clgCode = clgCode;
		this.noOfDeparment = noOfDeparment;
		this.staffCount = staffCount;
		this.grade = grade;
	}
	public void displayCollege()
	{
		System.out.println("\n\033[93m***** \033[94mCollege \033[93m*****\033[0m");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("College Code : "+clgCode);
		System.out.println("Deparments : "+noOfDeparment);
		System.out.println("Staff : "+staffCount);
		System.out.println("Grade : "+grade);
	}
	public void createInstanceOfDepartment(String name, String hodName, int noOfClassroom, int noOfStaff, int noOfSubjects)
	{
		deparment = new Department(name, hodName, noOfClassroom, noOfStaff, noOfSubjects);
	}

}