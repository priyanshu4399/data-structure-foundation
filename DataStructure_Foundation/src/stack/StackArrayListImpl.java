package stack;

import java.util.ArrayList;

public class StackArrayListImpl {

	ArrayList<Integer> arr = new ArrayList<>();; 
	
	public void push(int data){
		arr.add(data);;
	}
	
	public int pop() {
		if(arr.size()==0) {
			System.out.println("UnderFlow Error");
			return Integer.MAX_VALUE;
		}
		return arr.remove(arr.size()-1);
	}
	public int peek() {
		if(arr.size()==0) {
			System.out.println("Stack is Empty");
			return Integer.MAX_VALUE;
		}
		return arr.get(arr.size()-1);
	}
	public int size() {
		return arr.size();
	}
	public boolean isEmpty() {
		return arr.size()==0;
	}
	public void display() {
		if(arr.size()==0) {
			System.out.println("Stack is Empty");
			return;
		}
		for(int i=size()-1;i>=0;i--) {
			System.out.println(arr.get(i));
		}
	}
	public static void main(String[] args) {
		StackArrayListImpl stack = new StackArrayListImpl();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack items are : ");
		stack.display();
		System.out.println("Popped item : "+stack.pop());
		System.out.println("Stack items are : ");
		stack.display();
		System.out.println("Item at the top is : "+stack.peek());
		System.out.println("Size : " +stack.size());
		System.out.println("Is stack Empty : "+ stack.isEmpty());
	}

}
