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
		System.out.print("\033[H\033[2J");
		outerloop:
		for (; ; )
		{
			// System.out.println("\033[H\033[2J \t*******************************************\n\t\033[93;5m*******\033[0m\t\033[96mWelcome To Cheeta Fund Bank\033[0m \033[93;5m*******\033[0m\n\t*******************************************\n");
			// System.out.print("\033[H\033[2J");
			// System.out.flush();
			System.out.println("\t*******************************************\n\t\033[93;5m*******\033[0m\t\033[96mWelcome To Cheeta Fund Bank\033[0m \033[93;5m*******\033[0m\n\t*******************************************");
			System.out.print("\n\t\t1. Open Account\n\t\t2. Existing User\n\t\t0. EXIT");
			System.out.print("\n\n\t\033[95mEnter you preference : \033[0m");
			int option = sc.nextInt();

			switch (option)
			{
				case 1:
					{
						sc.nextLine();
						System.out.print("\033[H\033[2J");
						System.out.print("\t*******************************\n\t******* \033[34;5mAccount Section\033[0m *******\n\t*******************************\n");
						System.out.print("Your Name : ");
						name=sc.nextLine();
						System.out.print("Address : ");
						addr=sc.nextLine();
						System.out.print("Mobile Number : ");
						phoneNo=sc.nextLong();
						System.out.print("Adhar Number : ");
						adrNo=sc.nextLong();
						System.out.print("Deposit Amount : ");
						bal=sc.nextDouble();
						boolean pin=true;
						pinSection:
						while(pin)
						{
							System.out.print("\033[36mCreate your Pin : \033[0m");
							upiPin=sc.nextInt();
							System.out.print("\033[36;1mConform Pin : \033[0m");
							int cUpiPin=sc.nextInt();
							if (upiPin!=cUpiPin)
							{
								System.out.print("\033[H\033[2J");
								System.out.println("\n\t\t\033[91;5mIncorrect Pin\033[0m\n");
								continue pinSection;
							}
							pin=false;
						}
						System.out.print("\033[H\033[2J");
						System.out.println("\n\t\033[92mAccount Open Successfully.\033[0m\n");
						break;
					}
				case 2:
				{
					if(name!=null)
					{
						System.out.print("\033[H\033[2J");
						accountSectio:
						for(;;)
						{
							System.out.print("\n\t********************************\n\t******* \033[34;5mAccount Features\033[0m *******\n\t********************************\n");
							System.out.println("\t\t1. Check Balance\n\t\t2. Deposit Amount\n\t\t3. Withdraw Amount\n\t\t4. Account Information\n\t\t5. Log-Out\n\t\t0. EXIT");
							System.out.print("\n\t\t\033[95mEnter you preference : \033[0m");
							int opt=sc.nextInt();
							switch (opt)
							{
								case 1:
									{
										System.out.print("\033[H\033[2J");
										System.out.println("\n\t\t**** \033[93;5mCheck Balance\033[0m ****");
										System.out.print("\n\t\tEnter your Pin : ");
										int pin=sc.nextInt();
										if (upiPin==pin)
										{
											System.out.print("\033[H\033[2J");
											System.out.println("\n\t\033[96mGood Morning Mr./Mrs. "+name+"\n\t\033[0mYour Balance = \033[94m"+bal+" \033[1m₹\033[0m\n");
										}else {
											System.out.print("\033[H\033[2J");
											System.out.println("\n\t\033[91;5mInvalid Pin.\033[0m\n");
										}
										break;
									}
								case 2:
									{
										System.out.print("\033[H\033[2J\n");
										System.out.println("\t\t**** \033[34;5mDeposit Amount\033[0m ****");
										System.out.print("\n\t\tEnter Amount : ");
										double depAmt = sc.nextDouble();
										bal +=depAmt;
										System.out.print("\033[H\033[2J");
										System.out.println("\n\t\t\033[94m"+depAmt+" \033[1m₹ \033[0mAmount Deposited\n");
										break;
									}
								case 3:
									{
										System.out.print("\033[H\033[2J");
										System.out.println("\n\t\t**** \033[94;5mWithdraw Amount\033[0m ****");
										System.out.print("\n\t\tEnter your Pin : ");
										int pin=sc.nextInt();
										if (upiPin==pin)
										{
											System.out.print("\033[H\033[2J");
											System.out.print("\n\t\t\033[94mEnter Amount : \033[0m");
											double wAmt=sc.nextDouble();
											if(wAmt<=bal-500)
											{
												System.out.println("\n\t\033[92mAmount Withdrowal Successfully.\033[0m");
												// boolean permit = false;
												bal-=wAmt;
												int permit = 0;
												System.out.print("\n\tDo you want to check balance \033[91m(0:No \033[0mor \033[92m1:Yes) : \033[0m");
												permit=sc.nextInt();
												// permit=sc.nextBool().toLowerCase();
												if(permit==1)
												{
													System.out.print("\033[H\033[2J");
													System.out.println("\n\tCurent Balance = "+bal+" \033[1m₹\033[0m\n");
												}else
													System.out.print("\033[H\033[2J");
											}else {
												System.out.print("\033[H\033[2J");
												System.out.println("\n\t\033[91;1;5mInsuffucient Funds\033[0m\n");
											}
											
										}else {
											System.out.print("\033[H\033[2J");
											System.out.println("\n\t\033[91;1;5mInvalid Pin.\033[0m\n");
										}
										break;
									}
								case 4:
									{
										System.out.print("\033[H\033[2J");
										System.out.println("\n\t\t**** \033[34;5mAccount Information\033[0m ****");
										System.out.print("\n\tEnter your Pin : ");
										int pin=sc.nextInt();
										if (upiPin==pin)
										{
											System.out.print("\033[H\033[2J");
											System.out.println("\nName \t: "+name+"\nMobile \t: "+phoneNo+"\nAdhar No : \t"+adrNo+"\nAddress : \t"+addr+"\n\n");
										}
										else {
											System.out.print("\033[H\033[2J");
											System.out.println("\n\t\t\033[91;5mInvalid Pin.\033[0m\n");
										}
										break;
									}
								case 5:
									{
										System.out.print("\033[H\033[2J");
										System.out.print("\n\t\033[91;1mDo you want to Sign-Out your Account?\033[0m\n");
										System.out.print("\tEnter your preference (0:NO or 1:YES) : ");
										int pref = sc.nextInt();
										if(pref==1)
										{
											System.out.print("\033[H\033[2J");
											System.out.println("\n\t\t\033[96;5mUser Sign-Out\033[0m\n");
											System.exit(0);
											// break accountSectio;
										}
										else
										{
											System.out.print("\033[H\033[2J\n");
											continue accountSectio;
										}
									}
								case 0:
									{
										System.out.print("\033[H\033[2J");
										System.out.println("\n\tApplication Terminated\n");
										System.exit(0);
									}
								default:
									System.out.print("\033[H\033[2J");
									System.out.println("\n\t\t\033[91;5mInvalid Option\033[0m\n");
									break;
							}
							// break;
						}
					}else{
						System.out.print("\033[H\033[2J");
						System.out.println("\n\t\033[1;91mEmpty Accounts.\033[0m\n\n");
						continue outerloop;
					}
				}
				case 0:
				{
					System.out.print("\033[H\033[2J");
					// System.out.println("\t\t\033[33mThank you for using our servises\n\t\t\033[1;92mPlease Visit Again\033[0m 🙏 ..");
					System.out.println("\n\tApplication Terminated\n");
					System.exit(0);
				}
				default:
					System.out.print("\033[H\033[2J");
					System.out.println("\n\t\t\033[91;5mInvalid Option.\033[0m \n");
					break;
			}	
		}
	}
}