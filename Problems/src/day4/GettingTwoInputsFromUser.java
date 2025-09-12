package day4;

import java.util.Scanner;

public class GettingTwoInputsFromUser {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Getting two input : ");
		int input1 =scanner.nextInt();
		int input2=scanner.nextInt();
		System.out.println(input1+ "  "+input2);
		scanner.close();

		
}

	
}
