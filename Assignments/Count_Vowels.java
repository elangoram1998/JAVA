import java.util.Scanner;

public class Vowel_count {

	public static void main(String[] args) {
		String str;
		int i,j,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		str=str.toLowerCase();
		char[] array=str.toCharArray();
		for(i=0;i<str.length()-1;i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(array[i]==array[j])
				{
					array[j]='\n';
				}
			}
		}
		String news=new String(array).toString();
		news = news.replaceAll("\\s+","");
		System.out.println("revised string:"+ news);
		for(i=0;i<str.length();i++)
		{
			if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
