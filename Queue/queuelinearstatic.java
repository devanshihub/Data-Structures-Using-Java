package data_structures_java_2;
import java.util.Scanner;
class aqueue
{
    int a[];
    int front,rear;
    int size;
    aqueue(int n)
    {
        size=n;
        front=-1;
        rear=-1;
        a=new int[size];
    }
    void enqueue(int x)
    {
        if(rear==size-1)
        System.out.print("\nStack overflow cannot insert more");
        else
        {
           if(front==-1)
           {
              front=0;
              rear=0;
           }
           else
           rear++;

           a[rear]=x;
        }
    }
    void dequeue()
    {
        if(rear==-1)
        System.out.print("\nstack underflow cannot remove");
        else
        {
            System.out.print("\ndeleted value "+a[front]);
            front++;
        }
    }
    int size()
    {
        return rear+1;
    }
    void peek()
    {
        if(front==-1)
        System.out.print("\nstack empty");
        else
        System.out.print("\nfirst element data is :"+a[front]);
    }

    void disp()
    {
        if (front==-1)
        System.out.print("\nstack empty");
        else
        {
            System.out.print("\nstack is :");
          for(int i=front;i<=rear;i++)
          System.out.print(a[i]+" ");
        }
    }
}

class queuelinearstatic
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        aqueue ob1=new aqueue(5);
        int condition=1;
        while(condition==1)
        {
          int choice;
            System.out.print("\n------------------------------COMMANDS-----------------------------");
            System.out.print("\n----------------ANY ONE OPERATION CAN BE PERFORMED ONLY---------------------");
            System.out.print("\n1.insert-----void enqueue(int x)"); //print
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