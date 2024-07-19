package data_structures_java;

class a
{
    int x,y;
}

public class linklistbasics1 
{
    public static void main(String k[])
    {
        // first concept
        a ob1=new a();
        a ob2=new a();
        System.out.println(ob1.x);
        System.out.println(ob1.y);
        System.out.println(ob2.x);
        System.out.println(ob2.y);

        ob1.x=10;
        ob1.y=20;
        ob2.x=30;
        ob2.y=40;

        System.out.println(ob1.x);
        System.out.println(ob1.y);
        System.out.println(ob2.x);
        System.out.println(ob2.y);

        // second concept
       a ob3=ob1;
       ob1.x=11;
       ob1.y=22;

        System.out.println(ob1.x);
        System.out.println(ob1.y);
        System.out.println(ob3.x);
        System.out.println(ob3.y);

        ob3.x=99;
        ob3.y=88;

        System.out.println(ob1.x);
        System.out.println(ob1.y);
        System.out.println(ob3.x);
        System.out.println(ob3.y);
        
        //third concept  // error

        a ob4;

       // System.out.println(ob4.x);
       // System.out.println(ob4.y); 
    }
}
