package queue;

import java.util.Queue;
import java.util.LinkedList;

public class CollectionsExample {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Ana");
		queue.offer("Kevin");
		queue.offer("Joe");
		
		System.out.println("Peek(head): " + queue.peek());
		System.out.println(queue.size());
		
		while (!queue.isEmpty()) {
			String item = queue.poll();
			System.out.println("Item: " + item);
		}
		
//		for (String s: queue) {
//			System.out.println(s);
//		}
	}
}
