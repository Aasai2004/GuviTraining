package day3;

public class SecondLargestValue {
    public static void main(String[] str) {
        int[] arr = {10, 20, 4, 45, 99};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i : arr) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest && i != firstLargest) {
                secondLargest = i;
            }
        }

        // Print the second largest value after the loop ends
        System.out.println("Second largest value: " + secondLargest);
    }
}
