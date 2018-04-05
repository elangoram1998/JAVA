package linked_list_ds;
import java.util.Scanner;

public class Linked_List_DS {
    static int[] array=new int[10];
    static int front=-1,rear=-1;
    public static void main(String[] args) {
        int size;
        System.out.println("enter the size:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.println("enter the elements:");
        while(size!=0)
        {
            int a;
            a=sc.nextInt();
            enqueue(a);
            size--;
        }
        dequeue();
        display();
  }
    static void enqueue(int x)
    {
        if(front==-1)
        {
            front++;rear++;
            array[front]=array[rear]=x;
        }
        else
        {
            rear++;
            array[rear]=x;
        }
    }
    static void dequeue()
    {
        if(front<=rear)
        {
             front++;
        }
       else
        {
            System.out.println("underflows");
        }
    }
    static void display()
    {
        int i;
        for(i=front;i<=rear;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
