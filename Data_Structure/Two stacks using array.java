/*package whatever //do not write package name here */

import java.util.*;

class Stack
{
    int[] array;
    int top1,top2;
    int size;
    Stack(int n)
    {
        top1=-1;
        top2=n;
        size=n;
        array=new int[size];
    }
    void push1(int data)
    {
        if(top1>top2-1)
        {
            System.out.println("Stack overflows");
            System.exit(0);
        }
        else if(top1<top2)
        {
            top1++;
            array[top1]=data;
        }
    }
    void push2(int data)
    {
        if(top2>top1)
        {
            top2--;
            array[top2]=data;
        }
        else
        {
            System.out.println("Stack overflows");
            System.exit(0);
        }
    }
    int pop1()
    {
        if(top1>=0)
        {
            return array[top1--];
        }
        else{
            System.out.println("Stack underflows");
            System.exit(0);
        }
        return 0;
    }
    int pop2()
    {
        if(top2<size)
        {
            return array[top2++];
        }
        else{
            System.out.println("Stack underflows");
            System.exit(0);
        }
        return 0;
    }
}
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Stack s=new Stack(n);
	    s.push1(10);
	    s.push2(20);
	    s.push1(30);
	    s.push2(40);
	    s.push2(50);
	    System.out.println(s.pop1());
	    System.out.println(s.pop2());
	}
}
