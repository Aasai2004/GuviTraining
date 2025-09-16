package day7;
import java.util.*;

public class ArrayListOddOrEven {
    public static void main(String[] str) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> evenNum = new ArrayList<Integer>();
        ArrayList<Integer> oddNum = new ArrayList<Integer>();
        
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(35);
        arr.add(40);
        arr.add(55);
        arr.add(60);
        
        for(Integer num : arr) {
            if(num % 2 == 0) {
                evenNum.add(num);
            } else {
                oddNum.add(num);
            }
        }
        System.out.println("Count of Even Numbers: " + evenNum.size());
        System.out.println("Count of Odd Numbers: " + oddNum.size());
    }
}

