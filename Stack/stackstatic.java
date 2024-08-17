package data_structures_java_2;
import java.util.Scanner;
class staticstack
{
    int st[];
    int size,top;

    staticstack(int n)
    {
        size=n;
        top=-1;
        st=new int[n];
    }
    void push(int x)
    {   
        if(top==size-1)
        {
            System.out.print("\nstack overflow flow cannot insert");
        }
        else 
        {
          top++;
          st[top]=x;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.print("\nstack underflow cannot delete");
        }
        else 
        {
         System.out.print("\ndeleted value : "+st[top]);
          top--;
        }
    }
    int size()
    {
            return top+1;
    }
    void peek()
    {
        if(top==-1)
        System.out.print("\nstack empty");
        else
        System.out.print("\nfirst element data is :"+st[top]);
    }

    void disp()
    {
        if (top==-1)
        System.out.print("\nstack empty");
        else
        {
            System.out.print("\nstack is :");
            for(int i=top;i>=0;i--)
            System.out.print(st[i]+" ");
        }
    }
}

class stackstatic
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        staticstack ob1=new staticstack(5);
        int condition=1;
        while(condition==1)
        {
          int choice;
            System.out.print("\n------------------------------COMMANDS-----------------------------");
            System.out.print("\n----------------ANY ONE OPERATION CAN BE PERFORMED ONLY---------------------");
            System.out.print("\n1.insert-----void push(int x)"); //print
            System.out.print("\n2.delete-----  void pop()");   // print
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
                ob1.peek();
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
