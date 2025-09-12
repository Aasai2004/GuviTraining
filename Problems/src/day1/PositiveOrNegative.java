package day1;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int sc = scanner.nextInt();
		if (sc < 10) {
			System.out.println("single digit");
		}
		else if (sc <= 10 && sc >100){
			System.out.println("double digit");
			
		}
		else if (sc <= 100 && sc >1000){
			System.out.println("three digit");
			
		}
		else {
			System.out.println("out of range");
		}
		scanner.close();


	}


	


}
