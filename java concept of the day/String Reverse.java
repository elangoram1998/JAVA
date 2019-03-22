/*package whatever //do not write package name here */

import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
        char[] array=s.toCharArray();
        String str="";
        for(int i=array.length-1;i>=0;i--)
        {
            str=str+array[i];
        }
        System.out.println(str);
        
        int l=0,r=array.length-1;
        while(l<r)
        {
            char temp=array[l];
            array[l]=array[r];
            array[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
        System.out.println();
        
        //recursive method
        System.out.println(reverseString(s));
    }
    static String reverseString(String str)
    {
        if(str.length()==1)
        {
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
}
