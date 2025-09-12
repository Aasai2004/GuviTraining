package day3;

public class PalindromCheck {
	public static void main(String[] str) {
		String s = "radar";
		int len = s.length();
		int left,right;
		left=0;
		right=len-1;
		boolean isPalindrome =true;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				System.out.println(s+" Not palindrome");
				isPalindrome=false;
				break;
			}
			left++;
			right--;
		    if(isPalindrome) {
		    	System.out.println(s+" Is palindrome");
		    	System.out.println();
		    }
			
		}
		
	}

}
