//package DataStructuresUsingJava-3;
class calc
{
    static int sum(int a)
    {
        if(a==1)
        return 1;
        else 
        return a+sum(a-1);
    }
}
 class sum_of_n_natural_no 
{
    public static void main(String k[])
    {
        int r=calc.sum(5);
        System.out.println("sum is :"+r);
    }
}