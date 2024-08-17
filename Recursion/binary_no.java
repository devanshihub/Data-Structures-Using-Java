class calc
{
    static void bin(int a)
    {
        if (a>0)
        {
            bin(a/2);
            System.out.println(a/2);
        }
    }
}
public class binary_no
{
    public static void main(String k[])
    {
       calc.bin(25);
    }
}