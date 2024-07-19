package data_structures_java;
class a
{
    int x;
    a next;
}
public class linklistbasics2 
{
    public static void main(String k[])
    {
        // first concept 
        
        a ob1=new a();
        a ob2=new a();
        a ob3=new a();

        ob1.x=10;
        ob2.x=20;
        ob3.x=30;

        ob1.next=ob2;
        ob2.next=ob3;

      System.out.println(ob1.x);
      System.out.println(ob1.next.x);
      System.out.println(ob1.next.next.x);

      System.out.println(ob2.x);
      System.out.println(ob2.next.x);

      System.out.println(ob3.x);
      

      // second concept
      
        a ob1=new a();
        ob1.x=10;
        ob1.next=new a();
        ob1.next.x=20;
        ob1.next.next=new a();
        ob1.next.next.x=30;

        a t=ob1;

        while (t!=null)
        {
            System.out.println(t.x);
            t=t.next;
        }
      
    }
}
