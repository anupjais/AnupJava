import java.util.Scanner;
class Student
{
	private String name, nativePlace, branch;
	Student(String name, String nativePlace, String branch)
	{
		this.name = name;
		this.nativePlace = nativePlace;
		this.branch = branch;
	}
	public String getName()
	{
		return name;
	}
	public String getNativePlace()
	{
		return nativePlace;
	}
	public String getBranch()
	{
		return branch;
	}

	public void setName(String updatedName)
	{
		name = updatedName;
		System.out.println("\033[92mName updated\033[0m");
	}
	public void setNativePlace(String updateNativePlace)
	{
		nativePlace = updateNativePlace;
		System.out.println("\033[92mNative-place updated\033[0m");

	}
	public void setBranch(String updatedBranch)
	{
		branch = updatedBranch;
		System.out.println("\033[92mBranch updated\033[0m");

	}
	
}
class EncapsulationDriver
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Anup", "Pune", "MCA");
		System.out.println(obj.getName());
		// System.out.print("Do you want update : ");
		obj.setName("Anup Kumar");
		System.out.println(obj.getName());
		// \033[\033[0m92m
	}
}