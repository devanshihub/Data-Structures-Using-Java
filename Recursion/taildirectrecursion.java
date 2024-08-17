package recursion;
import java.util.*;
class a
{
    static void disp(int a)
    {
        if (a>0) 
        {
            System.out.println(a);
            disp(a-1);
        }
     
    }
}
public class taildirectrecursion 
{
    public static void main(String k[])
    {
       a.disp(5);
    }
}
