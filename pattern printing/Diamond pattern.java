/*package whatever //do not write package name here */

import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=n;i>0;i--)
       {
           for(int j=0;j<i;j++)
           {
               System.out.print(" ");
           }
           for(int k=i;k<=n;k++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
