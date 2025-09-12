package day1;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number1 : ");
		int a = scanner.nextInt();
		
		System.out.println("Enter the number2 : ");
		int b = scanner.nextInt();
		
		System.out.println("Enter the number3 : ");
		int c = scanner.nextInt();
		
		if (a>b) {
			if(a>c) {
				System.out.println("a is greater");
				
			}
			else {
				System.out.println("c is greater");
			}
			
		}
	
		else if (b>a) {
			if(b>c) {
				System.out.println("b is greater");
				
			}
			else {
				System.out.println("c is greater");
			}
			
		}
		scanner.close();
	}

}
