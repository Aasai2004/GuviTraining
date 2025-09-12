package day1;

import java.util.Scanner;

public class MovieTicket {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = scanner.nextInt();
		if(age<12) {
			System.out.println("The ticket price is 100");
		}
		else if(age>=12 && age<=59) {
			System.out.println("The ticket price is 200");
			
		}
		else {
			System.out.println("The ticket price is 150");
		}
		
		
		
		
		
		
		scanner.close();
	}

}
