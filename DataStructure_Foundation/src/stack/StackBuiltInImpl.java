package stack;

import java.util.ArrayDeque;

public class StackBuiltInImpl {
	public static void main(String[] args) {
		//We can also use Stack class,Its legacy class and recommended to use in mutithreaded env
		//Stack<Integer> stack = new Stack<>();
		
		//We can also use LinkedList
		//LinkedList<Integer> stack = new LinkedList<>();
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
	    System.out.println(stack);
		System.out.println("Item popped :"+stack.pop());
		System.out.println(stack);
		System.out.println("Item at the top is : "+stack.peek());
		System.out.println("Size : " +stack.size());
		System.out.println("Is Stack Empty : "+ stack.isEmpty());
		
		//Methods which throw exception when queue is empty
		
		System.out.println("Item pushed " + stack.add(40));
		//specific to LinkedList and ArrayDeque
		System.out.println("Item at the top is " + stack.element());
	}
}
