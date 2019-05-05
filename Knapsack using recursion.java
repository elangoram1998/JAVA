/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] val=new int[n];
		int[] wt=new int[n];
		for(int i=0;i<n;i++)
		{
		    val[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    wt[i]=sc.nextInt();
		}
		int W=sc.nextInt();
		System.out.println(knapsack(W,val,wt,n));
	}
	static int knapsack(int W,int[] val,int[] wt,int n)
	{
	    if(n==0 || W==0)
	    {
	        return 0;
	    }
	    else if(wt[n-1]>W)
	    {
	        return knapsack(W,val,wt,n-1);
	    }
	    else{
	        return Math.max(val[n-1]+knapsack(W-wt[n-1],val,wt,n-1),knapsack(W,val,wt,n-1));
	    }
	}
}
