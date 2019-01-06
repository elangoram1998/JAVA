/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

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
class GFG {
    static node head,temp;
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    while(n-- >0)
	    {
	        createNode(sc.nextInt());
	    }
	    addFirst(sc.nextInt());
	    addMiddle(sc.nextInt());
	    addLast(sc.nextInt());
	    deleteFirst();
	    deleteMiddle();
	    deleteLast();
	    printNode(reverseNode(head));
	}
	static void createNode(int data)
	{
	    node newnode=new node(data);
	    if(head==null)
	    {
	        head=newnode;
	        temp=newnode;
	    }
	    else
	    {
	        temp.next=newnode;
	        temp=newnode;
	    }
	}
	static void addFirst(int data)
	{
	    node newnode=new node(data);
	    newnode.next=head;
	    head=newnode;
	}
	static void addMiddle(int data)
	{
	    node temp1=head;
	    node newnode=new node(data);
	    while(temp1.data!=30)
	    {
	        temp1=temp1.next;
	    }
	    newnode.next=temp1.next;
	    temp1.next=newnode;
	}
	static void addLast(int data)
	{
	    node temp1=head;
	    node newnode=new node(data);
	    while(temp1.next!=null)
	    {
	        temp1=temp1.next;
	    }
	    temp1.next=newnode;
	}
	static void deleteFirst()
	{
	    node temp1=head;
	    head=head.next;
	    temp1=null;
	}
	static void deleteMiddle()
	{
	    node temp1=head;
	    node temp2=null;
	    while(temp1.data!=30)
	    {
	        temp2=temp1;
	        temp1=temp1.next;
	    }
	    temp2.next=temp1.next;
	    temp1=null;
	}
	static void deleteLast()
	{
	    node temp1=head;
	    node temp2=null;
	    while(temp1.next!=null)
	    {
	        temp2=temp1;
	        temp1=temp1.next;
	    }
	    temp2.next=null;
	    temp1=null;
	}
	static node reverseNode(node temp1)
	{
	    node prev=null;
	    node curr=temp1;
	    node nex=null;
	    while(curr!=null)
	    {
	        nex=curr.next;
	        curr.next=prev;
	        prev=curr;
	        curr=nex;
	    }
	    return prev;
	}
	static void printNode(node temp1)
	{
	    while(temp1!=null)
	    {
	        System.out.print(temp1.data+" ");
	        temp1=temp1.next;
	    }
	}
}
