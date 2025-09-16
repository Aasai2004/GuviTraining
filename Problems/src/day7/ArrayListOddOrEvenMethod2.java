package day7;
import java.util.*;

public class ArrayListOddOrEvenMethod2 {
	public static void main(String[]str) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int even = 0;
		int odd = 0;
		
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(35);
        arr.add(40);
        arr.add(55);
        arr.add(60);
        
        
        for(Integer num : arr) {
            if(num % 2 == 0) {
            	even++;

            } else {
                odd++;
            }
        }
        System.out.println("No of even count: "+even);
        System.out.println("No of even count: "+odd);
	}

}
