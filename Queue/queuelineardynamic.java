package data_structures_java_2;
import java.util.Scanner;
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
class dynamicqueue
{
    node front=null;
    node rear=null;

    void enqueue(int x)
    {
        node ptr=new node(x);
        if(front==null)
        {
            front=ptr;
            rear=ptr;
        }
        else 
        {
          rear.next=ptr;
          rear=ptr;
        }
    }
    void dequeue()
    {
        if(front==null)
        System.out.print("\nstack under flow cannot delete");
        else
        {
            System.out.print("\ndeleted value "+front.data);
            front=front.next;
        }
    }
    int size()
    {
        int size=0;
        node t=front;
        while(t!=null)
            {
                size++;
                t=t.next;
            }
            return size;
    }
    void peek()
    {
        if(front==null)
        System.out.print("\nstack empty");
        else
        System.out.print("\nfirst element data is :"+front.data);
    }

    void disp()
    {
        if (front==null)
        System.out.print("\nstack empty");
        else
        {
            node t=front;
            System.out.print("\nstack is :");
            while(t!=null)
            {
                System.out.print(t.data+" ");
                t=t.next;
            }
        }
    }
}

class queuelineardynamic
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        dynamicqueue ob1=new dynamicqueue();
        int condition=1;
        while(condition==1)
        {
          int choice;
            System.out.print("\n------------------------------COMMANDS-----------------------------");
            System.out.print("\n----------------ANY ONE OPERATION CAN BE PERFORMED ONLY---------------------");
            System.out.print("\n1.insert-----void enqueue(int x)"); 
            System.out.print("\n2.delete-----void dequeue()");   // print
            System.out.print("\n3.get size----- int size()");
            System.out.print("\n4.get first element----- void peek()");//print
            System.out.print("\n5.get size----- void disp()"); //print
            System.out.print("\n--------------------------------------------------------------------");
            System.out.print("\nenter choice : ");
            choice=ob.nextInt();

            if (choice==1)
            {
                System.out.print("\nenter value : ");
                int val=ob.nextInt();
                ob1.enqueue(val);
            }
            else if (choice==2)
            {
                ob1.dequeue();
            }
            else if (choice==3)
            {
                int s=ob1.size();
                System.out.print("\nsize is  : "+s);
            }
            else if (choice==4)
            {
                ob1.peek();
            }
            else if (choice==5)
            {
                ob1.disp();
            }

            System.out.print("\n]want to continue  : 0/false 1/true ");
            condition=ob.nextInt();
        }
    }
}