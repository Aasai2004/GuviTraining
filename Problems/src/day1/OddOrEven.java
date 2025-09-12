package day1;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		if (number%2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		scanner.close();
	}

}
