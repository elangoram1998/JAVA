/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(binary(num));
		System.out.println(octal(num));
		System.out.println(hexaDecimal(num));
	}
	static String binary(int n)
	{
	    String s="";
	    while(n!=0)
	    {
	        int temp=n%2;
	        s=temp+s;
	        n/=2;
	    }
	    return s;
	}
	static String octal(int n)
	{
	    
	    String s="";
	    while(n!=0)
	    {
	        int temp=n%8;
	        s=temp+s;
	        n/=8;
	    }
	    return s;
	}
	static String hexaDecimal(int n)
	{
	    char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	    String s="";
	    while(n!=0)
	    {
	        int temp=n%16;
	        s=hex[temp]+s;
	        n/=16;
	    }
	    return s;
	}
}
