package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueArrayDequeuImpl {
	public static void main(String[] args) {
		//Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q1 = new ArrayDeque<>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		System.out.println(q1.size());
		System.out.println(q1.isEmpty());
		System.out.println(q1);
		System.out.println(q1.peek());
		//remove
		System.out.println(q1.poll());
		System.out.println(q1);
		
		
		//Counter methods which throws Exception
		Queue<Integer> q2 = new ArrayDeque<>();
		q2.add(60);
		q2.add(70);
		q2.add(80);
		System.out.println(q2);
		//Throws NoSuchElementException - if this queue is empty
		System.out.println(q2.element());
		//Throws NoSuchElementException - if this queue is empty
		System.out.println(q2.remove());
		System.out.println(q2);
	}
}
