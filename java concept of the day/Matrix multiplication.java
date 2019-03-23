/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat1=new int[row][col];
		int[][] mat2=new int[row][col];
	//	int[][] sum=new int[row][col];
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        mat1[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        mat2[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        int temp=0;
		        for(int k=0;k<row;k++)
		        {
		            temp=temp+(mat1[i][k]*mat2[k][j]);
		        }
		        System.out.print(temp+" ");
		    }
		    System.out.println();
		}
	}
}
