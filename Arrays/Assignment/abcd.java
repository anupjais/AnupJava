import java.io.*;
 

class abcd {

    

    public static void main(String[] args)

    {

        int numRows = 4, i, j;

        abcd g = new abcd();

        for (i = 0; i <= numRows; i++) 
        {

            for (j = 0; j <= numRows - i; j++) 
            {
 

                // for left spacing

                System.out.print(" ");

            }

            for (j = 0; j <= i; j++) {
 

                // nCr formula

                System.out.print(

                    " "

                    + g.factorial(i)

                          / (g.factorial(i - j)

                             * g.factorial(j)));

            }
 

            // for newline

            System.out.println();

        }
        

    }
    public int factorial(int i)

        {

            if (i == 0)

               return 1;

                 return i * factorial(i - 1);

        }
}