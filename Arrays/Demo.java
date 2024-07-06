class Demo
{
	int a = 420;
	public static void main(String[] args)
	{
		Demo obj = new Demo();
		int a = 5;
		System.out.println(obj.a);
		System.out.println(this.a);
	}
}