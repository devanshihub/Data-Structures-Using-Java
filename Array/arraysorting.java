package data_structures_java_2;
import java.util.Scanner;

class arr
{
   static void bubble_sort(int a[])
   {
    int i,j;
    for( i=0;i<a.length-1;i++)
    {
        for( j=0;j<a.length-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
   }

   static void selection_sort(int a[])
   {
    int i,j,small,pos;
    for( i=0;i<a.length-1;i++)
    {
        small=a[i];
        pos=i;
        for( j=i+1;j<a.length;j++)
        {
            if(a[j]<small)
            {
                small=a[j];
                pos=j;
            }
        }
        a[pos]=a[i];
        a[i]=small;
    }
   }
   static void insertion_sort(int a[])
   {
    int i,j,t;
    for( i=1;i<a.length;i++)
    {
        t=a[i];
        j=i-1;
        while(j>=0 && t<a[j])
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=t;
    }
   }
}
class arraysorting
{
    public static void main(String k[])
    {
         Scanner ob=new Scanner (System.in);
         System.out.print("\nenter size : ");
         int n=ob.nextInt();
         int a[]=new int[n];
         System.out.print("\nenter values : ");
         for(int i=0;i<n;i++)
         {
             a[i]=ob.nextInt();
         }

         int choice;
            System.out.print("\n------------------------------COMMANDS-----------------------------");
            System.out.print("\n----------------ANY ONE OPERATION CAN BE PERFORMED ONLY---------------------");
            System.out.print("\n1.sort using bubble sort-----static void bubble_sort(int a[])"); 
            System.out.print("\n2.sort using selection sort-----static void selection_sort(int a[])");
            System.out.print("\n2.sort using insertion sort-----static void insertion_sort(int a[])");
            System.out.print("\n--------------------------------------------------------------------");
            System.out.print("\nenter choice : ");
            choice=ob.nextInt();

            if (choice==1)
            {
                arr.bubble_sort(a);
            }
            else if (choice==2)
            {
                arr.selection_sort(a);
            }
            else if (choice==3)
            {
                arr.insertion_sort(a);
            }
         System.out.print("\nsorted array : ");
         for(int b:a)
         System.out.print(b+" ");
    }
}