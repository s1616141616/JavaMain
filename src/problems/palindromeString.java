package problems;

public class palindromeString
{
   public static void main(String args[])
   {
	   String original = "racecar", reverse = "";
	      
	   for (int i=original.length()-1;i>=0;i--)
		   reverse = reverse + original.charAt(i);
	 
	   if (original.equalsIgnoreCase(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
   }
}