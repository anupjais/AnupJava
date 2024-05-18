class Department
{
	String name;
	String hodName;
	int noOfClassroom;
	int noOfStaff;
	int noOfSubjects;
	Teacher teacher;
	
	Department(String name, String hodName, int noOfClassroom, int noOfStaff, int noOfSubjects)
	{
		this.name = name;
		this.hodName = hodName;
		this.noOfClassroom = noOfClassroom;
		this.noOfStaff = noOfStaff;
		this.noOfSubjects = noOfSubjects;
	}
	public void displayDepartment()
	{
		System.out.println("\n\033[93m***** \033[94mDepartment \033[93m*****\033[0m");
		System.out.println("Name : "+name);
		System.out.println("HOD : "+hodName);
		System.out.println("Classrooms : "+noOfClassroom);
		System.out.println("Faculties : "+noOfStaff);
		System.out.println("Subjects : "+noOfSubjects);
	}
	public void createInstanceOfTeacher(String name, String subject, String qualification, long phoneNumber, int experience)
	{
		teacher = new Teacher(name, subject, qualification, phoneNumber, experience);
	}
}