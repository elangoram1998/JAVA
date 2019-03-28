/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    static int[] array=new int[100];
    static int top=-1;
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  int res=0;
	  for(int i=0;i<str.length();i++)
	  {
	      if(str.charAt(i)==' ')
	      {
	          continue;
	      }
	      else if(Character.isDigit(str.charAt(i)))
	      {
	          int n=0;
	          while(Character.isDigit(str.charAt(i)))
	          {
	              n=n*10+str.charAt(i)-'0';
	              i++;
	          }
	          i--;
	          push(n);
	      }
	      else
	      {
	          int val1=pop();
	          int val2=pop();
	          switch(str.charAt(i))
	          {
	              case '+':
	                  res=val2+val1;
	                  break;
	              case '-':
	                  res=val2-val1;
	                  break;
	              case '*':
	                  res=val2*val1;
	                  break;
	              case '/':
	                  res=val2/val1;
	                  break;
	              default:
	                  System.out.println("Invalid expression");
	                  break;
	          }
	          push(res);
	      }
	  }
	      System.out.println(pop());
	}
	  static void push(int data)
	  {
	      top++;
	      array[top]=data;
	  }
	  static int pop()
	  {
	      return array[top--];
	  }
}
