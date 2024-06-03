class Human implements Cloneable
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
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String toString()
	{
		return this.name.toUpperCase()+", "+this.place+", "+this.gender+", \""+this.profession+"\"";
	}

}
class HumanDriverImplemented
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Human obj = new Human("Ramesh", "Pune", "Male", "FSJD");
		// System.out.println(obj);
		// System.out.println(obj);
		Human obj2 = (Human)obj.clone();
		System.out.println(obj);
		System.out.println(obj2);
	}
}