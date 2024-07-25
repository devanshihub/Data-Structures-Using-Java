package data_structures_java;
import java.util.*;
class node 
{
 int data;
 node pre,next;

 node(int x)
 {
    data=x;
    pre=null;
    next=null;
 }
}
class dlinklist
{
    node start=null;

    void f_disp()
    {
       if (start==null)
       System.out.print("\nlist is empty");
       else
       {
         node t=start;
         System.out.print("\nlist is :");
         while(t!=null)
         {
            System.out.print(t.data+" ");
            t=t.next;
         }
       }
    }

    void b_disp()
    {
       if (start==null)
       System.out.print("\nlist is empty");
       else
       {
         node t=start;
         while(t.next!=null)
            t=t.next;

          System.out.print("\nlist is :");
           while(t!=null)
            {
               System.out.print(t.data+" ");
               t=t.pre;
            }
       }
    }

    void add_last(int x)
    {
       node ptr=new node(x);
       if (start==null)
       start=ptr;
       else
       {
          node t=start;
          while(t.next!=null)
           t=t.next;

          t.next=ptr;
          ptr.pre=t;
       }
    }

    void add_first(int x)
    {
       node ptr=new node(x);
       if (start==null)
       start=ptr;
       else
       {
          ptr.next=start;
          start.pre=ptr;
          start=ptr;
       }
    }

    void addatindex(int p,int x)
      {
        if(p<0 || p>count())
        System.out.print("\ncan not add at given index");

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
          ptr.next.pre=ptr;
          t.next=ptr;
          ptr.pre=t;
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
            s=s+t.data;
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

    //print 
    void removefirst()
    {
      if (start==null)
      System.out.print("\nlist is empty");
      else if (start.next==null)
      start=null;
      else
      {
        start=start.next;
        start.pre=null;
      }
    }

    // print
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

  
    // return int
    int  getfirst()
    {
      int val=-1;
      if (start!=null)
      val=start.data;

      return val;
    }

    // return int
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
        System.out.print("\ncan not remove at given index");

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
          t.next.pre=t;
        }
      }



}

public class doublylinklist
{
   public static void main(String k[])
 {
  Scanner ob=new Scanner (System.in);
    dlinklist ob1=new dlinklist();
    int condition=1;
    while(condition==1)
    {
      System.out.print("\n--------------------COMMANDS--------------------");
      System.out.print("\n1. display elements in forward way-----void f_disp()");        // print
      System.out.print("\n2. display elements in backward way-----void b_disp()");       // print
      System.out.print("\n3. add node at first-----void add_first(int x)");              //parameter int 
      System.out.print("\n4. add node at last-----void add_last(int x)");                //parameter int 
      System.out.print("\n5. to add a node at a index-----void addatindex(int p,int x)");// parameter int ,parameter int , print
      System.out.print("\n6. to count no of nodes-----int count()");                     // return int
      System.out.print("\n7. to get sum of all nodes data-----int sum()");               // return int
      System.out.print("\n8. get biggest element-----int big()");                        // return int
      System.out.print("\n9. remove first element-----void removefirst()");              // print
      System.out.print("\n10. to remove last element-----void removelast()");            // print
      System.out.print("\n11. to get index of an element-----int search(int item)");     //parameter int ,return int 
      System.out.print("\n12. to get first element-----int getfirst()");                 // return int 
      System.out.print("\n13. to get last element-----int getlast()");                   // return int 
      System.out.print("\n14. get element at a index -----int getatindex(int p)");       //parameter int ,return int
      System.out.print("\n15. remove at index-----void removeatindex(int p)");           //parameter int ,print
      System.out.print("\n-----------------------END----------------------");
      System.out.print("\nenter your choice : ");
      int choice=ob.nextInt();

    if (choice==1)
    {
        ob1.f_disp();
    }
    else if (choice==2)
    {
        ob1.b_disp();
    }
    else if (choice==3)
    {
        System.out.print("\nenter value :");
      int val=ob.nextInt();
       ob1.add_first(val);
    }
    else if (choice==4)
    {
        System.out.print("\nenter value to be added : ");
        int val=ob.nextInt();
        ob1.add_last(val);
    }

    else if (choice==5)
    {
        int val,pos;
        System.out.print("\nenter element and index : ");
        val=ob.nextInt();
        pos=ob.nextInt();
        ob1.addatindex(pos,val);
        // parameter int , parameter int 
        // print
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
       
    int val=ob1.getfirst();
    if (val==-1)
    System.out.print("\nlist is empty");
    else
    System.out.print("\nvalue of first node is :"+val);
        
    }
    else if (choice==13)
    {
        int val=ob1.getlast();
        if (val==-1)
        System.out.print("\nlist is empty");
        else
        System.out.print("\nvalue of last node is :"+val);
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
