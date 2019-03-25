/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char[] array=s.toCharArray();
	    int res=0,temp=0;
	    for(int i=array.length-1;i>=0;i--)
	    {
	        int n=searchNum(array[i]);
	        res=res+((int)Math.pow(16,temp)*n);
	        temp++;
	    }
	    System.out.println(res);
	}
	static int searchNum(char ch)
	{
	    char[] array={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	    for(int i=0;i<16;i++)
	    {
	        if(array[i]==ch)
	        {
	            return i;
	        }
	    }
	    return 0;
	}
}
