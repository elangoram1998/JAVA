/*package whatever //do not write package name here */

import java.util.*;

class node
{
    char data;
    node next;
    node(char a)
    {
        data=a;
        next=null;
    }
}
class GFG {
    static node top;
    static char[] array=new char[10];
    static int n=0;
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  char[] input=str.toCharArray();
	  boolean temp=true;
	  for(int i=0;i<input.length;i++)
	  {
	      if(input[i]!='+'&&input[i]!='-'&&input[i]!='*'&&input[i]!='/'&&input[i]!='('&&input[i]!=')')
	      {
	          array[n]=input[i];
	          n++;
	      }
	      else if(input[i]=='(')
	      {
	          push(input[i]);
	          temp=false;
	      }
	      else if(top==null)
	      {
	          push(input[i]);
	      }
	      else if(input[i]==')')
	      {
	          while(top.data!='(')
	          {
	              array[n]=top.data;
	              n++;
	              pop();
	          }
	          pop();
	          temp=true;
	      }
	      else if(getPre(top.data)<getPre(input[i]) && temp)
	      {
	          push(input[i]);
	      }
	      else if(getPre(top.data)>getPre(input[i]) && temp)
	      {
	          array[n]=top.data;
	          n++;
	          pop();
	          push(input[i]);
	      }
	      else
	      {
	          push(input[i]);
	      }
	  }
	  while(top!=null)
	  {
	      array[n]=top.data;
	      n++;
	      top=top.next;
	  }
	  for(int i=0;i<n;i++)
	  {
	      System.out.print(array[i]);
	  }
	}
	static void push(char ch)
	{
	    node newnode=new node(ch);
	    newnode.next=top;
	    top=newnode;
	}
	static void pop()
	{
	    top=top.next;
	}
	static int getPre(char ch)
	{
	    int value=0;
	    switch(ch)
	    {
	        case '+':
	            value=1;
	            break;
	        case '-':
	            value=1;
	            break;
	        case '*':
	            value=2;
	            break;
	        case '/':
	            value=2;
	            break;
	        case '(':
	            value=3;
	            break;
	        case ')':
	            value=3;
	            break;
	        default:
	            value=5;
	            break;
	    }
	    return value;
	}
}
