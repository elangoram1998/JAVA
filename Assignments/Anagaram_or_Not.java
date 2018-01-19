import java.util.Arrays;
import java.util.Scanner;

public class Compare_String {

	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1:");
		str1=sc.nextLine();
		System.out.println("enter the string2:");
		str2=sc.nextLine();
		if(str1.replaceAll(" ", "").length()==str2.replaceAll(" ", "").length())
		{
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			char[] array1=str1.toCharArray();
			char[] array2=str2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1,array2))
			{
				System.out.println("Given string is a anagarm");
			}
			else
			{
				System.out.println("not a anagram");
			}
		}
		else
		{
			System.out.println("not a anagram");
		}

	}

}
