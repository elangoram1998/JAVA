/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int mat[][]=new int[3][3];
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            mat[i][j]=sc.nextInt();
	        }
	    }
	    int[][] min=new int[3][3];
	    for(int i=0;i<3;i++)
	    {
	        min[i][0]=1;
	    }
	    for(int i=0;i<3;i++)
	    {
	        min[0][i]=1;
	    }
	    for(int i=1;i<3;i++)
	    {
	        for(int j=1;j<3;j++)
	        {
	            min[i][j]=min[i-1][j]+min[i][j-1];
	        }
	    }
	    System.out.println(min[2][2]);
	}
}
