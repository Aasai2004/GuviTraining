package day1;

import java.util.Scanner;

public class DiscountCalculation {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount = scanner.nextInt();
		if(amount>= 5000) {
			System.out.println(amount-amount*0.2);
		}
		else if (amount>= 2000) {
			System.out.println(amount-amount*0.1);
		}
		else {
			System.out.println(amount);
		}
		scanner.close();
	}

}
