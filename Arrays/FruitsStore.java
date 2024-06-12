import java.util.*;
class FruitsStore
{
	String[] fruits;
	static Scanner sc=new Scanner(System.in);

	void storeFruits(String[] fruits)
	{
		System.out.print("\033[H\033{2J");
		this.fruits = fruits;
		System.out.println("Enter fruits");
		for(int i=0; i<fruits.length; i++)
		{
			System.out.print(i+1 +" : ");
			fruits[i]=sc.next();
		}
		System.out.print("\033[H\033{2J");
	}

	void displayFruits()
	{
		System.out.print("\033[H\033{2J");
		System.out.println(Arrays.toString(fruits));
	}

	void changeFruits()
	{
		System.out.print("\033[H\033{2J");
		String fruit;
		System.out.print("Enter the fruit name : ");
		fruit = sc.next();
		for(int i=0;i<fruits.length; i++)
		{
			if(fruit.equals(fruits[i]))
			{
				System.out.print("Fine, change with another fruit : ");
				fruit=sc.next();
				fruits[i]=fruit;
				break;
			}
			if(i==fruits.length-1)
				System.out.println(fruit+" not found.");
		}
	}

}