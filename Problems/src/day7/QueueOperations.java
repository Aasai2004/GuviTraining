package day7;

import java.util.*;                                                                                                                                                                                                                                                                                                                                                                                                                                       

public class QueueOperations {
	public static void main(String[] str) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("Queue: "+queue);
		int frontElement=queue.peek();
		System.out.println("Front Element: "+frontElement);
		int removedElement=queue.remove();
		System.out.println("Removed Element: "+removedElement);
		boolean isEmpty=queue.isEmpty();
		System.out.println("Is Queue Empty: "+isEmpty);
		int size = queue.size();
		System.out.println("Queue Size: "+size);
		boolean contains20 = queue.contains(20);
		System.out.println("Queue after clear 20 ? "+contains20);
		queue.clear();
		System.out.println("Queue after clear: "+queue);
		
	}

}
