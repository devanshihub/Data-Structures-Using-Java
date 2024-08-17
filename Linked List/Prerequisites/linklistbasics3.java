package data_structures_java;

class a
{
    int x;
    a next;
    a (int a)
    {
     x=a;
     next = null;
    }
}
public class linklistbasics3 
{
    public static void main(String k[])
    {
        a start=new a(10);
        start.next=new a(20);
        start.next.next=new a(30);
        start.next.next.next=new a(40);

       a t=start;
       while(t!=null)
       {
        System.out.println(t.x);
        t=t.next;
       }

    }
}
