import java.util.*;
class calc
{
    static void revstring(String a)
    {
        if(a.length()<=1)
        System.out.println(a.charAt(0));
        else
        {
          revstring(a.substring(0,a.length-1));
        }
    }
}
class main
{
    public static void main(String k[])
    {
       // node start=null;
      calc.revstring("home");

        
    }
}