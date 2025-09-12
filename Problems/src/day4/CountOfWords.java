package day4;

import java.util.Arrays;

public class CountOfWords {
	public static void main(String[] str) {
		String strs="Java coding Java";
		String[] words = strs.split("");
	    int n =words.length;
	    System.out.println(n);
	    boolean visited[]=new boolean[n];
	    Arrays.fill(visited, false);
	    int count=0;
	    for(int i=0; i<n; i++) {
	    	count=0;
	    	if(!visited[i]) {
	    		visited[i]=true;
	    		count=count+1;
	    		for(int j=i+1; j<n; j++) {
	    			if(words[i].equals(words[j])) {
	    				visited[j]=true;
	    				count=count+1;
	    			}
	    		
	    		}
	    		System.out.println("count of " +words[i]+"="+count);
	    	}
	    }
	}
}
