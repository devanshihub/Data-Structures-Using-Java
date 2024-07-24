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

class singlylinklist
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
        System.out.print("\nlist is empty");

        else 
        {
            System.out.print("\nlist is : ");
            node t=start;
            while(t!=null)
            {
                System.out.print(t.data+" --> ");
                t=t.next;
            }
            System.out.print("NULL");
        }
      }

      int  getfirst()
      {
        int val=-1;
        if (start!=null)
        val=start.data;

        return val;

      }
      int getlast()
      {
        int val=-1;
        if (start!=null)
        {
          node t=start;
          while(t.next!=null)
            t=t.next;
          val=t.data;
        }
        return val;
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
        if (start!=null)
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
      void removefirst()
      {
        if (start==null)
        System.out.print("\nlist is empty");
        else
        {
          start=start.next;
        }
      }
      void removelast()
      {
        if (start==null)
        System.out.print("\nlist is empty");
        else if(start.next==null)
        {
          start=null;
        }
        else
        {
          node t=start;
          node r=start.next;

          while(r.next!=null)
          {
            t=r;
            r=r.next;
          }
          t.next=null;
          r=null;
        }
      }
      int search(int item)
      {
        int p=-1;
        node t=start;
        int i=0;
       
        while(t!=null)
        {
          if (t.data==item)
          {
            p=i;
            break;
          }
          i++;
          t=t.next;
        }
        return p;
      }
      void reverse()
      {
        node t=start;
        node previous=null;
        node current=null;

        while(t!=null)
        {
          current=t.next;
          t.next=previous;
          previous=t;
          t=current;
        }
        start=previous;
      }
      void addatindex(int p,int x)
      {
        if(p<0 || p>count())
        System.out.println("\ncan not add at given index");

        else if (p==0)
        addfirst(x);

        else if(p==count())
        addlast(x);

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

      int getatindex(int p)
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
      void removeatindex(int p)
      {
        if(p<0 || p>count()-1)
        System.out.println("\ncan not remove at given index");

        else if(p==0)
        removefirst();

        else if (p==count()-1)
        removelast();

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

public class linklist1
{
   public static void main(String k[])
 {
  Scanner ob=new Scanner (System.in);
    singlylinklist ob1=new singlylinklist();
    int condition=1;
    while(condition==1)
    {
      System.out.print("\n--------------------COMMANDS--------------------");
      System.out.print("\n1. add value at last index-----void addlast(int x)");
      System.out.print("\n2. add value at first index-----void addfirst(int x)");
      System.out.print("\n3. display data of all nodes-----void disp()");
      System.out.print("\n4. to get first element-----void getfirst()");
      System.out.print("\n5. to get last element-----void getlast()");
      System.out.print("\n6. to count no of nodes-----int count()");
      System.out.print("\n7. to get sum of all nodes data-----int sum()");
      System.out.print("\n8. get biggest element-----int big()");
      System.out.print("\n9. remove first element-----void removefirst()");
      System.out.print("\n10. to remove last element-----void removelast()");
      System.out.print("\n11. to get index of an element-----int search(int item)");
      System.out.print("\n12. reverse a linklist-----void reverse()");
      System.out.print("\n13. add element at a index -----void addatindex(int p,int x)");
      System.out.print("\n14. get element at a index -----int getatindex(int p)");
      System.out.print("\n15. remove at index-----void removeatindex(int p)");
      System.out.print("\n-----------------------END----------------------");
      System.out.print("\nenter your choice : ");
      int choice=ob.nextInt();

    if (choice==1)
    {
        System.out.print("\nenter value to be added : ");
        int val=ob.nextInt();
        ob1.addlast(val);
        // parameter int 
    }
    else if (choice==2)
    {
        System.out.print("\nenter value :");
        int val=ob.nextInt();
        ob1.addfirst(val);
        // parameter int 
    }
    else if (choice==3)
    {
        ob1.disp();
        // print
    }
    else if (choice==4)
    {
      int val=ob1.getfirst();
      if (val==-1)
      System.out.print("\nlist is empty");
      else
      System.out.print("\nvalue of first node is :"+val);
       //return int 
    }
    else if (choice==5)
    {
      int val=ob1.getlast();
      if (val==-1)
      System.out.print("\nlist is empty");
      else
      System.out.print("\nvalue of last node is :"+val);
       //return int 
    }
    else if (choice==6)
    {
        int c=ob1.count();
        System.out.print("\nno of nodes are : "+c);
        // return int 
        
    }
    else if (choice==7)
    {
        int s=ob1.sum();
        System.out.print("\nsum of  elements is : "+s);
       // return int 
    }
    else if (choice==8)
    {
       int b=ob1.big();
       if (b==Integer.MIN_VALUE)
        System.out.print("\nlist is empty");
       else
        System.out.print("\nbiggest element is : "+b);
        //return int 
    }
    else if (choice==9)
    {
       ob1.removefirst();
       // print
        
    }
    else if (choice==10)
    {
       ob1.removelast();
       //print 
        
    }
    else if (choice==11)
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
    else if (choice==12)
    {
       ob1.reverse();
        
    }
    else if (choice==13)
    {

      int val,pos;
      System.out.print("\nenter element and index : ");
      val=ob.nextInt();
      pos=ob.nextInt();
      ob1.addatindex(pos,val);
      // parameter int , parameter int 
      // print
    }
    else if (choice==14)
    {

      int val,pos;
      System.out.print("\nenter index : ");
      pos=ob.nextInt();
     val=ob1.getatindex(pos);
      if (val==-1)
       System.out.print("\nindex not found ");
       else
       System.out.print("\nindex found value is : "+val);
       //return int 
       //parameter int 
        
    }
    else if (choice==15)
    {

      int pos;
      System.out.print("\nenter index : ");
      pos=ob.nextInt();
      ob1.removeatindex(pos);
      // parameter int
        
    }
    System.out.print("\nwant to continue: true-1 / false-0 : ");
    condition=ob.nextInt();
   }
  }
}