package day3;

public class RotateArray {
	public static void main(String[] str) {
		int cal=0;
		int[] arr = {1,2,3,4,5};
		int[] arr3 = new int[arr.length];
		int arrayLength = arr.length;
		for(int i = 0 ; i<arr.length; i++) {
		    cal = (arrayLength - arr[i]);
		   
			arr3[i] = cal;
			arrayLength--;
				
			}
	
		for(int i :arr3) {
             
			System.out.println(i);

			
		}
		
			}
		}
	


