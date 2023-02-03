package deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeBuiltInImpl {
	
	public static void main(String[] args) {
		
		//We could also use ArrayDeque instead of LinkedList as it also implements Deque Interface
		//Deque<Integer> deque = new ArrayDeque<>();
		
		Deque<Integer> deque = new LinkedList<>();
		deque.offerLast(20);
		deque.offerLast(30);
		deque.offerFirst(10);
		System.out.println(deque);
		System.out.println("Deleteing first item : "+deque.pollFirst());
		System.out.println(deque);
		System.out.println("Item at the front is : "+deque.peekFirst());
		System.out.println("Item at the rear is : "+deque.peekLast());
		System.out.println("Size : " +deque.size());
		System.out.println("Deleteing item at last : "+deque.pollLast());
		System.out.println("Deleteing item at last : "+deque.pollLast());
		System.out.println("Is Queue Empty : "+ deque.isEmpty());
		
		//Another set of Methods which throw exception when deque is empty
		Deque<Integer> deque2 = new LinkedList<>();
		
		deque2.addLast(20);
		deque2.addLast(30);
		deque2.addFirst(10);
		System.out.println(deque2);
		System.out.println("Deleting first item : "+deque2.removeFirst());
		System.out.println("Deleting Last item : "+deque2.removeLast());
		System.out.println("Item at the front is : "+deque2.getFirst());
		System.out.println("Item at the Last is : "+deque2.getLast());
	
	}
}
