package problems;

public class StringSub
{

	public static void main(String[] args)
	{
		
	String Str = new String("SaifulIslam");

	System.out.println(Str.charAt(4));
	
	System.out.println(Str.substring(6,10) );

	System.out.println(Str.charAt(Str.length()-1) );
	System.out.println(Str.lastIndexOf("SaifulIslam"));
	System.out.println(Str.indexOf("i"));

	}
}