package day1;

import java.util.Scanner;

public class ElectricityCalculation {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the units : ");
		int units = scanner.nextInt();
		if(units < 100) {
			System.out.println(units*1.50);
		}
		else if (units>100 && units<=300) {
			System.out.println(units*2.00);
		}
		else {
			System.out.println(units*3.00);
		}
			
		scanner.close();
	}

}
