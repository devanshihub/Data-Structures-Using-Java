package data_structures_java_2;
import java.util.*;
class arr
{
   static boolean check(int a[])
   {
    boolean b=true;
    for (int i=1;i<a.length;i++)
    {
        if(a[i]<a[i-1])
        {
         b=false;
         break;
        }
    }
    return b;
   }
}
public class arraybasics5
{
    public static void main(String k[])
    {
        int a[]={10,7,6,8,12};
        System.out.println(arr.check(a));

        int b[]={3,10,12,20,25,30};
        System.out.println(arr.check(b));
    }
}