public class String_sequence {
	public static void function(String mainstring,String substring)
	{
		if(mainstring.contains(substring))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		function("hello world","hel");
	
	}

}
