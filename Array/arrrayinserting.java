package data_structures_java_2;
import java.util.*;
class arr
{
   static void insert_at_beg(int a[],int item)
   {
    int i;

    for(i=a.length-1;i>0;i--)
    {
        a[i]=a[i-1];
    }
    a[0]=item;
   }

   static void insert_at_last(int a[],int item)
   {
    a[a.length-1]=item;
   }

   static void insert_at_pos(int a[],int pos,int item)
   {
    int i;

    for(i=a.length-1;i>pos;i--)
    {
        a[i]=a[i-1];
    }
    a[pos]=item;
   }
}

class arraysearching
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        System.out.print("\nenter size : ");
        int n=ob.nextInt();
        int a[]=new int[n+1];
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
            System.out.print("\n----------------ANY ONE OPERATION CAN BE PERFORMED ONLY---------------------");
            System.out.print("\n1.insert at begin-----static void insert_at_beg(int a[],int item)"); 
            System.out.print("\n2.insert at last-----static void insert_at_last(int a[],int item)");
            System.out.print("\n3.insert at a position-----  static void insert_at_pos(int a[],int pos,int item)");
            System.out.print("\n--------------------------------------------------------------------");
            System.out.print("\nenter choice : ");
            choice=ob.nextInt();

            if (choice==1)
            {
                System.out.print("\nenter element  : ");
                int t=ob.nextInt();
                arr.insert_at_beg(a,t);
        
            }
            else if (choice==2)
            {
                System.out.print("\nenter element  : ");
                int t=ob.nextInt();
                arr.insert_at_last(a,t);
            }
            else if (choice==3)
            {
                System.out.print("\nenter element and position : ");
                int t=ob.nextInt();
                int p=ob.nextInt();
                arr.insert_at_pos(a,p,t);
            }

            condition=0;
        }
        System.out.print("\nyour modifies array is  : ");
        for(int b:a)
         System.out.print(b+" ");
        
    }
}
