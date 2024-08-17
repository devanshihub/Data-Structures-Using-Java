package data_structures_java_2;
import java.util.*;
class arr
{
   static void delete_at_beg(int a[])
   {
    int i;

    for(i=0;i<a.length-1;i++)
    {
        a[i]=a[i+1];
    }
    a[a.length-1]=-99;
   }

   static void delete_at_pos(int a[],int pos)
   {
    int i;

    for(i=pos;i<a.length-1;i++)
    {
        a[i]=a[i+1];
    }
    a[a.length-1]=-99;
   }
   static int position_return(int a[],int item)
   {
    int pos=-1;

    for(int i=0;i<a.length;i++)
    {
        if(a[i]==item)
        {
            pos=i;
            break;
        }
        
    }
    return pos;
   }
}

class arraydeletion
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
            System.out.print("\n----------------ANY ONE OPERATION CAN BE PERFORMED ONLY---------------------");
            System.out.print("\n1.delete at begin-----static void delete_at_beg(int a[])"); 
            System.out.print("\n2.delete at position-----static void delete_at_pos(int a[],int pos)");
            System.out.print("\n2.delete by value ");
            System.out.print("\n--------------------------------------------------------------------");
            System.out.print("\nenter choice : ");
            choice=ob.nextInt();

            if (choice==1)
            {
                arr.delete_at_beg(a);
            }
            else if (choice==2)
            {
                System.out.print("\nenter position  : ");
                int p=ob.nextInt();
                arr.delete_at_pos(a,p);
            }
            else if (choice==3)   //one error
            {
                System.out.print("\nenter element  : ");
                int x=ob.nextInt();
                int p=arr.position_return(a,x);
                if(p==-1)
                System.out.print("\nelement not found ");
                else
                arr.delete_at_pos(a,p);
            }

            condition=0;
        }
        System.out.print("\nyour modified array is  : ");
        for(int i=0;i<a.length-1;i++)
        System.out.print(a[i]+" ");
        
    }
}