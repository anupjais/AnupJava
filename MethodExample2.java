class MethodExample2
{
	public static void main(String[] args) {
		System.out.println("Main starts");
		ramesh();
		System.out.println("Main ends");
		// System.out.println();
	}
	public static void ramesh()
	{
		System.out.println("\033[95mRamesh starts");
		suresh();
		System.out.println("\033[95mRamesh ends\033[0m");
	}
	public static void suresh()
	{
		System.out.println("\033[92mSuresh starts");
		mahesh();
		System.out.println("\033[92mSuresh ends\033[0m");
	}
	public static void mahesh()
	{
		System.out.println("\033[93mMahesh starts");
		System.out.println("\033[93mMahesh ends\033[0m");
	}
}