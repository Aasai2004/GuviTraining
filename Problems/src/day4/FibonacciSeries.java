package day4;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] str) {
		int f1=-1;
		int f2=1,f3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			f3=f1+f2;
			System.out.print(f3 + " ");
			f1=f2;
			f2=f3;
			
		}
		sc.close();		

	}

}
