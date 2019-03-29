/*package whatever //do not write package name here */

import java.util.*;

class Queue
{
    int data;
    Queue next;
    Queue(int a)
    {
        data=a;
        next=null;
    }
}
class GFG {
    static Queue front,rear;
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    while(true)
	    {
	        switch(sc.nextInt())
	        {
	            case 1:
	                enQueue(sc.nextInt());
	                break;
	            case 2:
	                System.out.println(deQueue());
	                break;
	            case 3:
	                display();
	                break;
	            case 4:
	                if(isEmpty())
	                {
	                    System.out.println("Queue is empty");
	                }
	                else
	                {
	                    System.out.println("Queue is not empty");
	                }
	                break;
	            default:
	                System.exit(0);
	        }
	    }
	}
	static void enQueue(int data)
	{
	    Queue newnode=new Queue(data);
	    if(front==null)
	    {
	        front=newnode;
	        rear=newnode;
	    }
	    else{
	        rear.next=newnode;
	        rear=newnode;
	    }
	}
	static int deQueue()
	{
	    if(front!=null)
	    {
	    int n=front.data;
	    front=front.next;
	    return n;
	    }
	    else{
	        System.out.println("Underflows");
	        System.exit(0);
	    }
	    return 0;
	}
	static boolean isEmpty()
	{
	    if(front==null)
	    {
	        return true;
	    }
	    else{
	        return false;
	    }
	}
	static void display()
	{
	    Queue temp=front;
	    while(temp!=null)
	    {
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	    System.out.println();
	}
}
