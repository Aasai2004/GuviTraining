package day1;

import java.util.Scanner;

public class TriangleCalculation {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int a = scanner.nextInt();
		System.out.println("Enter the number 2 :");
		int b = scanner.nextInt();
		System.out.println("Enter the number 3 :");
		int c = scanner.nextInt();
		
		if (a==b && b==c) {
			System.out.println("Equilateral");
			
		}
		else if (a!= b && b!=c) {
			System.out.println("Scalance");
		}
		else {
			System.out.println("Isolance");
		}
		scanner.close();
	}
	

}
