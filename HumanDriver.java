class Human
{
	String name;
	String place;
	String gender;
	String profession;
	Human(String name,String place,String gender,String profession)
	{
		this.name = name;
		this.place = place;
		this.gender = gender;
		this.profession= profession;
	}
	public String toString()
	{
		return this.name.toUpperCase()+", "+this.place+", "+this.gender+", \""+this.profession+"\"";
	}

}
class HumanDriver
{
	public static void main(String[] args)
	{
		Human obj = new Human("Ramesh", "Pune", "Male", "FSJD");
		System.out.println(obj);
		// System.out.println(obj);
	}
}