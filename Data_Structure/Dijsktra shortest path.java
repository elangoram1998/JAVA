/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] graph=new int[9][9];
		for(int i=0;i<9;i++)
		{
		    for(int j=0;j<9;j++)
		    {
		        graph[i][j]=sc.nextInt();
		    }
		}
		dijsktra(graph,7);
	}
	static void dijsktra(int[][] graph,int src)
	{
	    int[] dist=new int[9];
	    boolean[] spt=new boolean[9];
	    for(int i=0;i<9;i++)
	    {
	        dist[i]=Integer.MAX_VALUE;
	        spt[i]=false;
	    }
	    dist[src]=0;
	    for(int i=0;i<9;i++)
	    {
	        int u=minDist(dist,spt);
	        spt[u]=true;
	        for(int j=0;j<9;j++)
	        {
	            if(graph[u][j]!=0 && dist[j]>dist[u]+graph[u][j] && !spt[j])
	            {
	                dist[j]=dist[u]+graph[u][j];
	            }
	        }
	    }
	    printSol(dist);
	}
	static int minDist(int[] dist,boolean[] spt)
	{
	    int min=Integer.MAX_VALUE;
	    int min_Index=-1;
	    for(int i=0;i<9;i++)
	    {
	        if(dist[i]<min && spt[i]==false)
	        {
	            min=dist[i];
	            min_Index=i;
	        }
	    }
	    return min_Index;
	}
	static void printSol(int[] array)
	{
	    for(int i=0;i<9;i++)
	    {
	        System.out.println(i+" - "+array[i]);
	    }
	}
	
}
