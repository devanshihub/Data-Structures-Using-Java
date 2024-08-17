package data_structures_java_2;
import java.util.*;
class arr
{
   static int sum(int a[])
   {
    int sum=0;
    for (int b:a)
    sum+=b;

    return sum;
   }
}
public class arraybasics2 
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        System.out.print("\nenter size : ");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.print("\nenter values : ");
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        
        int r=arr.sum(a);
        System.out.print("\nsum : "+r);
    }
}
