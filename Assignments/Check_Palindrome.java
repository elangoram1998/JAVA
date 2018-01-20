public class Chech_Palindrome {
	public static void fun(String str1)
	{
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		String str2=sb.toString();
		if(str1.equals(str2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

	public static void main(String[] args) {
		
		fun("nitin");
		}

}
