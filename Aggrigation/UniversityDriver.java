class UniversityDriver
{
	public static void main(String[] args)
	{
		University university = new University("Savitribai Phule Pune University","Regular & Distance",1322,30,50,1954);
		// university.displayUniversity();
		university.createInstanceOfCollege("Trinity Academy of Engineering","Kodhawa-Saswad Road, Pune", 4089, 122, 150, 'A');
		// String name, String address, int clgCode, int noOfDeparment, int staffCount, char grade
		university.college.deparment = new Department("Mechanical","MRS. Dipti Kulkarni", 17, 30, 54);
		// Department deparment = new Department("Mechanical","MRS. Dipti Kulkarni", 17, 30, 54);
		// deparment.displayDepartment();
		// String name, String hodName, int noOfClassroom, int noOfStaff, int noOfSubjects
		university.college.deparment.teacher = new Teacher("Mr. Srikant K.", "Java", "B.Tech",456324562256l, 3);
		// Teacher teacher = new Teacher("Mr. Srikant K.", "Java", "B.Tech",456324562256l, 3);
		// teacher.displayTeacher();
		// Teacher(String name, String subject, String qualification, long phoneNumber, int experience)

		university.displayUniversity();
		university.college.displayCollege();
		university.college.deparment.displayDepartment();
		university.college.deparment.teacher.displayTeacher();
	}
}