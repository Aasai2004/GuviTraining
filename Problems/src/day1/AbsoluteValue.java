package day1;

import java.util.Scanner;

public class AbsoluteValue {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		System.out.println("Enter the number2 : ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		// abs used to find the difference and it works on with symbols(-). it chance negative value to positive value
		int absolute_value = Math.abs(number1-number2);
		System.out.println(absolute_value + " is absolute value of " +number1 + " and "  +number2 );
		
		scanner.close();
	}
}
