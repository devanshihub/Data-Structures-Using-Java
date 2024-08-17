import java.lang.*;
import java.util.*;

class array_imp
{
   int root=0;
   String str[]=new String [10];

    void Root(String key)
   {
    str[0]=key;
   }
   void set_Left(String key,int root)
   {
     int t=(root*2)+1;

     if (str[root]==null)
     {
        System.out.printf("Can't set child at %d, no parent found\n",
				t);
     }
     else
     str[t]=key;
   }

   void set_Right(String key,int root)
   {
     int t=(root*2)+2;

     if (str[root]==null)
     {
        System.out.printf("Can't set child at %d, no parent found\n",
				t);
     }
     else
     str[t]=key;
   }

    void print_Tree()
	{

		for (int i = 0; i < 10; i++) 
        {
			if (str[i] != null)
				System.out.print(str[i]);
			else
				System.out.print("-");
		}
	}
}

class mainclass
{

	public static void main(String[] args)
	{

		array_imp obj = new array_imp();

		obj.Root("A");
		obj.set_Left("B", 0);
		obj.set_Right("C", 0);
		obj.set_Left("D", 1);
		obj.set_Right("E", 1);
		obj.set_Right("G", 2);
		obj.print_Tree();
	}
}

