package data_structures_java;

class node
{
    int x;
    node next;
    node(int a)
    {
        x=a;
        next=null;
    }
}
class link
{
   node start=null;
   void insert(int p)
   {
     node ptr=new node(p);

     if(start==null)
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
    void disp()
   {
      if (start==null)
      System.out.println("list is empty");

      else
      {
        node t=start;
        while(t!=null)
        {
            System.out.print(t.x+" ");
            t=t.next;
        }
      }
   }
}
public class linklistbasics4 
{
  public static void main(String k[])
  {
    link ob=new link(); 
    ob.disp();
    ob.insert(10);
    ob.insert(20);
    ob.insert(30);
    ob.disp();
  }
        

}

