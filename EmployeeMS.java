import java.util.Scanner;
class EmployeeMS
{
	static String ename;
	static String erol;
	static int eid;
	static double esal;

	static String red = "\033[91m";
	static String green = "\033[92m";
	static String yellow = "\033[93m";
	static String blue = "\033[94m";
	static String pink = "\033[95m";
	static String liblue = "\033[96m";

	static String drkred = "\033[31m";
	static String drkgreen = "\033[32m";
	static String drkyellow = "\033[33m";
	static String drkblue = "\033[34m";
	static String drkpink = "\033[35m";
	static String drkliblue = "\033[36m";

	static String redBg = "\033[101m";
	static String greenBg = "\033[102m";
	static String yellowBg = "\033[103m";
	static String blueBg = "\033[104m";
	static String pinkBg = "\033[105m";
	static String liblueBg = "\033[106m";
	
	static String drkredBg = "\033[41m";
	static String drkgreenBg = "\033[42m";
	static String drkyellowBg = "\033[43m";
	static String drkblueBg = "\033[44m";
	static String drkpinkBg = "\033[45m";
	static String drkliblueBg = "\033[46m";
	// static String yellow = "\033[93m";
	static String neutral = "\033[0m";
	static String blink = "\033[5m";
	static String black = "\033[30m";
	static String bold = "\033[1m";


	
	public static void main(String[] args)
	{
		// System.out.println(ename+"\n"+erol+"\n"+eid+"\n"+esal);
		Scanner sc = new Scanner(System.in);
		clrScr();
		outerloop:
		for (; ; )
		{
			welcome();
			homeMenu();
			option();
			int opt = sc.nextInt();
			centerScr();
			// System.out.println("Option is "+opt);
			switch(opt)
			{
				case 1:{
					addNewEmp();
					break;
				}
				case 2:{
					if(ename!=null)
					{
						// System.out.println("Please add employee.");
						clrScr();
						viewEmp();
						System.out.println();
						// centerScr();
						// System.out.println("0. EXIT or 1. Continue : ");
						// option();
						// int per = sc.nextInt();
						// if(per==1)
						// 	continue outerloop;

						// +"\n"+erol+"\n"+eid+"\n"+esal);
					}else{
						clrScr();
						System.out.println();
						centerScr();
						System.out.println(red+bold+"No employee"+neutral);
					}
					break;
				}
				case 3:{
					if(ename!=null)
					{
						clrScr();
						System.out.println();
						centerScr();
						System.out.print(bold+"Enter the Employee Id : "+neutral);
						int nEid = sc.nextInt();
						if(nEid==eid)
							editEmp(nEid);
						else
						{
							clrScr();
							centerScr();
							System.out.println(eid+" does not exist.");
						}
					}
					else{
						clrScr();
						System.out.println();
						centerScr();
						System.out.println(red+bold+"No employee"+neutral);
					}
					break;
				}
				case 4:{
					if(ename!=null)
					{
						rmvEmp();
					}
					else{
						clrScr();
						System.out.println();
						centerScr();
						System.out.println(red+bold+"No employee"+neutral);
					}
					break;
				}
				case 0:{
					exit();
				}
				default :
					// System.out.println("");
					clrScr();
					invalidOption();
			}

		}

	}
	public static void welcome()
	{
		// clrScr();
		String wlcm = "Welcome To Employee Management System";
		System.out.println();
		starPattern(wlcm);
		centerScr();
		System.out.print(bold+red+"* * * "+neutral+bold+liblue+blink+wlcm+neutral+red+bold+" * * * "+neutral);
		starPattern(wlcm);
	}
	public static void starPattern(String e)
	{
		int len = e.length();
		// System.out.println(len);
		centerScr();
		// for(int i=0; i<(len+9)/2; i++)
		// {
		// 	System.out.print(i+"\t");
		// }
		System.out.println();
		centerScr();
		for(int i=0; i<(len+14)/2; i++)
		{
			// System.out.print("*\t");
			System.out.print("* ");
		}
		System.out.println();
	}
	public static void centerScr()
	{
		System.out.print("\t\t\t\t\t\t");
	}
	public static void invalidOption()
	{
		System.out.println();
		centerScr();
		System.out.print(red+blink+bold+"Invalid Option.\n"+neutral);
	}
	public static void clrScr()
	{
		System.out.print("\033[H\033[2J");
	}
	public static void exit()
	{
		clrScr();
		System.out.println();
		centerScr();
		System.out.println(drkliblue+bold+"Thank You For Using Our Services\n");
		centerScr();
		System.out.println("Please Visit Again.."+neutral);
		// System.out.println(centerScr(),"Thank You For Using Our Services\n"+centerScr(),"Please Visit Again..");
		System.exit(0);
	}
	public static void option()
	{
		System.out.print(pink+bold+"\n\t\t\t\t\t\tEnter your choice : "+neutral);
	}
	/*public static int option()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(pink+bold+"\n\t\t\t\t\t\tEnter your choice : "+neutral);
		int num = sc.nextInt();
		return num;
	}
	public static String option()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(pink+bold+"\n\t\t\t\t\t\tEnter your choice : "+neutral);
		String name = sc.nextLine();
		return name;
	}*/
	public static void homeMenu()
	{
		System.out.print(drkyellow+bold+"\n\t\t\t\t\t\t\t1. Add New Employee\n\t\t\t\t\t\t\t2. View\n\t\t\t\t\t\t\t3. Edit\n\t\t\t\t\t\t\t4. Remove\n\t\t\t\t\t\t\t0. EXIT\n "+neutral);
	}
	public static void addNewEmp()
	{
		Scanner sc = new Scanner(System.in);
		centerScr();
		System.out.print("Employee Name : ");
		ename = sc.nextLine();
		centerScr();
		System.out.print("Employee Role : ");
		erol = sc.nextLine();
		centerScr();
		System.out.print("Employee Salary : ");
		esal = sc.nextDouble();
		centerScr();
		System.out.print("Employee ID : ");
		eid = sc.nextInt();
	}
	public static void viewEmp()
	{
		String vname = "View Option";
		starPattern(vname);
		centerScr();
		System.out.println("* * * "+vname+" * * * ");
		starPattern(vname);
		System.out.println();
		centerScr();
		System.out.println(bold+"The Employee Is "+neutral);
		System.out.println();
		centerScr();
		System.out.println(bold+blue+"ename : "+neutral+ename);
		centerScr();
		System.out.println(bold+blue+"erol  : "+neutral+erol);
		centerScr();
		System.out.println(bold+blue+"eid   : "+neutral+eid);
		centerScr();
		System.out.println(bold+blue+"esal  : "+neutral+esal);
	}
	public static void rmvEmp()
	{
		clrScr();
		System.out.println();
		centerScr();
		System.out.println(red+bold+"Employee Id "+eid+" is removed."+neutral);
		ename = null;
		erol = null;
		esal = 0;
		eid = 0;
	}
	public static void editEmp(int opt)
	{
		Scanner sc = new Scanner(System.in);
		centerScr();
		System.out.println("1. Edit Name ");
		centerScr();
		System.out.println("2. Edit Salary ");
		centerScr();
		System.out.println("3. Edit Designation ");
		centerScr();
		System.out.println("0. EXIT ");
		// System.out.println();
		option();
		int eopt = sc.nextInt();
		// sc.nextLine();
		switch(eopt)
		{
			case 1:{
					centerScr();
					System.out.print("Enter revised Name : ");
					String rEname = sc.nextLine();
					// sc1.nextLine();
					ename = rEname;
					centerScr();
					System.out.println("Name Revised");
					break;
				}
			case 2:{
					centerScr();
					System.out.print("Enter revised Salary : ");
					double rEsal = sc.nextDouble();
					esal = rEsal;
					centerScr();
					System.out.println("Salary Revised");
					break;
				}
			case 3:{
					centerScr();
					System.out.print("Enter revised Designation : ");
					String rErol = sc.nextLine();
					erol = rErol;
					centerScr();
					System.out.println("Designation Revised");
					break;
				}
			case 0:
				exit();
			default:
					invalidOption();	
		}
		
	}

}

