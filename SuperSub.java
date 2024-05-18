class SuperClass
{
    static int var = 10;
}

class SubClass extends SuperClass
{
    // SubClass inherits staticVar from SuperClass
}

class SuperSub
{
    public static void main(String[] args)
    {
        SubClass sub = new SubClass();
        System.out.println("SuperClass.staticVar: " + sub.var); // Output: 10
        System.out.println("SubClass.staticVar: " + sub.var); // Output: 10
        sub.var = 20;
        
        System.out.println("SuperClass.staticVar: " + sub.var); // Output: 20
        System.out.println("SubClass.staticVar: " + sub.var); // Output: 20
    }
}
