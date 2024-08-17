package recursion;
import java.util.*;
class a
{
    static void disp(int a)
    {
        if (a>0) 
        {
            disp(a-1);
            System.out.println(a);
            
        }
     
    }
}
public class nontaildirectrecursion 
{
    public static void main(String k[])
    {
       a.disp(5);
    }
}
