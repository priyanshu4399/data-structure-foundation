package stack;

public class StackArrayImpl {
	int top;
	int cap;
	int[] arr; 
	public StackArrayImpl(int c) {
		top=-1;
		cap=c;
		arr = new int[cap];
	}
	public void push(int data){
		if(top==cap-1) {
			System.out.println("OverFlow Error");
			return;
		}
		arr[++top]=data;
	}       
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return Integer.MAX_VALUE;
		}
		return arr[top];
	}
	public int pop() {
		if(top==-1) {
			System.out.println("UnderFlow Error");
			return Integer.MAX_VALUE;
		}
		return arr[top--];
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void display() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return;
		}
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		StackArrayImpl stack = new StackArrayImpl(5);
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
