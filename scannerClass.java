package dayFour;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {

		int userInput;
		Scanner num = new Scanner (System.in);
		System.out.println (" Enter a number : ");
		userInput = num.nextInt();
		
					
	if (userInput % 3 == 0 && userInput % 5 == 0) {
		System.out.println("Fizz");
		}else if (userInput % 3 == 0) {
			System.out.println("Buzz");
		} else if (userInput % 5 == 0) {
			System.out.println("FizzBuzz");
		}else {
			System.out.println("Invalid");
		}
		System.out.println("Your input was " + userInput);
		if (userInput % 2 == 0)
		{
		System.out.println ( userInput + " is an Even number. ");
		}else 
		{System.out.println (userInput + " is an Odd number. ");
		}
		}
}