package insertfront_ls;

import java.util.Scanner;

class node
{
    int data;
    node next;
    node(int a)
    {
        data=a;
        next=null;
    }
}
public class InsertFront_LS {
static node head,temp;
    public static void main(String[] args) {
        
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        size=sc.nextInt();
        System.out.println("enter the elements:");
        while(size!=0)
        {
            create();
            size--;        
        }
        System.out.println("insert node:");
        insert();
       display(head);
       middle();
       display(head);
       end();
       display(head);
    }
    static void create()
    {
        int a;
        node newnode;
        
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        newnode=new node(a);
        if(head==null)
        {
            head=newnode;
            temp=head;
            
        }
        else
        {
            temp.next=newnode;
            temp=newnode;
        }
    }
    static node insert()
    {
        node newnode;
        newnode=new node(100);
        newnode.next=head;
        head=newnode;
        return head;
    }
    static node middle()
    {
        node newnode,temp=head;
        newnode=new node(100);
        while(temp.data!=30)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        temp=newnode;
        return head;
    }
    static node end()
    {
        node newnode;
        newnode=new node(200);
        node temp1=head;
        while(temp1.next!=null)
        {
            temp1=temp1.next;
        }
        temp1.next=newnode;
        temp1=newnode;
        return head;
    }
    static void display(node temp)
    {
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
    
}
