class Pattern9
{
	public static void main(String[] args)
	{
		// int count = 1;
		// for(int i=1; i<6; i++)
		// {
		// 	int dup = count;
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print(dup+" ");
		// 		dup += 2;
		// 	}
		// 	System.out.println();
		// 	count++;
		// }

		int rows = 5; // Number of rows in the triangular pattern
        int count = 1; // Start value of the sequence
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            int currentValue = count;
            
            // Print the elements of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(currentValue + " ");
                currentValue += 2;
            }
            
            System.out.println(); // Move to the next line after printing each row
            count += 1; // Increment the start value for the next row
        }
	}
}