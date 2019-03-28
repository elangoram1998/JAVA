/*package whatever //do not write package name here */

import java.util.*;

class Stack
{
    char[] array=new char[100];
    int top=-1;
    void push(char ch)
    {
        if(top>99)
        {
            System.out.println("Stack overflows");
        }
        else{
        top++;
        array[top]=ch;
        }
    }
    char pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflows");
        }
        else{
            return array[top--];
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
	    if(checkBalance(array))
	    {
	        System.out.println("Balanced");
	    }
	    else{
	        System.out.println("Not Balanced");
	    }
	}
	static boolean checkBalance(char[] array)
	{
	    Stack s=new Stack();
	    for(int i=0;i<array.length;i++)
	    {
	        if(array[i]=='{'||array[i]=='['||array[i]=='(')
	        {
	            s.push(array[i]);
	        }
	        else if(array[i]=='}'||array[i]==']'||array[i]==')')
	        {
	            char ch=s.pop();
	            if(!checkPair(ch,array[i]))
	            {
	                return false;
	            }
	        }
	        else{
	            return false;
	        }
	    }
	    if(s.isEmpty())
	    {
	        return true;
	    }
	    else{
	        return false;
	    }
	}
	static boolean checkPair(char c1,char c2)
	{
	    if(c1=='{'&&c2=='}')
	    {
	        return true;
	    }
	    else if(c1=='['&&c2==']')
	    {
	        return true;
	    }
	    else if(c1=='('&&c2==')')
	    {
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
