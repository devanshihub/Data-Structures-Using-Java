package recursion;
import java.util.*;
class calc
{
    static int fact(int a)
    {
        if (a==0) 
        return 1;
        else
        return a*fact(a-1);
    }
}
public class factorial 
{
    public static void main(String k[])
    {
        int r=calc.fact(5);
        System.out.print(r);
    }
}
