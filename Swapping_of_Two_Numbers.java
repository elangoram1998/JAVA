import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped numbers:" +a+" "+b);
		

	}

}
