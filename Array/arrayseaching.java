package data_structures_java_2;
import java.util.*;
class arr
{
   static int linear_search(int a[],int item)
   {
    int p=-1;
    int i;

    for(i=0;i<a.length;i++)
    {
        if(a[i]==item)
        {
            p=i;
            break;
        }
    }
    return p;
   }

   static int binary_search(int a[],int item)
   {
    int p=-1,b=0,mid;
    int l=a.length-1;

    while(b<=l)
    {
        mid=(b+l)/2;
        if(item==a[mid])
        {
            p=mid;
            break;
        }
        else if (item>a[mid])
        b=mid+1;
        else
        l=mid-1;
    }
    return p;
   }
}

class arraysearching
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

        int condition=1;
        while(condition==1)
        {
            int choice;
            System.out.print("\n------------------------------COMMANDS-----------------------------");
            System.out.print("\n1.linear searching-----static int linear_search(int a[],int item)"); 
            System.out.print("\n2.binary searching-----static int binary_search(int a[],int item)");
            System.out.print("\nbinary searching-----works only on sorted arrays");
            System.out.print("\n--------------------------------------------------------------------");
            System.out.print("\nenter choice : ");
            choice=ob.nextInt();

            if (choice==1)
            {
                System.out.print("\nenter value to be searched : ");
                int t=ob.nextInt();
                int r=arr.linear_search(a,t);
        
                if (r==-1)
                System.out.print("\nelement not found ");
                else
                System.out.print("\nelement foun at index : "+r);
            }
            else if (choice==2)
            {
                System.out.print("\nenter value to be searched : ");
                int t=ob.nextInt();
                int r=arr.binary_search(a,t);
        
                if (r==-1)
                System.out.print("\nelement not found ");
                else
                System.out.print("\nelement foun at index : "+r);
            }

            System.out.print("\nwant to continue : 0/false  1/true");
            condition=ob.nextInt();
        }
        
    }
}
