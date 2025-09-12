package day2;

public class ContinuousAlphabet {
    public static void main(String[] args) {
        int rows = 4;
        char currentChar = 'a';
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++; 
            }
            System.out.println();
        }
    }
}
