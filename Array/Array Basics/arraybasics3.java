package data_structures_java_2;
import java.util.*;
class arr
{
   static void show(int a[])
   {
    a[0]=90;
    a[1]=400;
   }
}
public class arraybasics3 
{
    public static void main(String k[])
    {
        int a[]={10,20};
        arr.show(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
