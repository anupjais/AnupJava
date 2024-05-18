class Teacher
{
	String name;
	String subject;
	String qualification;
	long phoneNumber;
	int experience;
	Teacher(String name, String subject, String qualification, long phoneNumber, int experience)
	{
		this.name = name;
		this.subject = subject;
		this.qualification = qualification;
		this.phoneNumber = phoneNumber;
		this.experience = experience;
	}

	public void displayTeacher()
	{
		System.out.println("\n\033[93m***** \033[94mTeacher \033[93m*****\033[0m");
		System.out.println("Name : "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Qualification : "+qualification);
		System.out.println("Mobile : "+phoneNumber);
		System.out.println("Experience : "+experience);
	}
}