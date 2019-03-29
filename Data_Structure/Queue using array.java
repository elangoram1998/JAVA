/*package whatever //do not write package name here */

import java.util.*;

class Queue
{
    int size;
    int[] array;
    int front,rear;
    Queue(int data)
    {
        size=data;
        array=new int[size];
        front=-1;
        rear=-1;
    }
    boolean isEmpty()
    {
        if((front<0 &&rear<0)||(front>rear))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void enQueue(int data)
    {
        if(front==-1&&rear==-1)
        {
            front++;
            rear++;
            array[front]=data;
        }
        else{
            rear++;
            if(rear>size-1)
            {
                System.out.println("Overflows");
                System.exit(0);
            }
            array[rear]=data;
        }
    }
    void deQueue()
    {
        if(front<=rear)
        {
            front++;
        }
        else
        {
            System.out.println("underflows");
            System.exit(0);
        }
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print("|"+array[i]+"|");
        }
        System.out.println();
    }
}
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Queue q=new Queue(n);
	    while(true)
	    {
	        switch(sc.nextInt())
	        {
	            case 1:
	                q.enQueue(sc.nextInt());
	                break;
	            case 2:
	                q.deQueue();
	                break;
	            case 3:
	                q.display();
	                break;
	            case 4:
	                if(q.isEmpty())
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
}
