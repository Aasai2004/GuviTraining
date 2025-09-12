package day3;

public class CountEvenNumber {
	public static void main(String[] str) {
		int[] number = {1,2,3,4,5,6};
		int evenCount=0;
		int oddCount=0;
		for(int i : number) { // for each 
			if(i%2 == 0) {
				evenCount++;
				
			}
			else {
				oddCount++;
			}
		}
		System.out.println(" Number of evencount is : " + evenCount);
		System.out.println(" Number of oddcount is : " + oddCount);
	}

}
