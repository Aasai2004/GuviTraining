package day2;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int n = scanner.nextInt();
        
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
