package day1;

import java.util.Scanner;

public class GreaterValue {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		System.out.println("Enter the number2 :");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		if(number1>number2) {
			System.out.println(number1 + " is greater than " +number2);
		}
		else {
			System.out.println(number2 + " is greater than "+number1);
		}
		scanner.close();
	}

}
