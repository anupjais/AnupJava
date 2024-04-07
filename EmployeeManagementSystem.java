import java.util.Scanner;
class EmployeeManagementSystem
{
	static String ename;
	static String erol;
	static int eid;
	static double esal;

	public static void main(String[] args)
	{
		System.out.println(ename+"\n"+erol+"\n"+eid+"\n"+esal);
		Scanner sc = new Scanner(System.in);
		// addNewEmp();
		
		outerloop:
		for (; ; )
		{
			welcome();
			homeMenu();
			option();
			int opt = sc.nextInt();
			// centerScr();
			System.out.println("Option is ");
			switch(opt)
			{
				case 1:{
						addNewEmp();
						break;
					}
				case 2:{
					if(ename!=null)
					{
						System.out.println(ename+"\n"+erol+"\n"+eid+"\n"+esal);
					}else{
						// clrScr();
						System.out.println();
						// centerScr();
						System.out.println("No employee Please.");
					}
					// if(ename!=null)
					// 	System.out.println(ename+"\n"+erol+"\n"+eid+"\n"+esal);
					// else
					// 	System.out.println("No emp.");
						break;
					}
				case 3:{
						break;
					}
				case 4:{

						break;
					}
				case 0:{
					exit();
						}
				default :
					// System.out.println("");
					// invalidOption();
			}

		}

	}
	public static void welcome()
	{
		// clrScr();
		String wlcm = "Welcome To Employee Management System";
		System.out.println();
		starPattern(wlcm);
		System.out.print("* * * "+wlcm+" * * * ");
		starPattern(wlcm);
	}
	public static void starPattern(String e)
	{
		int len = e.length();
		System.out.println();
		// centerScr();
		for(int i=0; i<(len+14)/2; i++)
		{
			// System.out.print("*\t");
			System.out.print("* ");
		}
		System.out.println();
	}
	
	public static void exit()
	{
		System.out.println("Thank You For Using Our Services\nPlease Visit Again..");
		// System.out.println(centerScr(),"Thank You For Using Our Services\n"+centerScr(),"Please Visit Again..");
		System.exit(0);
	}
	public static void option()
	{
		System.out.print("Enter your choice : ");
	}
	public static void homeMenu()
	{
		System.out.print("\n1. Add New Employee\n2. View\n3. Edit\n4. Remove\n0. EXIT\n ");
	}
	public static void addNewEmp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Employee Name : ");
		ename = sc.nextLine();
		System.out.print("Employee Role : ");
		erol = sc.nextLine();
		System.out.print("Employee Salary : ");
		esal = sc.nextDouble();
		System.out.print("Employee ID : ");
		eid = sc.nextInt();
	}
	

}