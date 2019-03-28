/*package whatever //do not write package name here */

import java.util.*;

class Stack
{
    int top;
    char[] ch;
    int size;
    Stack(int n)
    {
        size=n;
        top=-1;
        ch=new char[size];
    }
    void push(char c)
    {
        top++;
        if(top>size-1)
        {
            System.out.println("Stack overflows");
        }
        else{
            ch[top]=c;
        }
    }
    char pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflows");
        }
        else{
            return ch[top--];
        }
        return 0;
    }
    boolean isEmpty()
    {
        if(top<0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
class GFG {
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  char[] array=str.toCharArray();
	  Stack s=new Stack(array.length);
	  for(int i=0;i<array.length;i++)
	  {
	      s.push(array[i]);
	  }
	  for(int i=0;i<array.length;i++)
	  {
	      System.out.print(s.pop());
	  }
	 }
}
