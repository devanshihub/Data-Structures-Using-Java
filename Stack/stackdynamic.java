package data_structures_java_2;
import java.util.Scanner;
class node
{
    int data;
    node next;

    node (int x)
    {
        data=x;
        next=null;
    }
}
class dynamicstack
{
    node top;

    void push(int x)
    {   
          node ptr=new node(x);
           if (top==null)
           top=ptr;
  
           else
           {
              ptr.next=top;
              top=ptr;
           }
    }
    void pop()
    {
        
            if (top==null)
            System.out.print("\nlist is empty");
            else
            {
              top=top.next;
            }
          
    }
    int size()
    {
      int c=0;
      node t=top;
      while(t!=null)
      {
        c++;
        t=t.next;
      }
      return c;
    }
    int peek()
    {
        int val=-1;
        if (top!=null)
        val=top.data;

        return val;
    }

    void disp()
    {
      if (top==null)
      System.out.print("\nlist is empty");

      else 
      {
          System.out.print("\nlist is : ");
          node t=top;
          while(t!=null)
          {
              System.out.print(t.data+" --> ");
              t=t.next;
          }
          System.out.print("NULL");
      }
    }

}

class stackdynamic
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        dynamicstack ob1=new dynamicstack();
        int condition=1;
        while(condition==1)
        {
          int choice;
            System.out.print("\n------------------------------COMMANDS-----------------------------");
            System.out.print("\n----------------ANY ONE OPERATION CAN BE PERFORMED ONLY---------------------");
            System.out.print("\n1.insert-----void push(int x)"); 
            System.out.print("\n2.delete-----  void pop()");   // print
            System.out.print("\n3.get size----- int size()");
            System.out.print("\n4.get first element----- int peek()");
            System.out.print("\n5.display all elements----- void disp()"); //print
            System.out.print("\n--------------------------------------------------------------------");
            System.out.print("\nenter choice : ");
            choice=ob.nextInt();

            if (choice==1)
            {
                System.out.print("\nenter value : ");
                int val=ob.nextInt();
                ob1.push(val);
            }
            else if (choice==2)
            {
                ob1.pop();
            }
            else if (choice==3)
            {
                int s=ob1.size();
                System.out.print("\nsize is  : "+s);
            }
            else if (choice==4)
            {
                int val=ob1.peek();
                if(val==-1)
                System.out.print("\nstack null ");
                else
                System.out.print("\nfirst element is : "+val);
            }
            else if (choice==5)
            {
                ob1.disp();
            }

            System.out.print("\nwant to continue  : 0/false 1/true ");
            condition=ob.nextInt();
        }
    }
}
