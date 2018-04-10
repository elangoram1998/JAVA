package mypackage;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in); 
		str=sc.nextLine();
		while(true)
		{
			int x;
			x=sc.nextInt();
			switch(x)
			{
			case 1:
				inbuild(str);
				break;
			case 2:
				chararray(str);
				break;
			case 3:
				String S=recursion(str);
				System.out.println(S);
				break;
			case 4:
				StartEnd(str);
				break;
			case 5:
				System.exit(0);
			}
		}
	}
	static void inbuild(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
	}
	static void chararray(String str)
	{
		char[] array=str.toCharArray();
		String s="";
		for(int i=array.length-1;i>=0;i--)
		{
			s=s+array[i];
		}
		s=s.toString();
		System.out.println(s);
	}
	static void StartEnd(String str)
	{
		int start,end,i;
		char[] array=str.toCharArray();
		start=0;
		end=str.length()-1;
		while(start<end)
		{
				char temp=array[start];
				array[start]=array[end];
				array[end]=temp;
			start++;
			end--;
		}
		System.out.println(array);
	}
	static String recursion(String str)
	{
		if(str==null||str.length()<=1)
		{
			return str;
		}
		return recursion(str.substring(1))+str.charAt(0);
	}

}
