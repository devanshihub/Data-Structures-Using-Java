package data_structures_java;
import java.util.*;
class node
{
    int data;
    node next;
    node(int x)
    {
        data=x;
        next=null;
    }
}
class clinklist
{
    node start;
    node last;

    void disp()
    {
        if (start==null)
        System.out.print("\nlist is empty");
        else
        {
          node t=start;
          System.out.print("\nlist is :");
          do
          {
            System.out.print(t.data+" ");
            t=t.next;
          }while(t!=start);
        }
    }

    void add_first(int x)
    {
        node ptr=new node(x);
        if(start==null)
        {
            start=ptr;
            last=ptr;
            last.next=start;
        }
        else
        {
           ptr.next=start;
           last.next=ptr;
           start=ptr;
        }
    }

    void add_last(int x)
    {
        node ptr=new node(x);
        if(start==null)
        {
            start=ptr;
            last=ptr;
            last.next=start;
        }
        else
        {
            last.next=ptr;
            last=ptr;
            last.next=start;
        }
    }

    int get_first()
    {
      int val=-1;
      if(start!=null)
      val=start.data;

      return val;
    }

    int get_last()
    {
      int val=-1;
      if(start!=null)
      val=last.data;

      return val;
    }

    

    int count()
    {
        int c=0;
        if (start==null)
          c=0;
          else
          {
            node t=start;
             do
             {
                c++;
                t=t.next;
             }while(t!=start);
          }
          return c;
    }

    int sum()
    {
        int s=0;
        if (start==null)
          s=0;
        else
          {
            node t=start;
             do
             {
                s=s+t.data;
                t=t.next;
             }while(t!=start);
          }
          return s;
    }

    int big_num()
      {
        int bnum=Integer.MIN_VALUE;
        if (start!=null)
        {
          node t=start;
             do
             {
                if (bnum<t.data)
                bnum=t.data;
                t=t.next;
             }while(t!=start);
        }
        return bnum;
    }

    void remove_first()
    {
        if (start==null)
        System.out.print("\nlist is empty");
        else if (start==last)
        {
          start=null;
          last=null;
        }
        else
        {
            start=start.next;
            last.next=start;
        }
    }

    void remove_last()
    {
        if (start==null)
        System.out.print("\nlist is empty");
        else if (start==last)
        {
          start=null;
          last=null;
        }
        else
        {
           node t=start;
           while(t.next!=last)
           t=t.next;

           t.next=start;
           last=t;
        }
    }

    int search(int item)
      {
        int p=-1;
        node t=start;
        int i=0;
       if(start!=null)
       {
        do
        {
            if (t.data==item)
            {
              p=i;
              break;
            }
            i++;
            t=t.next;
        }
        while(t!=start);
      }
      return p;
    }

      void add_at_index(int p,int x)
      {
        if(p<0 || p>count())
        System.out.println("\ncan not add at given index");

        else if (p==0)
        add_first(x);

        else if(p==count())
        add_last(x);

        else
        {
          node ptr=new node(x);
          node t=start;
          int i;
          for(i=1;i<p;i++)
          {
            t=t.next;
          }
          ptr.next=t.next;
          t.next=ptr;
        }
      }

      int get_at_index(int p)
      {
        int value=-1;
        if (p>=0 && p<count())
        {
          int i=0;
          node t=start;
          for(i=0;i<p;i++)
          {
            t=t.next;
          }
          value=t.data;
          
        }
        return value;

      }
      void remove_at_index(int p)
      {
        if(p<0 || p>count()-1)
        System.out.println("\ncan not remove at given index");

        else if(p==0)
        remove_first();

        else if (p==count()-1)
        remove_last();

        else
        {
          int i=0;
          node t=start;
          for(i=0;i<p-1;i++)
          {
            t=t.next;
          }
          
          t.next=t.next.next;
        }
      }
}

public class circularlinklist
{
   public static void main(String k[])
 {
  Scanner ob=new Scanner (System.in);
    clinklist ob1=new clinklist();
    int condition=1;
    while(condition==1)
    {
      System.out.print("\n--------------------COMMANDS--------------------");
      System.out.print("\n1. display elements in forward way-----void disp()");        // print
      System.out.print("\n2. add node at first-----void add_first(int x)");              //parameter int 
      System.out.print("\n3. add node at last-----void add_last(int x)");                //parameter int 
      System.out.print("\n4. to add a node at a index-----void addatindex(int p,int x)");// parameter int ,parameter int , print
      System.out.print("\n5. to count no of nodes-----int count()");                     // return int
      System.out.print("\n6. to get sum of all nodes data-----int sum()");               // return int
      System.out.print("\n7. get biggest element-----int big()");                        // return int
      System.out.print("\n8. remove first element-----void removefirst()");              // print
      System.out.print("\n9. to remove last element-----void removelast()");            // print
      System.out.print("\n10. to get index of an element-----int search(int item)");     //parameter int ,return int 
      System.out.print("\n11. to get first element-----int getfirst()");                 // return int 
      System.out.print("\n12. to get last element-----int getlast()");                   // return int 
      System.out.print("\n13. get element at a index -----int getatindex(int p)");       //parameter int ,return int
      System.out.print("\n14. remove at index-----void removeatindex(int p)");           //parameter int ,print
      System.out.print("\n-----------------------END----------------------");
      System.out.print("\nenter your choice : ");
      int choice=ob.nextInt();

    if (choice==1)
    {
        ob1.disp();
    }
    else if (choice==2)
    {
        System.out.print("\nenter value :");
      int val=ob.nextInt();
       ob1.add_first(val);
    }
    else if (choice==3)
    {
        System.out.print("\nenter value to be added : ");
        int val=ob.nextInt();
        ob1.add_last(val);
    }

    else if (choice==4)
    {
        int val,pos;
        System.out.print("\nenter element and index : ");
        val=ob.nextInt();
        pos=ob.nextInt();
        ob1.add_at_index(pos,val);
        // parameter int , parameter int 
        // print
    }
    else if (choice==5)
    {
        int c=ob1.count();
        System.out.print("\nno of nodes are : "+c);
        // return int 
        
    }
    else if (choice==6)
    {
        int s=ob1.sum();
        System.out.print("\nsum of  elements is : "+s);
       // return int 
    }
    else if (choice==7)
    {
       int b=ob1.big_num();
       if (b==Integer.MIN_VALUE)
        System.out.print("\nlist is empty");
       else
        System.out.print("\nbiggest element is : "+b);
        //return int 
    }
    else if (choice==8)
    {
       ob1.remove_first();
       // print
        
    }
    else if (choice==9)
    {
       ob1.remove_last();
       //print 
        
    }
    else if (choice==10)
    {
      System.out.print("\nenter element to be searched : ");
      int val=ob.nextInt();
       int p=ob1.search(val);

       if (p==-1)
       System.out.print("\nelement not found");
       else
       System.out.print("\nelement found at index "+p);
       // return int 
       // parameter int 
        
    }
    else if (choice==11)
    {
       
    int val=ob1.get_first();
    if (val==-1)
    System.out.print("\nlist is empty");
    else
    System.out.print("\nvalue of first node is :"+val);
        
    }
    else if (choice==12)
    {
        int val=ob1.get_last();
        if (val==-1)
        System.out.print("\nlist is empty");
        else
        System.out.print("\nvalue of last node is :"+val);
    }
    else if (choice==13)
    {

      int val,pos;
      System.out.print("\nenter index : ");
      pos=ob.nextInt();
     val=ob1.get_at_index(pos);
      if (val==-1)
       System.out.print("\nindex not found ");
       else
       System.out.print("\nindex found value is : "+val);
       //return int 
       //parameter int 
        
    }
    else if (choice==14)
    {

      int pos;
      System.out.print("\nenter index : ");
      pos=ob.nextInt();
      ob1.remove_at_index(pos);
      // parameter int
        
    }
    System.out.print("\nwant to continue: true-1 / false-0 : ");
    condition=ob.nextInt();
   }
  }
}