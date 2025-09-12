package day5;

public class LowerBoundBinarySearch {
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {//if  arr[mid]>target is the upperBoundBinarySearch
                right = mid;
            } 
            else {
                left = mid + 1;
            }
        }
        
        return left;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 4, 4, 10, 12,18,20};  
        int target = 4;

        int lb = lowerBound(arr, target);
        System.out.println("Lower bound for " + target + " is at index: " + lb);
    }
}
