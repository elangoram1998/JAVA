import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped numbers:" +a+" "+b);
		

	}

}
