package remove_char;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		String s1;
		String s2;
		String rem ="";
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int i,j,x=0;
		char[] array1=s1.toCharArray();
		char[] array2=s2.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			int count=0;
			for(j=0;j<s2.length();j++)
			{
				if(array1[i]!=array2[j])
				{
					count++;
				}
			}
			if(count==s2.length())
			{
				rem=rem+array1[i];
			}
		}
		System.out.println(rem);

	}

}
