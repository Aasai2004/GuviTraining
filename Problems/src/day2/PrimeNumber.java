package day2;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		if(number<=1) {
			System.out.println(number + " is not prime number");
		}
		else {
			for(int i=2; i<number; i++) {
			     if(number%i==0) {
						
						System.out.println(number +" not prime number");
						break;
					}
					else {
						System.out.println(number +" prime number");
						
					}
				
			}
        
			
		}
		
			
	
		
		scanner.close();
		
	}

}
