/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(str1.length()==str2.length())
		{
		    String str=str1+str1;
		    if(str.contains(str2))
		    {
		        System.out.println("Rotation");
		    }
		    else{
		        System.out.println("Not a Rotation");
		    }
		}
		else{
		    System.out.println("Not a Rotation");
		}
	}
}
