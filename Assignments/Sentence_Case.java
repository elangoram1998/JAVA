import java.util.Scanner;

public class FirstChar_Case {

	public static void main(String[] args) {
		String str;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		str=str.toLowerCase();
		String[] array=str.split(" ");
		for(i=0;i<array.length;i++)
		{
           char fUpper = Character.toUpperCase(array[i].charAt(0));
		   array[i]=array[i].replace(array[i].charAt(0), fUpper);
		   System.out.print(array[i]+" ");
		}
		}

}
