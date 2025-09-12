package day5;

public class LastOccurance {
	    public static int findLastOccurrence(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;
	        int result = -1; 
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                result = mid;  
	                left = mid + 1; 
	            } 
	            else if (arr[mid] > target) {
	                right = mid - 1;
	            } 
	            else {
	                left = mid + 1;
	            }
	        }

	        return result; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 3, 5, 6, 7, 8, 9};
	        int target = 3;

	        int lastIndex = findLastOccurrence(arr, target);
	        System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
	    }
	}

