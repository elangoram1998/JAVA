/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] array=str.split(" ");
		String s="";
		for(int i=0;i<array.length;i++)
		{
		StringBuilder sb=new StringBuilder(array[i]);
		sb.reverse();
		s=s+sb+" ";
		}
		System.out.println(s);
	}
}
