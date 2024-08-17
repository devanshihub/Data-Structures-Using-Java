//package DataStructuresUsingJava-3;
class calc
{
    static int sum(int a)
    {
        if(a<10)
        return a;
        else 
        return a%10+sum(a/10);
    }
}
 class main
{
    public static void main(String k[])
    {
        int r=calc.sum(254);
        System.out.println("answer is :"+r);
    }
}
