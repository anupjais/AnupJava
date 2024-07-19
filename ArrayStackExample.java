// package MyStack;
import java.util.Arrays;

public class ArrayStackExample
{
    public static void main(String[] args)
    {
        UserArrayStack stack = new UserArrayStack();
        System.out.println("Is stack empty: " + stack.empty());
        for (int i = 5; i < 55; i += 5)
        {
            stack.push(i);
        }
        System.out.println("Elements: " + stack);
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Elements: " + stack);
        System.out.println("Peek element: " + stack.peek());
        System.out.println("Elements: " + stack);
        System.out.println("Is stack empty: " + stack.empty());
    }
}

class UserArrayStack
{
    private Object[] list;
    private int len;
    UserArrayStack()
    {
        list = new Object[10];
        len = -1;
    }
    UserArrayStack(int cap)
    {
        list = new Object[cap];
        len = -1;
    }
    public Object push(Object e)
    {
        if (isFull())
        {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[++len] = e;
        return e;
    }
    public Object pop()
    {
        if (len == -1)
        {
            return null; 
        }
        Object obj = list[len];
        list[len--] = null;
        return obj;
    }
    public Object peek()
    {
        if (len == -1)
        {
            return null; 
        }
        return list[len];
    }
    public boolean empty()
    {
        return len == -1;
    }
    public String toString()
    {
        return Arrays.toString(Arrays.copyOfRange(list, 0, len + 1));
    }
    private boolean isFull()
    {
        return len == list.length - 1;
    }
}