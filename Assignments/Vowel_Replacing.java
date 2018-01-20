import java.util.Scanner;

public class Vowel_Replace {

	public static void main(String[] args) {
		String str;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		char[] array=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u'||array[i]=='A'||array[i]=='E'||array[i]=='I'||array[i]=='O'||array[i]=='U') {
			array[i]='z';	
			}
		}
		System.out.println(array);

	}

}
