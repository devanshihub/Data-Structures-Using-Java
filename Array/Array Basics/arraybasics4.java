package data_structures_java_2;
import java.util.*;
class arr
{
   static int find(int a[])
   {
    int m=a.length+1;
    int sum=(m*(m+1))/2;

    for (int b:a)
    sum-=b;

    return sum;
   }
}
public class arraybasics4
{
    public static void main(String k[])
    {
        int a[]={1,3,6,4,2};
        int r=arr.find(a);
        System.out.println(r);
    }
}
