package day2;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        int num = 1;  
        for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");  
                num++; 
            }
            System.out.println();
        }
        scanner.close();
    }
}
