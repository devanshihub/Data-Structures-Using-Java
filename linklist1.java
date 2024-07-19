package data_structures_java;
import java.util.*;
class node
{
    int data;
    node next;
    node(int a)
    {
        data=a;
        next=null;
    }
}

class link
{
     node start=null;

     void addlast(int x)
      {
         node ptr=new node(x);
         if (start==null)
         start=ptr;

         else
         {
          node t=start;
          while(t.next!=null)
          {
            t=t.next;
          }
          t.next=ptr;
         }
       }
      void addfirst(int x)
      {
        node ptr=new node(x);
         if (start==null)
         start=ptr;

         else
         {
            ptr.next=start;
            start=ptr;
         }
      }

      void disp()
      {
        if (start==null)
        System.out.println("\nlist is empty");

        else 
        {
            node t=start;
            System.out.println("\nlist is : ");
            while(t!=null)
            {
                System.out.print(t.data+" ");
                t=t.next;
            }
        }
      }

      void getfirst()
      {
        if (start==null)
        System.out.println("\nlist is empty");

        else 
        {
          System.out.println("\nfirst node data : "+start.data);
        }

      }
      void getlast()
      {
        if (start==null)
        System.out.println("\nlist is empty");

        else 
        {
          node t=start;
          while(t.next!=null)
          {
            t=t.next;
          }
          System.out.println("\nlast node data : "+t.data);
        }

      }
      int count()
      {
        int c=0;
        node t=start;
        while(t!=null)
        {
          c++;
          t=t.next;
        }
        return c;
      }

      int sum()
      {
        int s=0;
        node t=start;
        while(t!=null)
        {
          s+=t.data;
          t=t.next;
        }
        return s;
      }

      int big()
      {
        int bnum=Integer.MIN_VALUE;
        if (start==null)
        {
          System.out.println("\nlist is empty");
          bnum=0;
        }
        else
        {
         node t=start;
         while(t!=null)
         {
          if (bnum<t.data)
            bnum=t.data;

           t=t.next;
         }
        }
        return bnum;
      }
}

public class linklist1
{
   public static void main(String k[])
   {
    link ob1=new link();
  
   int ans=1;

   while(ans==1)
   {
    Scanner ob=new Scanner (System.in);
    int choice;
    System.out.println("\n----------COMMANDS----------");
    System.out.println("1. add value at last index-----void addlast(int x)");
    System.out.println("2. add value at last index-----void addfirst(int x)");
    System.out.println("3. display data of all nodes-----void disp()");
    System.out.println("4. to get first element-----void getfirst()");
    System.out.println("5. to get last element-----void getlast()");
    System.out.println("6. to count no of nodes-----int count()");
    System.out.println("7. to get sum of all nodes data-----int sum()");
    System.out.println("8. get biggest element-----int big()");
    System.out.println("9. remove first element-----void removefirst()");
    System.out.println("10. to remove last element-----void removelast()");
    System.out.println("-------------END------------\n");
    System.out.println("enter your choice : ");
    choice=ob.nextInt();

    if (choice==1)
    {
        int val;
        System.out.println("enter value");
        val=ob.nextInt();
        ob1.addlast(val);
    }
    else if (choice==2)
    {
        int val;
        System.out.println("enter value");
        val=ob.nextInt();
        ob1.addfirst(val);
    }
    else if (choice==3)
    {
        ob1.disp();
    }
    else if (choice==4)
    {
  
        System.out.println("\nfirst element is : ");
        ob1.getfirst();
    }
    else if (choice==5)
    {
  
        System.out.println("\nlast element is : ");
        ob1.getlast();
    }
    else if (choice==6)
    {
       int c=ob1.count();
        System.out.println("\nfno of nodes are : "+c);
        
    }
    else if (choice==7)
    {
        int s=ob1.sum();
        System.out.println("\nsum of  elements is : "+s);
    }
    else if (choice==8)
    {
       int b=ob1.big();
        System.out.print("\nbiggest element is : "+b);
  
    }
    
    System.out.print("\nwant to continue: true-1 / false-0");
    ans=ob.nextInt();
   }
   }
}