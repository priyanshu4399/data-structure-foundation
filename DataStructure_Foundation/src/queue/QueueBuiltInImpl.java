package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBuiltInImpl {
	
	public static void main(String[] args) {
		//We can also use ArrayDeque as it also implements Queue Interface
		//Queue<Integer> queue = new ArrayDeque<>();
		Queue<Integer> queue = new LinkedList<>();
		System.out.println("Item inserted : " + queue.offer(10));
		System.out.println("Item inserted : " + queue.offer(20));
		System.out.println("Item inserted : " + queue.offer(30));
		
	    System.out.println(queue);
		System.out.println("Item deleted :"+queue.poll());
		System.out.println(queue);
		System.out.println("Item at the front is : "+queue.peek());
		System.out.println("Size : " +queue.size());
		System.out.println("Is Queue Empty : "+ queue.isEmpty());
		
		//Methods which throw exception when queue is empty
		System.out.println("Item inserted " + queue.add(40));
		System.out.println("Item at the front is " + queue.element());
	}
	
}
