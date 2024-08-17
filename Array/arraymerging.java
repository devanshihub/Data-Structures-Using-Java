package data_structures_java_2;
import java.util.Scanner;

class arr
{
   static void merge(int a[],int b[],int c[])
   {
    int i=0,j=0,r=0;
    while(i<a.length && j<b.length)
    {
      if(a[i]<=b[j])
      c[r++]=a[i++];
      else
      c[r++]=b[j++];
    }

    while(i<a.length)
    c[r++]=a[i++];

    while(j<b.length)
    c[r++]=b[j++];
   }
}
class arraymerging
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);


        System.out.print("\nenter size : ");
        int n1=ob.nextInt();
        int a1[]=new int[n1];
        System.out.print("\nenter values : ");
        for(int i=0;i<n1;i++)
        {
            a1[i]=ob.nextInt();
        }

        System.out.print("\nenter size : ");
        int n2=ob.nextInt();
        int a2[]=new int[n2];
        System.out.print("\nenter values : ");
        for(int i=0;i<n2;i++)
        {
            a2[i]=ob.nextInt();
        }

        int a3[]=new int[a1.length+a2.length];

        arr.merge(a1,a2,a3);

        System.out.print("\nyour new array is ; ");
        for(int b:a3)
        System.out.print(b+" ");

    }
}