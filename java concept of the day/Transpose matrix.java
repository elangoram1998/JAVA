/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		int[][] transpose=new int[col][row];
		for(int i=0;i<col;i++)
		{
		    for(int j=0;j<row;j++)
		    {
		        transpose[i][j]=mat[j][i];
		    }
		}
		for(int i=0;i<col;i++)
		{
		    for(int j=0;j<row;j++)
		    {
		        System.out.print(transpose[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
