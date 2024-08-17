import java.util.*;
class node
{
    int data;
    node left;
    node right;

    node (int data)
    {
      this.data=data;
    }
     
}

class binary_tree
{
    node root;

    void addnode(int data)
    {
        node newnode=new node(data);
        if (root==null)
        root=newnode;

        else
        {
          node focusnode=root;
          node parent;

          while(true)
          {
            parent=focusnode;

            if(data<focusnode.data)
            {
                focusnode=focusnode.left;
                if(focusnode==null)
                {
                    parent.left=newnode;
                    return;
                }
            }
            else
            {
               focusnode=focusnode.right;
               if(focusnode==null)
               {
                   parent.right=newnode;
                    return;
               }
            }
          }
        }
    }

    void preordertraversal(node focusnode)
    {
        if(focusnode!=null)
        {
            System.out.print(focusnode.data+" ");
            preordertraversal(focusnode.left);
            preordertraversal(focusnode.right);
        }
    }
    void postordertraversal(node focusnode)
    {
        if(focusnode!=null)
        {
            postordertraversal(focusnode.left);
            postordertraversal(focusnode.right);
            System.out.print(focusnode.data+" ");
        }
    }
    void inordertraversal(node focusnode)
    {
        if(focusnode!=null)
        { 
            inordertraversal(focusnode.left);
            System.out.print(focusnode.data+" ");
            inordertraversal(focusnode.right);
        }
    }
}

class main
{
    public static void main(String k[])
    {
        binary_tree tree=new binary_tree();
        tree.addnode(50);
        tree.addnode(25);
        tree.addnode(75);
        tree.addnode(12);
        tree.addnode(37);
        tree.addnode(43);
        tree.addnode(30);

        System.out.print("\npreorder traversal :");
        tree.preordertraversal(tree.root);
        System.out.print("\npostorder traversal :");
        tree.postordertraversal(tree.root);
        System.out.print("\ninorder traversal :");
        tree.inordertraversal(tree.root);
    }
}