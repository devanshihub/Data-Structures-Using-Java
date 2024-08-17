package data_structures_java_2;
import java.util.*;

public class arraybasics1 
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
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.print("\nsum = "+sum);
    }
}
