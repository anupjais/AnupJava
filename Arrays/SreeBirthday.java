import java.util.*;
class ShreeBirthday
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        clrCenter();
        centerScr();

        System.out.print("\033[36mWish The Marriage Anniversary To : \033[0;1m");
        // System.out.print("Name which want to wish : ");
        String name = sc.nextLine();
        System.out.println("\033[H\033[2J");
        clrCenter();
        centerScr();
        System.out.print("\033[0;1mHappy Marriage Anniversary - \033[0m");
        String[] spcl ={"\033[0m","\033[1m","\033[0;5m","\033[0;91m","\033[92m","\033[9m","\033[94m","\033[95m","\033[96m","\033[3m"};
        // char[] spcl ={'\033[0m','\033[1m','\033[5m','\033[0m','\033[91m','\033[92m','\033[9m','\033[94m','\033[95m','\033[95m'};
        // for(int c=0; c<spcl.length; c++)
            // System.out.print(spcl[c]);
        int c=0;
        for(int i=0; i<17; i++)
        // for(int i=0; i<7; i++)
        {
            System.out.print(spcl[c++ %10]);
            if(i>0)
            {
                // centerScr();
                clrChars(name);
                message(name);
                System.out.print(spcl[c++ %10]);
                clrChars(name);
                message(name);
                continue;
            }
            // centerScr();
            message(name);
            System.out.print(spcl[c++ %10]);
            clrChars(name);
            message(name);
        }
        System.out.println();
        
    }
    public static void centerScr()
    {
        System.out.print("\t\t");
        // System.out.print("\t\t\t\t\t");
        return ;
    }
    public static void clrCenter()
    {
        for(int i=1; i<10; i++)
            System.out.println();
    }
    public static void clrChars(String name)
    {
        for(int i=0; i<name.length(); i++)
        {
            try
            {
                Thread.sleep(10);
                System.out.print("\b \b");
                // System.out.print("\b  \b\b\b \b");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        
    }
    static void message(String name)
    {
        
        for(int i=0; i<name.length(); i++)
        {
            try
            {
                Thread.sleep(100);
                System.out.print(name.charAt(i));
                // System.out.print(name.charAt(i)+" ");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

// Anup Nath Jaiswal 