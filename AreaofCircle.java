// write a java program to find the area of a circle whose radious is 2.5 centimeter 
class AreaOfCircle
{
	public static void main(String[] args) {
		double radius = 2.5;
		final double pi = 3.14;
		double area = pi*(radius*radius);
		System.out.println("The area of a circle is "+area+"cm^2 whose radius is "+radius+"cm");
	}
}