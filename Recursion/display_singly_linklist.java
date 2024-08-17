class node
{
    int data;
    node next;

    node(int x)
    {
        data=x;
        next=null;
    }

    static void disp(node start)
        {
            if(start==null)
            return;
            else
            {
                System.out.println(start.data);
                disp(start.next);
            }
        }
}

class main
{
    public static void main(String k[])
    {
       // node start=null;
       node start=new node(1);
        start.next=new node(2);
        start.next.next=new node(3);

        node.disp(start);

        
    }
}