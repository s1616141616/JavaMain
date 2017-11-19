package problems;

import java.util.Scanner;

public class Fibonacci1 {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int fib=0;
		int a=0;
		int b=1;
		for (int i=0; i<=n;i++) {
		//while (fib<=n) {
			fib =a+b;
			//if (fib>=n)
				//break;
			System.out.println(fib);
			a=b;
			b=fib;
			}
		}
}