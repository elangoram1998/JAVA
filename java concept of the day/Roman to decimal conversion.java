/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    char[] array=str.toCharArray();
	    int[] deci={1000,500,100,50,10,5,1};
	    int[] res=new int[array.length];
	    int len=array.length;
	    for(int i=0;i<len;i++)
	    {
	        res[i]=deci[findRoman(array[i])];
	    }
	    int temp=0;
	    for(int i=0;i<len-1;i++)
	    {
	        if(res[i]>=res[i+1])
	        {
	            temp=temp+res[i];
	        }
	        else{
	            int n=res[i+1]-res[i];
	            temp=temp+n;
	            i++;
	        }
	    }
	    if(res[array.length-2]>res[array.length-1])
	    {
	    temp=temp+res[array.length-1];
	    }
	    System.out.println(temp);
	}
	static int findRoman(char ch)
	{
	    char[] roman={'M','D','C','L','X','V','I'};
	    for(int i=0;i<roman.length;i++)
	    {
	        if(ch==roman[i])
	        {
	            return i;
	        }
	    }
	    return 0;
	}
}
