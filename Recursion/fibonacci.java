package recursion;
import java.util.*;
class calc
{
    static int fib(int a)
    {
        if (a<=1) 
        return a;
        else
        return fib(a-1)+fib(a-2);
    }
}
public class fibonacci 
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        System.out.print("\nenter terms");
        int n=ob.nextInt();

        System.out.print("\n terms are : ");
        for(int i=0;i<n;i++)
        System.out.print(calc.fib(i)+" ");
    }
}
