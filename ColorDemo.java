class Scr extends Screen
{
	Scr()
	{

	}
	public void disp()
	{
		System.out.println("Hiiii, I'm Scr's disp().");
	}
}
class ColorDemo
{
	public static void main(String[] args)
	{
		Scr obj = new Scr();
		obj.red();
		obj.disp();
		obj.centerScr();
		obj.red();
		obj.bold();
		obj.disp();
		obj.neutral();
	}
}