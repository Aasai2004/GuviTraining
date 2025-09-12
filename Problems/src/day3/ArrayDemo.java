package day3;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] str) {
		//method 1 to array declaration
		int[] arr = {5,3,7,2,1};
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++)//normal for loop 
			
		{
			System.out.println("array is : "+ arr[i]);
		}
		// for each loop
		Arrays.sort(arr);
	    for(int i : arr) {
	    	
	    	System.out.println(i);
	    	
	    }
	    
	
	  }
}
