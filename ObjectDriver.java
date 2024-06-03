import java.util.Scanner;
class Student
{
	Scanner sc = new Scanner(System.in);

	String name;
	String place;
	String branch;
	int yop;

	Student()
	{

	}
	Student(String name,String place,String branch,int yop)
	{
		this.name = name;
		this.place = place;
		this.branch = branch;
		this.yop = yop;
	}

	public boolean equals(Object obj)
	{
		Student obj1 = (Student)obj;
		boolean flag = false;
		if((this.name == obj1.name) && (this.branch == obj1.branch) && (this.place == obj1.place) && (this.yop == obj1.yop))
			flag = true;
		return flag;
	}
	public void getInfo()
	{
		System.out.print("Enter you name : ");
		this.name = sc.nextLine();
	}

}
class ObjectDriver
{
	public static void main(String[] args)
	{
		// Scanner sc = new Scanner(System.in);
		Student obj3;
		Student obj4;
		System.out.print("Enter");

		// Student obj1 = new Student("Ramesh","Pune","MCA", 2025);
		// Student obj2 = new Student("Ramesh","Pune","MCA", 2025);
		System.out.println(obj1.equals(obj2));
	}
}