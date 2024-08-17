//package DataStructuresUsingJava-3;
class calc
{
    static int rev(int a)
    {
        int rev=0;
        if(a>0)
        {
            rev=rev*10+a%10;
            rev(a/10);
        }
        else
        {
            return rev;
        }
    }
}
class main 
{
    public static void main(String k[])
    {
        int r=calc.reverse(123);
        System.out.println("answer is :"+r);
    }
}