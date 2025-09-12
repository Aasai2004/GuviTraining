package day3;

public class RemoveSpaces {
	public static void main(String[] str) {
		String  str1 = "Hello World";
		char[] chr_arr = str1.toCharArray();
		String res = "";
		for(char c:chr_arr){
			if(c != ' ') {
				res=res+c;
			}
		}
		System.out.println("Original String="+str1);
		System.out.println("Without space="+res);
		}
	

}
