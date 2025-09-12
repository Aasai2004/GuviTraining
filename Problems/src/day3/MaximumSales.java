package day3;

public class MaximumSales {
	public static void main(String[] str) {
		int[] sales = {120,340,560,230,999};
		int maxValue = Integer.MIN_VALUE;
		for(int i=0; i<sales.length;i++) {
			if(sales[i]>maxValue) {
				maxValue = sales[i];
			}
		
		}
		System.out.println(maxValue);
	}

}
