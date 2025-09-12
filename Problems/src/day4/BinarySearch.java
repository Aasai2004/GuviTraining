package day4;

public class BinarySearch {
	public static void main(String[] str) {
		int[] arr = {1,2,3,4,5};
		int key = 2;
		int left = 0;
		int right = arr.length-1;
		for(int i=0; i<arr.length-1; i++) {
			int mid =  left+(right-left)/2;
			if(arr[mid]  == key ) {
				System.out.println(mid);
				break;
			}
			else if(key>arr[mid]) {
				right = mid-1;
				if(key==arr[right]) {
					System.out.println(arr[right]);
					break;
				}

			}
			else if(key<arr[mid]) {
				left = mid+1;
				if(key==arr[left]) {
					System.out.println(arr[left]);
					break;
				}

			}
		}
	}

}
