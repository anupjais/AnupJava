import java.util.*;
class CheetaFundBank
{
	static String name;
	static String addr;
	static long phoneNo;
	static long adrNo;
	static double bal;
	static int upiPin;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		outerloop:
		for (; ; )
		{
			System.out.println("\t*******************************************\n\t\033[93;5m*******\033[0m\t\033[96mWelcome To Cheeta Fund Bank\033[0m \033[93;5m*******\033[0m\n\t*******************************************\n");
			System.out.print("\n\t\t1. Open Account\n\t\t2. Existing User\n\t\t0. EXIT");
			System.out.print("\n\n\tEnter you preference : ");
			int option = sc.nextInt();

			switch (option)
			{
				case 1:
					{
						sc.nextLine();
						System.out.print("\t*******************************\n\t******* \033[34;5mAccount Section\033[0m *******\n\t*******************************\n");
						System.out.print("Your Name : ");
						name=sc.nextLine();
						System.out.print("Your Address : ");
						addr=sc.nextLine();
						System.out.print("Phone Number : ");
						phoneNo=sc.nextLong();
						System.out.print("Adhar Number : ");
						adrNo=sc.nextLong();
						System.out.print("Deposit Amount : ");
						bal=sc.nextDouble();
						boolean pin=true;
						pinSection:
						while(pin)
						{
							System.out.print("Create your Pin : ");
							upiPin=sc.nextInt();
							System.out.print("Conform Pin : ");
							int cUpiPin=sc.nextInt();
							if (upiPin!=cUpiPin)
							{
								System.out.println("\033[91;5mIncorrect Pin\033[0m");
								continue pinSection;
							}
							pin=false;
						}
						System.out.println("\033[92mAccount Open Successfully.\033[0m");
						break;
					}
				case 2:
				{
					// if(name!=null)
					// {
						accountSectio:
						for(;;)
						{
							System.out.print("\t********************************\n\t******* \033[34;5mAccount Features\033[0m *******\n\t********************************\n");
							System.out.println("\t\t1. Check Balance\n\t\t2. Diposit Amount\n\t\t3. Withdrow Amount\n\t\t4. Account Information\n\t\t5. Log-Out\n\t\t0. EXIT\n");
							System.out.print("\nEnter your Choice from above menu number(1,2,3,4,5 or 0) : ");
							int opt=sc.nextInt();
							switch (opt)
							{
								case 1:
									{
										System.out.println("**** \033[93;5mCheck Balance\033[0m ****");
										System.out.print("Enter your Pin : ");
										int pin=sc.nextInt();
										if (upiPin==pin)
										{
											System.out.println("\033[96mGood Morning Mr./Mrs. "+name+"\n\033[0mYour Balance = \033[94m"+bal+" ₹\033[0m");
										}
										break;
									}
								case 2:
									{
										System.out.println("**** \033[34;5mDeposit Amount\033[0m ****");
										System.out.print("Enter Amount : ");
										double depAmt = sc.nextDouble();
										bal +=depAmt;
										System.out.println("\033[94m"+depAmt+" ₹ \033[0mAmount Diposited");
										break;
									}
								case 3:
									{
										System.out.println("**** \033[94;5mWithdrow Amount\033[0m ****");
										System.out.print("Enter your Pin : ");
										int pin=sc.nextInt();
										if (upiPin==pin)
										{
											System.out.print("Enter Amount : ");
											double wAmt=sc.nextDouble();
											if(wAmt<=bal-500)
											{
												System.out.println("\033[92mAmount Withdrow Successfully.\033[0m");
												// boolean permit = false;
												bal-=wAmt;
												int permit = 0;
												System.out.print("Do you want to check see your balance (0:No or 1:Yes) : ");
												permit=sc.nextInt();
												// permit=sc.nextBool().toLowerCase();
												if(permit==1)
													System.out.println(bal+" ₹");
											}else {
												System.out.println("\033[91;5mInsuffucient Funds\033[0m");
											}
											
										}else {
											System.out.println("\033[91;5mInvalid Pin.\033[0m");
										}
										break;
									}
								case 4:
									{
										System.out.println("**** \033[34;5mAccount Information\033[0m ****");
										System.out.print("Enter your Pin : ");
										int pin=sc.nextInt();
										if (upiPin==pin)
										{
											System.out.println("Name : \t"+name+"\nMobile : \t"+phoneNo+"\nAdhar No : \t"+adrNo+"\nAddress : \t"+addr+"\n");
										}
										else {
											System.out.println("\033[91;5mInvalid Pin.\033[0m");
										}
										break;
									}
								case 5:
									{
										System.out.println("\033[96;5mUser Sign-Out\033[0m\n");
										// System.exit(0);
										break accountSectio;
									}
								case 0:
									{
										System.exit(0);
									}
								default:
									System.out.println("\033[91;5mInvalid Option\033[0m");
									break;
							}
							// break;
						}
					// }else{
					// 	System.out.println("No Account here.");
					// }
				}
				case 0:
				{
					System.exit(0);
				}
				default:
					System.out.println("\033[91;5mInvalid Option.\033[0m");
					break;
			}	
		}
	}
}