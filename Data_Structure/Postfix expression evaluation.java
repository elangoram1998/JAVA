/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    static int[] array=new int[100];
    static int n=0;
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  int res=0;
	  for(int i=0;i<str.length();i++)
	  {
	      if(Character.isDigit(str.charAt(i)))
	      {
	          push(str.charAt(i)-'0');
	      }
	      else
	      {
	          int val1=pop();
	          int val2=pop();
	          switch(str.charAt(i))
	          {
	              case '+':
	                  res=val1+val2;
	                  break;
	              case '-':
	                  res=val1-val2;
	                  break;
	              case '*':
	                  res=val1*val2;
	                  break;
	              case '/':
	                  res=val1/val2;
	                  break;
	              default:
	                  System.out.println("Invalid expression");
	                  break;
	          }
	          push(res);
	      }
	  }
	  for(int i=n-1;i>=0;i--)
	  {
	      System.out.println(array[i]);
	  }
	}
	  static void push(int data)
	  {
	      array[n]=data;
	      n++;
	  }
	  static int pop()
	  {
	      n--;
	      if(n<0)
	      {
	          return 0;
	      }
	      return array[n];
	  }
}
