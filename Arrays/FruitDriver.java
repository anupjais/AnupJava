import java.util.Scanner;
class FruitDriver
{
	public static void main(String[] args)
	{
		System.out.println("\033[H\033[2J");
		Scanner sc = new Scanner(System.in);
		FruitsStore fruitStore1 = new FruitsStore();
		boolean flag = true;
		while(flag)
		{
			System.out.println("1. Strore Fruits\n2. Display Fruits\n3. Change Fruit\n0. EXIT");
			System.out.print("\nEnter the option : ");
			int opt = sc.nextInt();

			switch(opt)
			{
			case 1:
				System.out.print("Enter the size of the array : ");
				int size=sc.nextInt();
				String[] fruits = new String[size];
				fruitStore1.storeFruits(fruits);
				break;
			case 2:
				if(fruitStore1.fruits!=null)
					fruitStore1.displayFruits();
				else
				{
					System.out.println("\033[H\033[2J");
					System.out.println("\nPlease add fruits first \n");
				}
				break;
			case 3:
				if(fruitStore1.fruits!=null)
				{
					fruitStore1.changeFruits();
					System.out.print("\nWants to display the updated fruits no:0 or yes:1 : \n");
					int opt2 = sc.nextInt();
					switch(opt2)
					{
						case 0:
							break;
						case 1:
							fruitStore1.displayFruits();
						default:

							System.out.println("\nIncorrect input\n");
					}
				}
				else
				{
					System.out.println("\033[H\033[2J");
					System.out.println("\nPlease add fruits first to make updated \n");
				}
				break;
			case 0:
				flag=false;
				// System.exit(0);

			default:
				System.out.println("\033[H\033[2J");
				System.out.println("Incorrect input\n");
			}
		}
		// String[] fruits ={"Apple","Banana","Orange","Carrot","Berry"};

		// fruitStore1.storeFruits(fruits);
		// fruitStore1.displayFruits();
		// fruitStore1.changeFruits();
		// fruitStore1.displayFruits();

	}
}