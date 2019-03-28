/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    static int[] array=new int[100];
    static int n=0;
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
	  while(true)
	  {
	      switch(sc.nextInt())
	      {
	          case 1:
	              push(sc.nextInt());
	              break;
	          case 2:
	              pop();
	              break;
	          case 3:
	              printStack();
	              break;
	          case 4:
	              isEmpty();
	              break;
	          default:
	              System.exit(0);
	      }
	  }
	}
	static void isEmpty()
	{
	    if(n==0)
	    {
	        System.out.println("Stack is empty");
	    }
	    else{
	        System.out.println("Stack is not empty");
	    }
	}
	static void printStack()
	{
	    for(int i=n-1;i>=0;i--)
	    {
	        System.out.println("| "+array[i]+" |");
	        System.out.println(" ---- ");
	    }
	    System.out.println();
	}
	static void push(int data)
	{
	    array[n]=data;
	    n++;
	    if(n-1>100)
	    {
	        System.out.println("Stack overflows");
	        System.exit(0);
	    }
	}
	static void pop()
	{
	    n--;
	    if(n<0)
	    {
	        System.out.println("Stack underflows");
	        System.exit(0);
	    }
	}
}
