/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[6];
		for(int i=0;i<6;i++)
		{
		    array[i]=sc.nextInt();
		}
		int firstLarge,secondLarge;
		if(array[0]>array[1])
		{
		    firstLarge=array[0];
		    secondLarge=array[1];
		}
		else{
		    firstLarge=array[1];
		    secondLarge=array[0];
		}
		for(int i=2;i<6;i++)
		{
		    if(array[i]>firstLarge)
		    {
		        secondLarge=firstLarge;
		        firstLarge=array[i];
		    }
		    else if(array[i]<firstLarge && array[i]>secondLarge)
		    {
		        secondLarge=array[i];
		    }
		}
		System.out.println(secondLarge);
	}
}
