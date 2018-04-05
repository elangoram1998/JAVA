package binary_search_tree_ds;

import java.util.Scanner;
class node
{
    int data;
    node left,right;
    node(int a)
    {
        data=a;
        right=null;
        left=null;
    }
}
public class Binary_Search_Tree_DS {
static node root;
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the root node:");
        int r=sc.nextInt();
        root=new node(r);
        root.left=null;
        root.right=null;
        System.out.println("enter the no of child nodes:");
        int x=sc.nextInt();
        System.out.println("enter the data:\n");
        while(x!=0)
        {
            int a=sc.nextInt();
            insert(root,a);
            x--;
        }
        System.out.println("preorder:");preorder(root);System.out.println();
        System.out.println("inorder:");inorder(root);System.out.println();
        System.out.println("postorder:");postorder(root);
    }
    static void insert(node temp,int data)
    {
        node newnode;
        newnode=new node(data);
        newnode.left=null;
        newnode.right=null;
        if(temp.data>=data && temp.left!=null)
        {
            insert(temp.left,data);
        }
        else if(temp.data<=data && temp.right!=null)
        {
            insert(temp.right,data);
        }
        if(temp.data>=data && temp.left==null)
        {
            temp.left=newnode;
        }
        else if(temp.data<=data && temp.right==null)
        {
            temp.right=newnode;
        }
    }
    static void preorder(node temp1)
    {
        if(temp1==null)
        {
            return;
        }
        System.out.print(temp1.data+" ");
        preorder(temp1.left);
        preorder(temp1.right);
    }
    static  void inorder(node temp2)
    {
        if(temp2==null)
        {
            return;
        }
        inorder(temp2.left);
        System.out.print(temp2.data+" ");
        inorder(temp2.right);
    }
    static void postorder(node temp3)
    {
        if(temp3==null)
        {
            return;
        }
        postorder(temp3.left);
        postorder(temp3.right);
        System.out.print(temp3.data+" ");
    }
}
