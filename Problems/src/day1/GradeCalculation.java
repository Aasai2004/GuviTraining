package day1;
import java.util.Scanner;
public class GradeCalculation {
	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		if(number >= 90) {
			System.out.println("A");
			
		}
		else if(number>80 && number<89) {
			System.out.println("B");
			
		}
		else if(number>70 && number<79) {
			System.out.println("C");
		}
		else {
			System.out.println("Fail");
		}
		scanner.close();

	}

}
