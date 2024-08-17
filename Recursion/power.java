//package DataStructuresUsingJava-3;
class calc
{
    static int power(int a,int p)
    {
        if(p==0)
        return 1;
        else 
        return a*power(a,p-1);
    }
}
 class sum_of_n_natural_no 
{
    public static void main(String k[])
    {
        int r=calc.power(2,4);
        System.out.println("answer is :"+r);
    }
}